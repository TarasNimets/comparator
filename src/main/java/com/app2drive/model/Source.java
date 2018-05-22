package com.app2drive.model;

import java.io.Serializable;

public class Source implements Serializable{
    
    private String BPKTON;
    private String BBETRN;
    private String BRENRN;
    private String BLRENN;
    private String BSTEUN;
    
    private Source() {
    }
    
    public Source(String BPKTON, String BBETRN, String BRENRN, String BLRENN, String BSTEUN) {
        this.BPKTON = BPKTON;
        this.BBETRN = BBETRN;
        this.BRENRN = BRENRN;
        this.BLRENN = BLRENN;
        this.BSTEUN = BSTEUN;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((BBETRN == null) ? 0 : BBETRN.hashCode());
        result = prime * result + ((BLRENN == null) ? 0 : BLRENN.hashCode());
        result = prime * result + ((BPKTON == null) ? 0 : BPKTON.hashCode());
        result = prime * result + ((BRENRN == null) ? 0 : BRENRN.hashCode());
        result = prime * result + ((BSTEUN == null) ? 0 : BSTEUN.hashCode());
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
        if (BBETRN == null) {
            if (other.BBETRN != null)
                return false;
        } else if (!BBETRN.equals(other.BBETRN))
            return false;
        if (BLRENN == null) {
            if (other.BLRENN != null)
                return false;
        } else if (!BLRENN.equals(other.BLRENN))
            return false;
        if (BPKTON == null) {
            if (other.BPKTON != null)
                return false;
        } else if (!BPKTON.equals(other.BPKTON))
            return false;
        if (BRENRN == null) {
            if (other.BRENRN != null)
                return false;
        } else if (!BRENRN.equals(other.BRENRN))
            return false;
        if (BSTEUN == null) {
            if (other.BSTEUN != null)
                return false;
        } else if (!BSTEUN.equals(other.BSTEUN))
            return false;
        return true;
    }

    public String getBPKTON() {
        return BPKTON;
    }

    public String getBBETRN() {
        return BBETRN;
    }

    public String getBRENRN() {
        return BRENRN;
    }

    public String getBLRENN() {
        return BLRENN;
    }

    public String getBSTEUN() {
        return BSTEUN;
    }

    @Override
    public String toString() {
        return "Source [BPKTON=" + BPKTON + ", BBETRN=" + BBETRN + ", BRENRN=" + BRENRN + ", BLRENN=" + BLRENN
                + ", BSTEUN=" + BSTEUN + "]";
    }
}
