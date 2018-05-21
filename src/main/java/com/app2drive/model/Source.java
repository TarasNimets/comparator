package com.app2drive.model;

public class Source {
    
    private Long invoiceNumber;
    private Long debitor;
    private String bookingNumber;
    private double amount;
    private double amountWithVAT;
    
    public Source() {
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getDebitor() {
        return debitor;
    }

    public void setDebitor(Long debitor) {
        this.debitor = debitor;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountWithVAT() {
        return amountWithVAT;
    }

    public void setAmountWithVAT(double amountWithVAT) {
        this.amountWithVAT = amountWithVAT;
    }
}
