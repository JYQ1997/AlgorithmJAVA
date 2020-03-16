package com.designModelTest.Adapter;

import java.io.*;
import java.util.Properties;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:45
 * @Version 1.0
 */
public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        this.properties=new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {

    }

    @Override
    public void writeToFile(String fileName) throws IOException {

    }

    @Override
    public void setValue(String key, String value) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
