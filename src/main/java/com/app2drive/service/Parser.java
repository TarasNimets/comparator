package com.app2drive.service;

import java.util.ArrayList;
import java.util.List;

import com.app2drive.model.Source;

public class Parser {

    public List<Source> sourcesParse(List<String> listOfLines) {
        List<Source> listOfObject = new ArrayList<>();
        if (!listOfLines.isEmpty()) {
            String[] tempLine;
            for (String oneLine : listOfLines) {
                tempLine = oneLine.split(",");
                listOfObject.add(new Source(tempLine[48], tempLine[51], tempLine[52], tempLine[55], tempLine[57], tempLine[69]));
            }
        }
        return listOfObject;
    }

}
