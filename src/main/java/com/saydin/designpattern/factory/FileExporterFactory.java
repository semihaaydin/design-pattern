package com.saydin.designpattern.factory;

public class FileExporterFactory {

    public static FileExporter getInstance(FileType fileType){

        //buradaki if else sorununu çözmek için abstract factory kullanırız.
        switch (fileType){
            case PDF:return new PdfExporter();
            case EXCEL:return new ExcelExporter();
            default:throw new UnsupportedOperationException();
        }
    }

    public enum FileType{
        PDF,
        EXCEL;
    }
}
