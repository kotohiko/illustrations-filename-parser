package com.jacob.parse;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Entrance of parsing filename to URL.
 *
 * @author Jacob Suen
 * @since Oct 2, 2023
 */
public final class ParsingFileNameToUrlEntrance {

    private static final String START_LINE
            = "------------------------------------------START LINE------------------------------------------";
    private static final String END_LINE
            = "-------------------------------------------END LINE-------------------------------------------\n";

    /**
     * Don't let anyone instantiate this class
     */
    private ParsingFileNameToUrlEntrance() {
    }

    private static void startLinePrint() {
        System.out.println(START_LINE);
    }

    private static void endLinePrint() {
        System.out.println(END_LINE);
    }

    /**
     * 交互逻辑
     *
     * @throws IOException I/O exception
     */
    public static void getFilename() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        startLinePrint();
        System.out.print("Please enter your filename: ");
        while ((line = in.readLine()) != null) {
            String retUrl = CommonEnter.parseFileName(line);
            if (retUrl.isBlank()) {
                System.out.println("解析URL为空，请检查输入是否正常。");
                endLinePrint();
                getFilename();
            } else {
                openUriByBrowser(retUrl);
            }
        }
    }

    /**
     * 支持解析以后直接通过浏览器来打开
     */
    private static void openUriByBrowser(String out) throws Exception {
        System.out.println(out);
        Desktop desktop = Desktop.getDesktop();
        URI uri = null;
        try {
            uri = new URI(out);
        } catch (URISyntaxException e) {
            System.out.println("解析失败，请检查输入是否有误");
            getFilename();
        }
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            System.out.println("解析失败，请检查输入是否有误");
            getFilename();
        }
    }
}
