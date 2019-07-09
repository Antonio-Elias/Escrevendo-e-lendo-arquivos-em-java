/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendoarquivoscomjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class LendoArquivosComJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInforme o nome do arquivo texto: \n");
        String nome = scan.nextLine();
        System.out.println("\nConteudo do Arquivo texto: \n");
        
        try{
            try (FileReader arq = new FileReader(nome)) {
                BufferedReader lerArq = new BufferedReader(arq);
                String linha = lerArq.readLine();
               // int c  = arq.read();
               // System.out.println("C :" + c);
                while(linha != null){
                    System.out.printf("%s\n", linha);
                    linha = lerArq.readLine();
                }
                /*while(c != -1){
                    System.out.println((char) c);
                    System.out.println("C :" + c);
                    c = arq.read();
                }*/
                    
            }
        }catch(IOException ex){
            System.err.printf("Erro na abertura do Arquivo: %s.\n", ex.getMessage());
        }
        
        // trabalhar lendo e escrevendo e lendo dados é um trabalho demorado por se tratar do uso de dispositivos 
        //lentos, por isso uma boa pratica seria usar a classe BufferedOutputStream para escrever e BufferedIntputStream
        //para ler BYTES
        
        /*File arquivo = new File("arquivo.txt");
          try( FileOutputStream fo = new FileOutputStream( arquivo ) ){
            BufferedOutputStream bos = new BufferedOutputStream(fo);             
            bos.write( "teste".getBytes());
            bos.write("\n".getBytes() );//inserindo um caractere de nova linha
            bos.write( "teste2".getBytes());
            bos.flush();  

          }catch(IOException ex){
            ex.printStackTrace();
          }

          try( FileInputStream fi = new FileInputStream(arquivo)){
            BufferedInputStream bis = new BufferedInputStream(fi);

            int content;
            while( ( content = bis.read() ) != -1){
                System.out.println( content  + " - " + ( (char) content) );
            }
          }catch(IOException ex){
            ex.printStackTrace();
          }*/
        
        //baseado em caracteres temos
       /*File arquivo = new File("arquivo2.txt");
        try( FileWriter fw = new FileWriter( arquivo ) ){
          BufferedWriter bw = new BufferedWriter(fw);             
          bw.write( "teste" );
          bw.newLine();
          bw.write( "teste2");
          bw.flush();  
        }catch(IOException ex){
          ex.printStackTrace();
        }

        try( FileReader fr = new FileReader(arquivo)){
          BufferedReader br = new BufferedReader(fr);
          String content;
          while( ( content = br.readLine() ) != null){
            System.out.println( content );
          }
        }catch(IOException ex){
          ex.printStackTrace();
        }*/
       /* outras classes interessante para escrever caracteres em um arquivo é PrintWriter pois 
          possui vários métodos que permitem uma melhor formatação dos dados escritos, lembrando
          que a classe PrintWriter é uma subclasse de Writer então os dados serão escritos na forma de caracteres. */
       
       /*File arquivo = new File("print.txt");
        try(PrintWriter pw = new PrintWriter(arquivo) ){
          pw.println(true);
          pw.println(10);
          pw.println(10.20);
          pw.println("teste");
          pw.printf("String: %s | Double: %.2f | Inteiro: %5d " , "teste", 10f , 200);
        }catch(IOException ex){
          ex.printStackTrace();
        }
       
       A classe PrintWriter possui o método println sobrecarregado para aceitar todos os tipos de dados e o e método printf que insere uma String formatada utilizando argumentos passados como os demais argumentos do método, sendo;
        %s é inserida uma string no lugar.
        %.2f é inserido um número em ponto flutuante, sendo o “.2” para ser colocado duas casas decimais
        %5d é inserido uma inteiro ocupando no total 5 casas
       
       Outra opção interessante para ler dados de um arquivo via InputStream 
       é a classe java.util.Scanner bem conhecida para ler dados do teclado, 
       mas em vez de passar o System.in como parâmetro do construtor passamos 
       o FileInputStream, como é bom o polimorfismo.
       
       File arquivo = new File("teste.bin");
        try( InputStream in = new FileInputStream(arquivo) ){
          Scanner scan = new Scanner(in);
          while( scan.hasNext() ){
            System.out.println( scan.nextLine() );
          }
        }catch(IOException ex){
          ex.printStackTrace();
        }*/
       
    }   

}
