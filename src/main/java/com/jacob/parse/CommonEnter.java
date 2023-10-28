package com.jacob.parse;

public class CommonEnter {

    private CommonEnter() {
    }

    public static String parseFileName(String themeCode, String input) {
        switch (themeCode) {
            case "p":
                return FilenameParser.pixivIllustrationsAndIllustratorIdParser(input);
            case "t":
                return FilenameParser.twitterParser(input);
            case "y":
                return FilenameParser.yandeParser(input);
            case "m":
                return FilenameParser.miyousheParser(input);
            case "d":
                return FilenameParser.danbooruParser(input);
            case "b":
                return FilenameParser.bilibiliParser(input);
            case "ba":
                return FilenameParser.baiduNetDiskParser(input);
            case "n":
                return FilenameParser.nicoVideoParser(input);
            case "a":
                return FilenameParser.alphacodersParser(input);
            default:
                break;
        }
        return null;
    }
}
