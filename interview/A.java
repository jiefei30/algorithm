package interview;

/**
 * @author Wangmingcan
 * @date 2021/5/11 8:57
 * @description
 */
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.nio.charset.Charset;

public class A {
    //要转换的目录--目标资源URL
    public final static String targetFileUrl="D:\\project\\algorithm\\lanqiao";
    //遍历目录，将文件从GBK转换成UTF-8
    public static void fileList(File file) {
        File rootFile = file;
        File[] files = rootFile.listFiles();
        if (files != null) {
            for (File f:files) {
                if (!f.isDirectory()) {
                    codeConvert(f);
                }
                System.out.println(f.getPath());
                fileList(f);//递归调用子文件夹下的文件
            }
        }
    }

    public static void main(String[] args){
        File file = new File(targetFileUrl);
        A.fileList(file);
    }
    public static void  codeConvert(File file) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader
                    (new FileInputStream(file), Charset.forName("GBK")));
            StringBuilder sb = new StringBuilder();
            String str;
            while ((str = br.readLine())!= null) {
                sb.append(str);
                sb.append("\n");
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),Charset.forName("UTF-8")));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
//br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
