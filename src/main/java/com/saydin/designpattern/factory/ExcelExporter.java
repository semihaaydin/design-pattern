package com.saydin.designpattern.factory;

class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "EXCEL -> " + content ;
    }
}
