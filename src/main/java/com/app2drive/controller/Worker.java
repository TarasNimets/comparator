package com.app2drive.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.app2drive.model.Source;
import com.app2drive.service.Comparator;
import com.app2drive.service.FileLoader;
import com.app2drive.service.Parser;
import com.app2drive.service.Writer;

public class Worker {

    private final FileLoader fileLoader = new FileLoader();
    private final Comparator comparator = new Comparator();
    private final Writer writer = new Writer();
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
        List<Source> listOfSources = sourcesParser();
        System.out.println(listOfSources.get(1));
        System.out.println(listOfSources.size());
        System.out.println(dataForCompare.size());
        List<Source> listOfData = dataParser();
        System.out.println(listOfData.get(58));
        System.out.println(listOfData.size());
        List<Source> result = compare(listOfSources, listOfData);
        System.out.println(result.size());
        listOfNotNullAmount(result);
        saveResult(result);
    }

    private void saveResult(List<Source> list) {
        writer.write(list);
    }

    private void listOfNotNullAmount(List<Source> result) {
        for (Source source : result) {
            if (!source.getbBETRN().equals("0.00")) {
                System.out.println(source);
            }
        }
    }

    private List<Source> compare(List<Source> listOfSources, List<Source> listOfData) {
        return comparator.compare(listOfSources, listOfData);
    }

    private List<Source> dataParser() {
        return parser.dataForCompareParser(dataForCompare);
    }

    private List<Source> sourcesParser() {
        return parser.sourcesParse(sources);
    }

    private void loadDataForCompare() {
        File folder = new File("rfi_files");
        fileLoader.readFilesFromFolder(folder, dataForCompare);
    }

    public void loadSources() {
        File folder = new File("sourceCSV/");
        fileLoader.readFilesFromFolder(folder, sources);
    }
}
