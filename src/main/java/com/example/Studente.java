package com.example;

public class Studente {

    private int id;    
    private String cognome;
    private String nome;
    private String datanascita;
    private int votoesame;
    
       
    public Studente() {
    }

    
    public Studente(int id, String cognome, String nome, String datanascita, int votoesame) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.datanascita = datanascita;
        this.votoesame = votoesame;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDatanascita() {
        return datanascita;
    }
    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
    public int getVotoesame() {
        return votoesame;
    }
    public void setVotoesame(int votoesame) {
        this.votoesame = votoesame;
    }


    @Override
    public String toString() {
        return "Studente [cognome=" + cognome + ", datanascita=" + datanascita + ", id=" + id + ", nome=" + nome
                + ", votoesame=" + votoesame + "]";
    }


    

    
}
