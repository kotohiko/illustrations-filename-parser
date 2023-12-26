package com.jacob.parse.core;

/**
 * Filename parsing core class.
 *
 * @author Jacob Suen
 * @since Oct 29, 2023
 */
public final class FilenameParser {

    /**
     * Don't let anyone instantiate this class.
     */
    private FilenameParser() {
    }

    /**
     * <a href="https://www.pixiv.net/">Pixiv</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String pixivIllustrationsOrIllustratorIdParser(String str) {
        if (str.contains("_")) {
            str = str.substring(0, str.indexOf('_'));
            return "https://www.pixiv.net/artworks/" + str;
        } else {
            return "https://www.pixiv.net/users/" + str;
        }
    }

    /**
     * <a href="https://twitter.com/">Twitter</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
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

    /**
     * <a href="https://www.pixiv.net/">Yande</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String yandeParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(16, "/");
        sb.insert(21, "/");
        sb.insert(26, "/");
        return String.valueOf(sb);
    }

    /**
     * <a href="https://www.miyoushe.com/">Miyoushe</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
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

    /**
     * <a href="https://danbooru.donmai.us/">Danbooru</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String danbooruParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(26, "/");
        sb.insert(32, "/");
        return String.valueOf(sb);
    }

    /**
     * <a href="https://www.bilibili.com/">Bilibili</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String bilibiliIllustrationsParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        if (str.contains("opus")) {
            sb.insert(24, "/");
            sb.insert(sb.indexOf("opus") + 4, "/");
        } else if (str.contains("t.bilibili")) {
            sb.insert(22, "/");
        }
        if (str.contains("spm_id_from")) {
            sb.delete(sb.indexOf("spm_id_from"), sb.length());
        }
        return sb.toString();
    }

    /**
     * <a href="https://www.bilibili.com/">Bilibili</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String bilibiliVideosParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(sb.indexOf("video"), "/");
        sb.insert(sb.indexOf("video") + 5, "/");
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

    /**
     * <a href="https://www.youtube.com/">YouTube</a> URL-like filename parser.
     *
     * @param str filename string param
     * @return parsed URL
     */
    public static String youtubeParser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(sb.indexOf("youtu.be") + 8, "/");
        return sb.toString();
    }
}
