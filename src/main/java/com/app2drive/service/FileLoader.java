package com.app2drive.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class FileLoader {
    
    public void readFilesFromFolder(File folder, List<String> list) {
        if (folder.exists()) {
            for (File file : folder.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println("directopry " + file.getName());
                    readFilesFromFolder(file, list);
                } else {
                    System.out.println(file.getName());
                    readFile(file, list);
                }
            }
        }
    }

    private void readFile(File file, List<String> list) {
        try (FileReader fr = new FileReader(file)){
            BufferedReader reader = new BufferedReader(fr);
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
