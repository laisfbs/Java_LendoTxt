
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class TesteCopiarArquivo {

    
    public static void main(String[] args) throws IOException {
        
        //InputStream file = new FileInputStream("ListaDePresenca.txt");
        InputStream file = System.in;
        Reader isr = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fila = new FileOutputStream("ListaDePresenca3.txt");
        Writer wrt = new OutputStreamWriter(fila);
        BufferedWriter brw = new BufferedWriter(wrt);
        
        String linha = br.readLine();
       
       while(linha != null && linha.isEmpty()){
           brw.write(linha);
        brw.newLine();
        brw.flush();
           linha = br.readLine();
    }
        br.close();
        brw.close();
    }
    
}
