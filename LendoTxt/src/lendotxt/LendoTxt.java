
package lendotxt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LendoTxt {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        //Fluxo de entrada com um arquivo "binario"
        InputStream file = new FileInputStream("ListaDePresenca.txt");
        //transformando binario em caracteres
        Reader isr = new InputStreamReader(file);
        //juntar varios caracteres e ler a linha
        BufferedReader br = new BufferedReader(isr);
        
       String participante = br.readLine();
       
       while(participante != null){
           System.out.println(participante);
           participante = br.readLine();
           
           
       }
        
        
        
        br.close();
    }
    
}
