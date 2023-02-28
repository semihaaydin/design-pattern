package com.saydin.designpattern.prototype;

public class Run {

    public static void main(String[] args) throws CloneNotSupportedException {
        Document docOriginal=new Document();
        DocumentType documentTypeOriginal=new DocumentType();
        Category categoryOriginal=new Category();
         categoryOriginal.setId(1L);
         categoryOriginal.setName("Category1");

        documentTypeOriginal.setId(1L);
        documentTypeOriginal.setName("DocumentType1");

        docOriginal.setCategory(categoryOriginal);
        docOriginal.setDocumentType(documentTypeOriginal);
        docOriginal.setData("Document1");
        docOriginal.setId(1L);
        docOriginal.setName("Document1");

        Document docClone=docOriginal.clone();
        docClone.setName("Clone1-Document1");
        docClone.getCategory().setName("Clone1-categoryname"); //category objesinde clone yapmazsak ana modeli değiştirir.

        System.out.println("---ORIGINAL------");
        System.out.println("Name : " + docOriginal.getName());
        System.out.println("Category Name  : " + docOriginal.getCategory().getName());

        System.out.println("---CLONE------");
        System.out.println("Name : "+ docClone.getName());
        System.out.println("Category Name  : " + docClone.getCategory().getName());



    }
}
