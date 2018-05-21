package com.app2drive.model;

public class Source {
    
    private String BPKTON;
    private String BBETRN;
    private String BSOHAN;
    private String BRENRN;
    private String BLRENN;
    private String BSTEUN;
    
    private Source() {
    }
    
    public Source(String BPKTON, String BBETRN, String BSOHAN, String BRENRN, String BLRENN, String BSTEUN) {
        this.BPKTON = BPKTON;
        this.BBETRN = BBETRN;
        this.BSOHAN = BSOHAN;
        this.BRENRN = BRENRN;
        this.BLRENN = BLRENN;
        this.BSTEUN = BSTEUN;
    }

    @Override
    public String toString() {
        return "Source [BPKTON=" + BPKTON + ", BBETRN=" + BBETRN + ", BSOHAN=" + BSOHAN + ", BRENRN=" + BRENRN
                + ", BLRENN=" + BLRENN + ", BSTEUN=" + BSTEUN + "]";
    }
}
