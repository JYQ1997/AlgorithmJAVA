package com.designModel.Adapter;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:17
 * @Version 1.0
 */
public class BannerPrinter extends Banner implements Printer {
    public BannerPrinter(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
