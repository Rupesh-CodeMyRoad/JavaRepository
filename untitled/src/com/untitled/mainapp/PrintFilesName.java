package com.untitled.mainapp;

import java.io.File;

public class PrintFilesName {
    public static void main(String[] args){
        //C:\Users\Rupesh Regmi\Documents
        final String USER_HOME= System.getProperty("user.home");
        System.out.println(USER_HOME);
        final String sep=System.getProperty("file.separator");
        System.out.println(USER_HOME+ sep+ "Desktop");
        String loc =USER_HOME+sep+"Desktop"+sep+"Rupesh";
        File file=new File(USER_HOME+sep+"Desktop"+sep+"Rupesh");   //same as --> File file=new File("C:\\Users\\Rupesh Regmi\\Desktop\\Desktop.txt");
        String[] fileNames = file.list();
        for (String name : fileNames)
        {
            File f = new File(loc+sep+name);
            System.out.println(name);
            System.out.println(f.canRead() ? "r" : " ");
            System.out.println(f.canWrite() ? "w" : " ");
            System.out.println(f.canExecute() ? "e" : " ");
            System.out.println("====================");
        }
    }
}
