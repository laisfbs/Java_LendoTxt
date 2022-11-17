
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class EscrevendoTxt {

   
    public static void main(String[] args) throws IOException {
       
         //Fluxo de entrada com um arquivo "binario"
        OutputStream fila = new FileOutputStream("ListaDePresenca2.txt");
        //transformando binario em caracteres
        Writer wrt = new OutputStreamWriter(fila);
        //juntar varios caracteres e ler a linha
        BufferedWriter brw = new BufferedWriter(wrt);
        
         brw.write("Escrevendo um texto em txt");
         brw.newLine();
         brw.write("Eu conseguiiiiii.....");
          brw.newLine();
         brw.write("Fazendo uma....");
          brw.newLine();
         brw.write("Fazendo duas.....");
          brw.newLine();
         brw.write("Fazendo tres.....");
          brw.newLine();
         brw.write("Uhull.....");
                 
         brw.close();
    
    }
    
    }
    

