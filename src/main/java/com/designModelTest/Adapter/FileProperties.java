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
        this.properties.load(new FileInputStream(new File(fileName)));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        this.properties.store(new FileOutputStream(new File(fileName)),"#written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        this.properties.setProperty(key,value);
    }

    @Override
    public String getValue() {
        return null;
    }
}
