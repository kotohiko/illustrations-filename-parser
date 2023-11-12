package com.jacob.parse;

/**
 * 解析文件名核心类
 */
public final class FilenameParser {

    private FilenameParser() {
    }

    public static String pixivIllustrationsAndIllustratorIdParser(String str) {
        if (str.contains("_")) {
            str = str.substring(0, str.indexOf('_'));
            return "https://www.pixiv.net/artworks/" + str;
        } else {
            return "https://www.pixiv.net/users/" + str;
        }
    }

    public static String twitterParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(19, "/");
        sb.insert(sb.indexOf("status"), "/");
        sb.insert(sb.indexOf("status") + 6, "/");
        if (str.contains("photo")) {
            return sb.substring(0, sb.indexOf("photo"));
        } else {
            return sb.toString();
        }
    }

    public static String yandeParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(16, "/");
        sb.insert(21, "/");
        sb.insert(26, "/");
        return String.valueOf(sb);
    }

    public static String miyousheParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(24, "/");
        if (str.contains("ys")) {
            sb.insert(sb.indexOf("ys") + 2, "/");
        } else if (str.contains("bh3")) {
            sb.insert(sb.indexOf("bh3") + 3, "/");
        } else if (str.contains("sr")) {
            sb.insert(sb.indexOf("sr") + 2, "/");
        }
        sb.insert(sb.indexOf("article") + 7, "/");
        return sb.toString();
    }

    public static String danbooruParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(26, "/");
        sb.insert(32, "/");
        return String.valueOf(sb);
    }

    public static String bilibiliParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(24, "/");
        sb.insert(sb.indexOf("opus") + 4, "/");
        sb.delete(sb.indexOf("spm_id_from"), sb.length());
        return sb.toString();
    }

    public static String baiduNetDiskParser(String str) {
        return "pan.baidu.com/s/" + str;
    }

    public static String nicoVideoParser(String str) {
        return "https://seiga.nicovideo.jp/seiga/" + str;
    }

    public static String alphacodersParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(sb.indexOf("com") + 3, "/");
        sb.insert(sb.indexOf("i="), "?");
        return sb.toString();
    }

    public static String youtubeParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(sb.indexOf("youtu.be") + 8, "/");
        return sb.toString();
    }
}
