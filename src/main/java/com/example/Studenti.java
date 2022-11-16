package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Studenti {

    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Studente> studente= new ArrayList<Studente>();

    
    public Studenti() {
    }

    public ArrayList<Studente> getStud() {
        return studente;
    }

    public void setStud(ArrayList<Studente> stud) {
        this.studente = stud;
    }

    public void add(Studente s) {
        this.studente.add(s);
    }
}
    

    
