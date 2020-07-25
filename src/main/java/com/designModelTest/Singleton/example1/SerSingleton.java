package com.designModelTest.Singleton.example1;

import java.io.*;

/**
 * 使用序列化实现
 *
 * @Author YongQiang
 * @Date 2020/5/19 14:11
 * @Version 1.0
 */
public class SerSingleton implements Serializable {
    private static final Long serialVersionUID = 1L;
    String name;

    private SerSingleton() {
        System.out.println("SerSingleton is created");
        name = "SerSingleton";
    }

    private static SerSingleton Instance = new SerSingleton();

    public static SerSingleton getInstance() {
        return Instance;
    }

    public static void createString() {
        System.out.println("Creating in SerSingleton");
    }

    public static SerSingleton readResolve() {
        return Instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream("Seringleton.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } finally {
            oos.flush();
            oos.close();
            fos.close();
        }

        try {
            fis = new FileInputStream("SerSingleton.obj");
            ois = new ObjectInputStream(fis);
            s1 = (SerSingleton) ois.readObject();
        } finally {
            ois.close();
            fis.close();
        }
        System.out.println(s == s1);
    }
}
