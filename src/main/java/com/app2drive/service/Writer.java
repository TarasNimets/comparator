package com.app2drive.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.app2drive.model.Source;

public class Writer {

    public void write(List<Source> list) {
        if (!list.isEmpty()) {
            try (FileWriter writer = new FileWriter("result/1.csv");
                    BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                bufferedWriter.write(convertToCSV(list));
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    private String convertToCSV(List<Source> list) {
        StringBuilder builder = new StringBuilder();
        builder.append("BPKTON,BBETRN,BRENRN,BLRENN,BSTEUN").append("\n");
        for (Source source : list) {
            builder.append(source.getBPKTON()).append(',')
                    .append(source.getBBETRN()).append(',')
                    .append(source.getBRENRN()).append(',')
                    .append(source.getBLRENN()).append(',')
                    .append(source.getBSTEUN())
                    .append("\n");
        }
        return builder.toString();
    }

}
