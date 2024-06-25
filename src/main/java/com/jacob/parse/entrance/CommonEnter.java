package com.jacob.parse.entrance;

import com.jacob.parse.constants.Constants;
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
        Matcher pixivMatcher = Pattern.compile(Constants.PIXIV_PATTERN).matcher(fileName);
        Matcher pixivMatcher2 = Pattern.compile(Constants.PIXIV_PATTERN_2).matcher(fileName);
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
