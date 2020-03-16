package com.designModel.Adapter;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:24
 * @Version 1.0
 */
public class BannerPrint2 extends Printer2 {
    private Banner banner;

    public BannerPrint2(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
