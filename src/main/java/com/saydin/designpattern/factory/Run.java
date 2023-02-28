package com.saydin.designpattern.factory;

public class Run {

    public static void main(String[] args) {
        String file =FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("Test Content");
        System.out.println(file);
    }

}
