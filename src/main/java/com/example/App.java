package com.example;
import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        System.out.println("------------");
        Studenti st= new Studenti();
        XmlMapper xmlMapper = new XmlMapper();

        Studente s1= new Studente(1,"topolino","t","2004-11-03",6);
        Studente s2= new Studente(2,"minnie","m","2002-04-22",5);
        Studente s3= new Studente(3,"pippo","p","2005-01-08",7);
        Studente s4= new Studente(4,"pluto","pl","2003-08-29",8);

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        
        // Serializzazione        
        xmlMapper.writeValue(new File("test.xml"), st);
        String myXml = xmlMapper.writeValueAsString(st);
        System.out.println("Oggetto serializzato:" + myXml);
        /*
        // Deserializzazione        
        Classe c2 = xmlMapper.readValue(myXml, Classe.class);
        System.out.println("Oggetto deserializzato da stringa:" + c2.getNome());

        Classe c3 = xmlMapper.readValue(new File("test.xml"), Classe.class);
        System.out.println("Oggetto deserializzato da file: " + c3.getNome()); */
    }


}
