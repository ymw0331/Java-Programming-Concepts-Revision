package com.wayneyong.javacourse.iostreams;

import java.io.File;
import java.io.FilenameFilter;


class FileUtils {
    public static void display(File[] files) {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}

public class IOStreamEx2 {


    public static void main(String[] args) {
        File baseDir = new File("D:/Users/Administrator/Idea Projects/java-revision/src/");
        File[] files = baseDir.listFiles();
        FileUtils.display(files);

        System.out.println("=============Only java files==========");
        File[] javaFiles = baseDir.listFiles(new JavaFileFilter());
        FileUtils.display(javaFiles);

    }
}

class JavaFileFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}