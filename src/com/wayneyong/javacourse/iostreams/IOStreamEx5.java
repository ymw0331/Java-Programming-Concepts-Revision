package com.wayneyong.javacourse.iostreams;


import jdk.internal.util.xml.impl.Input;

import java.io.*;

class IOUtils { //applicable all IO stream, generalised
    public static void copy(OutputStream out, InputStream in) throws IOException {
        byte[] buffer = new byte[1024];
        int n;

        while ((n = in.read(buffer)) > 0) {
            out.write(buffer, 0, n);
        }
    }
}


public class IOStreamEx5 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("D:/Users/ymw03/Desktop/JavaDemo");
        File srcFile = new File(basePath, "scr.txt");
        File descFile = new File(basePath, "desc.txt");

//        FileInputStream fileIn = new FileInputStream(srcFile);
//        FileOutputStream fileOut = new FileOutputStream(descFile);
//        try {
//            IOUtils.copy(fileOut, fileIn); //IOException
//            System.out.println("copied....");
//        } finally {
//            fileIn.close();
//            fileOut.close();
//        }

        try (FileInputStream fileIn = new FileInputStream(srcFile);
             FileOutputStream fileOut = new FileOutputStream(descFile);) {
            IOUtils.copy(fileOut, fileIn); //IOException
            System.out.println("copied....");
        }
    }
}
