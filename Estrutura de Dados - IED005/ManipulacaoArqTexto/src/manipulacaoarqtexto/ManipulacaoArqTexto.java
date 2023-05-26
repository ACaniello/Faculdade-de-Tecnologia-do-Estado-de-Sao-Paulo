/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacaoarqtexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class ManipulacaoArqTexto {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        leituraArquivo();
        escritaArquivo();     
    
}

    private static void leituraArquivo() throws IOException, FileNotFoundException {
        final String ARQ_ENT = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\samba_enredo.txt";
        FileReader fr = new FileReader (ARQ_ENT);
        BufferedReader br = new BufferedReader(fr);
        
        String linha = br.readLine();
        System.out.println(linha);
        
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }

    private static void escritaArquivo() throws IOException {
        final String ARQ_SAIDA = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\arquivo_saida.txt";
        FileWriter fw = new FileWriter (ARQ_SAIDA);
        BufferedWriter bw = new BufferedWriter(fw);
        String linha = "primeira linha";
        bw.write(linha); bw.newLine();
        
        linha = "segunda linha";
        bw.write(linha);
        
        bw.flush();
    
    }
}
