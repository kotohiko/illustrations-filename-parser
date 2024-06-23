package com.jacob.parse;

import com.jacob.parse.core.FilenameParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Get input data from console/front-end.
 */
public final class CommonEnter {

    /**
     * Don't let anyone instantiate this class
     */
    private CommonEnter() {
    }

    /**
     * Filename parsing method entrance.
     *
     * @param fileName filename
     * @return parsed URL
     */
    public static String parseFileName(String fileName) {
        String pixivPattern = "^\\d{9}_p\\d{1,2}$";
        String pixivPattern2 = "^\\d{8}_p\\d{1,2}$";
        Matcher pixivMatcher = Pattern.compile(pixivPattern).matcher(fileName);
        Matcher pixivMatcher2 = Pattern.compile(pixivPattern2).matcher(fileName);
        if (pixivMatcher.find() || pixivMatcher2.find()) {
            return FilenameParser.pixivIllustrationsOrIllustratorIdParser(fileName);
        } else if (fileName.contains("httpstwitter") || fileName.contains("httpsx")) {
            return FilenameParser.twitterParser(fileName);
        } else if (fileName.contains("httpsdanbooru")) {
            return FilenameParser.danbooruParser(fileName);
        } else if (fileName.contains("bilibili")) {
            return FilenameParser.bilibiliIllustrationsParser(fileName);
        } else if (fileName.contains("miyoushe.com")) {
            return FilenameParser.miyousheParser(fileName);
        }
        return "";
    }
}
