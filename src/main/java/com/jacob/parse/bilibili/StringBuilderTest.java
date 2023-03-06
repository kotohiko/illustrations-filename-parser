package com.jacob.parse.bilibili;

/**
 * @author Jacob Suen
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("httpswww.bilibili.comopus762023431580418195spm_id_from=333.999.0.0");
//            sb.insert(5, "://");
//            sb.insert(24, "/");
//            sb.insert(sb.indexOf("opus") + 4, "/");
        System.out.println(sb.indexOf("spm_id_from"));
        System.out.println(sb.charAt(sb.length() - 1));
        sb.delete(sb.indexOf("spm_id_from"), 66);
        System.out.println(sb);
    }
}
