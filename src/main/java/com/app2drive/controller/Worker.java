package com.app2drive.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.app2drive.model.Source;
import com.app2drive.service.FileLoader;
import com.app2drive.service.Parser;

public class Worker {

    private final FileLoader fileLoader = new FileLoader();
    private final Parser parser = new Parser();
    private List<String> sources = new ArrayList<>();
    private List<String> dataForCompare = new ArrayList<>();
    
    public Worker() {
        start();
    }

    private void start() {
        loadSources();
        loadDataForCompare();
        System.out.println(sources.size());
        List<Source> objectOfSources = sourcesParser();
        System.out.println(objectOfSources.get(155));
        System.out.println(objectOfSources.size());
    }

    private List<Source> sourcesParser() {
        return parser.sourcesParse(sources);
    }

    private void loadDataForCompare() {
        File folder = new File("");
        fileLoader.readFilesFromFolder(folder, dataForCompare);
    }

    public void loadSources() {
        File folder = new File("sourceCSV/");
        fileLoader.readFilesFromFolder(folder, sources);
    }
    
    
}
