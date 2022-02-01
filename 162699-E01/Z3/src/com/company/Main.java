package com.company;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            File new_file = new File("C:\\Users\\Oskar\\Desktop\\Studia\\ProgramowanieObiektowe\\162699-E01\\Z3\\new_folder");
            FileFilter fileFilter = file -> !file.isDirectory();
            File[] file_list = new_file.listFiles(fileFilter);

            if(file_list!= null){
                Arrays.stream(file_list)
                        .forEach(file -> {
                            System.out.println(file.getPath());
                        });
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
