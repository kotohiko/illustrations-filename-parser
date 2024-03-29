package com.jacob.parse;

import com.jacob.parse.core.FilenameParser;

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
     * Sitecode validation.
     *
     * @param siteCode code of variety websites
     * @return
     */
    public static String parseSiteCode(String siteCode) {
        return switch (siteCode) {
            case "p" -> "p";
            case "t" -> "t";
            case "ya" -> "ya";
            case "yo" -> "yo";
            case "m" -> "m";
            case "d" -> "d";
            case "bi" -> "bi";
            case "ba" -> "ba";
            case "n" -> "n";
            case "a" -> "a";
            case "biv" -> "biv";
            default -> null;
        };
    }

    /**
     * Filename parsing method entrance.
     *
     * @param siteCode site code
     * @param fileName filename
     * @return parsed URL
     */
    public static String parseFileName(String siteCode, String fileName) {
        return switch (siteCode) {
            case "p" -> FilenameParser.pixivIllustrationsOrIllustratorIdParser(fileName);
            case "t" -> FilenameParser.twitterParser(fileName);
            case "ya" -> FilenameParser.yandeParser(fileName);
            case "yo" -> FilenameParser.youtubeParser(fileName);
            case "m" -> FilenameParser.miyousheParser(fileName);
            case "d" -> FilenameParser.danbooruParser(fileName);
            case "bi" -> FilenameParser.bilibiliIllustrationsParser(fileName);
            case "ba" -> FilenameParser.baiduNetDiskParser(fileName);
            case "n" -> FilenameParser.nicoVideoParser(fileName);
            case "a" -> FilenameParser.alphacodersParser(fileName);
            case "biv" -> FilenameParser.bilibiliVideosParser(fileName);
            default -> null;
        };
    }
}
