package com.app2drive.model;

import java.io.Serializable;

public class Source implements Serializable{
    
    private String invoiceNumber;
    private String invoiceType;
    private String accountingState;
    private String createDate;
    private String updateDate;
    private String bPKTON;
    private String bBETRN;
    private String bSOHAN;
    private String bRENRN;
    private String bLRENN;
    private String bSTEUN;
    
    private Source() {
    }

    public Source(String invoiceNumber, String invoiceType, String accountingState, String createDate,
            String updateDate, String bPKTON, String bBETRN, String bSOHAN, String bRENRN, String bLRENN,
            String bSTEUN) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceType = invoiceType;
        this.accountingState = accountingState;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.bPKTON = bPKTON;
        this.bBETRN = bBETRN;
        this.bSOHAN = bSOHAN;
        this.bRENRN = bRENRN;
        this.bLRENN = bLRENN;
        this.bSTEUN = bSTEUN;
    }

    public Source(String BPKTON, String BBETRN, String BRENRN, String BLRENN, String BSTEUN) {
        this.bPKTON = BPKTON;
        this.bBETRN = BBETRN;
        this.bRENRN = BRENRN;
        this.bLRENN = BLRENN;
        this.bSTEUN = BSTEUN;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bBETRN == null) ? 0 : bBETRN.hashCode());
        result = prime * result + ((bLRENN == null) ? 0 : bLRENN.hashCode());
        result = prime * result + ((bPKTON == null) ? 0 : bPKTON.hashCode());
        result = prime * result + ((bRENRN == null) ? 0 : bRENRN.hashCode());
        result = prime * result + ((bSTEUN == null) ? 0 : bSTEUN.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Source other = (Source) obj;
        if (bBETRN == null) {
            if (other.bBETRN != null)
                return false;
        } else if (!bBETRN.equals(other.bBETRN))
            return false;
        if (bLRENN == null) {
            if (other.bLRENN != null)
                return false;
        } else if (!bLRENN.equals(other.bLRENN))
            return false;
        if (bPKTON == null) {
            if (other.bPKTON != null)
                return false;
        } else if (!bPKTON.equals(other.bPKTON))
            return false;
        if (bRENRN == null) {
            if (other.bRENRN != null)
                return false;
        } else if (!bRENRN.equals(other.bRENRN))
            return false;
        if (bSTEUN == null) {
            if (other.bSTEUN != null)
                return false;
        } else if (!bSTEUN.equals(other.bSTEUN))
            return false;
        return true;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public String getAccountingState() {
        return accountingState;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public String getbPKTON() {
        return bPKTON;
    }

    public String getbBETRN() {
        return bBETRN;
    }

    public String getbRENRN() {
        return bRENRN;
    }

    public String getbLRENN() {
        return bLRENN;
    }

    public String getbSTEUN() {
        return bSTEUN;
    }

    public String getbSOHAN() {
        return bSOHAN;
    }

    @Override
    public String toString() {
        return "Source [invoiceNumber=" + invoiceNumber + ", invoiceType=" + invoiceType + ", accountingState="
                + accountingState + ", createDate=" + createDate + ", updateDate=" + updateDate + ", bPKTON=" + bPKTON
                + ", bBETRN=" + bBETRN + ", bSOHAN=" + bSOHAN + ", bRENRN=" + bRENRN + ", bLRENN=" + bLRENN
                + ", bSTEUN=" + bSTEUN + "]";
    }

}
