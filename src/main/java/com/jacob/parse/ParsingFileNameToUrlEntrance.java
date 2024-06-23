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

    private static final String END_LINE
            = "-------------------------------------------END LINE-------------------------------------------";

    /**
     * Don't let anyone instantiate this class
     */
    private ParsingFileNameToUrlEntrance() {
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
        System.out.print("Please enter your filename: ");
        while ((line = in.readLine()) != null) {
            String retUrl = CommonEnter.parseFileName(line);
            if (retUrl.isBlank()) {
                System.out.println("Access code invalid, please try again.");
                endLinePrint();
                getFilename();
            } else {
                openBrowser(retUrl);
            }
        }
    }

    /**
     * 支持解析以后直接通过浏览器来打开
     */
    private static void openUriByBrowser(String out) throws Exception {
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

    private static void openBrowser(String retUrl) throws Exception {
        try {
            System.out.println(retUrl);
            openUriByBrowser(retUrl);
        } catch (Exception e) {
            System.out.println("解析失败，请检查输入是否有误");
            getFilename();
        }
        endLinePrint();
        getFilename();
    }
}
