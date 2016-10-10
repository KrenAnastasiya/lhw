/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author Никита
 */
public class JFlex {
    public static void main(String[] args) throws IOException{
       String l = "L.flex";
       generarLexer(l);
       lexemWriter();
    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file); 
    } 
   public static void lexemWriter() throws FileNotFoundException, IOException{
      System.out.println("Название тестовго файла:");
        Scanner in = new Scanner(System.in);
        String your__path = in.nextLine();
        Reader reader = new BufferedReader(new FileReader(your__path));
        Lexer lexer = new Lexer (reader);
        while (true){
            String sflex = lexer.yylex();
            if(sflex == null){return;}
            else{System.out.print(sflex);}
        }
    } 
}
