package com.jacob.parse;

import com.jacob.parse.alphacoders.ParseFileNameToAlphacodersUrl;
import com.jacob.parse.baidu.netdisk.ParseBaiduNetDiskResourceIdToURL;
import com.jacob.parse.bilibili.ParseFileNameToBilibiliUrl;
import com.jacob.parse.danbooru.ParseFileNameToDanbooruUrl;
import com.jacob.parse.miyoushe.ParseFileNameToMiyousheUrl;
import com.jacob.parse.pixiv.ParsePixivArtistIdToUrl;
import com.jacob.parse.pixiv.ParsePixivIllustrationIdToUrl;
import com.jacob.parse.twitter.ParseFileNameToTwitterUrl;
import com.jacob.common.ConvertToUpperCase;
import com.jacob.parse.yande.ParseFileNameToYandeUrl;

public class CommonEnter {
    public static String parseFileName(int themeCode, String input){
        switch (themeCode) {
            case 1:
                return ParsePixivIllustrationIdToUrl.parse(input);
            case 2:
                return ParsePixivArtistIdToUrl.parse(input);
            case 3:
                return ParseFileNameToTwitterUrl.parse(input);
            case 4:
                return ParseFileNameToYandeUrl.parse(input);
            case 5:
                return ParseFileNameToMiyousheUrl.parse(input);
            case 6:
                return ParseFileNameToDanbooruUrl.parse(input);
            case 7:
                return ParseFileNameToBilibiliUrl.parse(input);
            case 8:
                return ParseBaiduNetDiskResourceIdToURL.parse(input);
            case 9:
                return ParseFileNameToAlphacodersUrl.parse(input);
            case 10:
                return ConvertToUpperCase.parse(input);
            default:
                break;
        }
        return null;
    }
}
