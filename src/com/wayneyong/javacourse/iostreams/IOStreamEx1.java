package com.wayneyong.javacourse.iostreams;

import java.io.File;
import java.io.IOException;

/**
 * File class - Allow us to access the metadata of the file or directory
 * e.g. File f = new File("a.txt")
 * int len = f.length();
 */


public class IOStreamEx1 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("D:/Users/Administrator/Idea Projects/java-revision");
        System.out.println("isDirectory - " + basePath.isDirectory());

        File f = new File(basePath, "a.txt");
        System.out.println(f.getName() + " length : " + f.length());
        f.createNewFile();

        File f2 = new File(basePath, "b.txt");
        if (f2.isFile()) {
            System.out.println(f2.getName() + " exists");
        } else {
            System.out.println(f2.getName() + " doesn't exist");
        }
    }
}
