package com.designModelTest.Adapter;

import java.io.IOException;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:36
 * @Version 1.0
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key,String value);
    public String getValue();
}
