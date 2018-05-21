package com.app2drive.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.app2drive.service.FileLoader;

public class Worker {

    private final FileLoader fileLoader = new FileLoader();
    private List<String> sources = new ArrayList<>();
    private List<String> dataForCompare = new ArrayList<>();
    
    public Worker() {
        start();
    }

    private void start() {
        loadSources();
//        loadDataForCompare();
        System.out.println(sources.toString());
        System.out.println(sources.size());
    }

    private void loadDataForCompare() {
        File folder = new File("sourceCSV/");
        fileLoader.readFilesFromFolder(folder, dataForCompare);
    }

    public void loadSources() {
        File folder = new File("sourceCSV/");
        fileLoader.readFilesFromFolder(folder, sources);
    }
}
