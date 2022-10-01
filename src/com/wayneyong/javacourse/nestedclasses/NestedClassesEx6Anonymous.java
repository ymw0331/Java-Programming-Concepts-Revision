package com.wayneyong.javacourse.nestedclasses;

import java.io.File;
import java.io.FilenameFilter;

class FileUtils {
    public static void display(File[] files) {
        for (File file : files) {
            System.out.println(file.getName());

        }
    }
}

public class NestedClassesEx6Anonymous {
    public static void main(String[] args) {

        File baseDir = new File("D:/Users/ymw03/Desktop/JavaDemo");
//        File[] javaFiles = baseDir.listFiles(new JavaFileFilter());

        //anonymous implementation
        File[] javaFilesAno = baseDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        //lambda expression
        File[] javaFiles = baseDir.listFiles((dir, name) ->
                name.endsWith("java"));

        FileUtils.display(javaFiles);
    }
}

class JavaFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}