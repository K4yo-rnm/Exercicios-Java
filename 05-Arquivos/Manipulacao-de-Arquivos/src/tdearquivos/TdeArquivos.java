/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdearquivos;

 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author care-
 */
public class TdeArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diretorio; 
        
        Scanner escolha = new Scanner(System.in);
        System.out.println("Qual o Diretorio para o arquivo: ");
        diretorio = escolha.nextLine();
 
        LerArquivo(diretorio);   
    }
    
    public static void ListarArquivos(String caminhoDiretorio){
        
        File diretorio = new File(caminhoDiretorio);
        
        File[] arquivos = diretorio.listFiles();
        
        if(arquivos != null){
            for(File arquivo : arquivos){
                if(arquivo.isFile()){
                    System.out.println("Arquivo: " + arquivo.getName());
                } else 
                    if(arquivo.isDirectory()){
                    System.out.println("Diretorio: " + arquivo.getName());
                    }
            }
        }
    }
    
    public static void LocalizarArquivo(String caminhoArquivo){
        File arquivoEspecifico = new File(caminhoArquivo);
        
        if(arquivoEspecifico.exists()){
            System.out.println("Arquivo Encontrado");
        } else {
            System.out.println("Arquivo nao encontrado");
        }
    }
    
    public static void LerArquivo(String caminhoArquivo){
        
       try{
        File arquivo = new File(caminhoArquivo);
        
           try (Scanner scn = new Scanner(arquivo)) {
               while(scn.hasNextLine()){
                   String linha = scn.nextLine();
                   System.out.println(linha);
               }  }
        }catch(FileNotFoundException erro){
            JOptionPane.showMessageDialog(null,"Nao foi possivel ler: " + erro);
        }
    }
}
