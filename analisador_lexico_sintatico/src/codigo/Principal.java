/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) throws Exception {
        String path1 = "C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/Lexer.flex";
        String path2 = "C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/LexerCup.flex";
        String[] pathSintatico = {"-parser", "Sintax", "C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/Sintax.cup"};
        gerar(path1, path2, pathSintatico);
    }
    
    public static void gerar(String path1, String path2, String[] pathS) throws IOException, Exception{
        File arquivo;
        arquivo = new File(path1);
        JFlex.Main.generate(arquivo);
        arquivo = new File(path2);
        JFlex.Main.generate(arquivo);
        java_cup.Main.main(pathS);
        
        Path pathSym = Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/sym.java");
        if (Files.exists(pathSym)) Files.delete(pathSym);
        Files.move(
                Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/sym.java"),
                Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/sym.java")
        );
        
        Path pathSin = Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/Sintax.java");
        if (Files.exists(pathSin)) Files.delete(pathSin);
        Files.move(
                Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/Sintax.java"),
                Paths.get("C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/Sintax.java")
        );
    }
}
