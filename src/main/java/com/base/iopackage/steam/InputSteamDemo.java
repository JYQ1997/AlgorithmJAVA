package com.base.iopackage.steam;

import java.io.*;

/**
 * @Author YongQiang
 * @Date 2020/7/13 10:52
 * @Version 1.0
 */
public class InputSteamDemo {
    public static void main(String[] args) {
        /*try (InputStream fis = new FileInputStream(new File("D/a.txt"));
             OutputStream fos = new FileOutputStream("D:/b.txt")){

            byte[] buf = new byte[8192];

            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/

        /*try(FileInputStream fileInputStream=new FileInputStream("D:/a.txt");
            OutputStream outputStream=new FileOutputStream("D:/b.txt")){
            byte[] bytes=new byte[1024];
            int length=0;
            while ((length=fileInputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,length);
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/


        try(InputStream  inputStream  = new FileInputStream("D:/a.txt");
            OutputStream outputStream=new FileOutputStream("D:/b.txt")) {
            int length=0;
            byte[] bytes=new byte[1024];
            while ((length=inputStream.read(bytes,1,bytes.length-1))!=-1) {
                outputStream.write(bytes,0,length);
                //System.out.print(bytes.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
