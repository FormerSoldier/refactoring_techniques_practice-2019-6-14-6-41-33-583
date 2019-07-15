package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_call_renderBanner_given_mac_ie(){
        BannerRender bannerRender = new BannerRender();

        String message = bannerRender.renderBanner("mac","ie");

        assertThat(message,is("IE on Mac?"));
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_mac_chrome(){
        BannerRender bannerRender = new BannerRender();

        String message = bannerRender.renderBanner("mac","chrome");

        assertThat(message,is("banner"));
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_windows_ie(){
        BannerRender bannerRender = new BannerRender();

        String message = bannerRender.renderBanner("windows","ie");

        assertThat(message,is("banner"));
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_windows_chrome(){
        BannerRender bannerRender = new BannerRender();

        String message = bannerRender.renderBanner("windows","chrome");

        assertThat(message,is("banner"));
    }
}
