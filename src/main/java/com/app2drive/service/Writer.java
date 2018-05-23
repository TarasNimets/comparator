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
        builder.append("invoiceNumber,invoiceType,accountingState,createDate,updateDate,BPKTON,BBETRN,BSOHAN,BRENRN,BLRENN,BSTEUN").append("\n");
        for (Source source : list) {
            builder.append(source.getInvoiceNumber()).append(',')
                    .append(source.getInvoiceType()).append(',')
                    .append(source.getAccountingState()).append(',')
                    .append(source.getCreateDate()).append(',')
                    .append(source.getUpdateDate()).append(',')
                    .append(source.getbPKTON()).append(',')
                    .append(source.getbBETRN()).append(',')
                    .append(source.getbSOHAN()).append(',')
                    .append(source.getbRENRN()).append(',')
                    .append(source.getbLRENN()).append(',')
                    .append(source.getbSTEUN())
                    .append("\n");
        }
        return builder.toString();
    }

}
