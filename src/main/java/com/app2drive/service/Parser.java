package com.app2drive.service;

import java.util.ArrayList;
import java.util.List;

import com.app2drive.model.Source;

public class Parser {

    public List<Source> sourcesParse(List<String> sources) {
        List<Source> listOfObject = new ArrayList<>();
        if (!sources.isEmpty()) {
            String[] tempLine;
            for (String oneLine : sources) {
                tempLine = oneLine.split(",");
                listOfObject.add(new Source(tempLine[0], tempLine[2], tempLine[3], tempLine[5], tempLine[6], tempLine[48], tempLine[51], tempLine[52], 
                        tempLine[55], tempLine[57], tempLine[69]));
            }
        }
        return listOfObject;
    }

    public List<Source> dataForCompareParser(List<String> dataForCompare) {
        List<Source> listOfData = new ArrayList<>();
        if (!dataForCompare.isEmpty()) {
            String[] template;
            for (String oneLine : dataForCompare) {
                oneLine = oneLine.replaceAll(",", ".");
                template = oneLine.split(";");
                listOfData.add(new Source(template[41], template[44], template[48], template[50], template[62]));
            }
        }
        return listOfData;
    }

}
