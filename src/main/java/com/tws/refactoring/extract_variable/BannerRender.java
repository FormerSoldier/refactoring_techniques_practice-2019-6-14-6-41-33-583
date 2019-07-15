package com.tws.refactoring.extract_variable;

public class BannerRender {
    private String mac_brand = "MAC";
    private String internetExplorer = "IE";
    String renderBanner(String platform, String browser) {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1)) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
