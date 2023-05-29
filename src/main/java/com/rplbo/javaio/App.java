package com.rplbo.javaio;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //Untuk bagian pertama
        GuidedIO g1 = new GuidedIO();
        g1.readDirectory("<path>");
        g1.cekFileSimilarity("<path1>","<path2>");
        g1.cekPythagoras();
        g1.linearSearch();

        //IO untuk GameCharacter:
        //Save
        //Open dan baca powernya
    }
}
