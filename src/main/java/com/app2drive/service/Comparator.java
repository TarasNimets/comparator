package com.app2drive.service;

import java.util.ArrayList;
import java.util.List;

import com.app2drive.model.Source;

public class Comparator {

    public List<Source> compare(List<Source> listOfSources, List<Source> listOfData) {
        List<Source> result = new ArrayList<>();
        if (!listOfSources.isEmpty() && !listOfData.isEmpty()) {
            for (Source source : listOfSources) {
                if (!listOfData.contains(source)) {
                    result.add(source);
                }
            }
        }
        return result;
    }
}
