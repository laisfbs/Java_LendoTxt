

import java.io.IOException;
import java.io.PrintWriter;


public class EscrevendoTxtLeituraScanner {

   
    public static void main(String[] args) throws IOException {
        
        PrintWriter ps = new PrintWriter("ListaDePresenca2.txt");
           ps.println("Escrevendo um texto em txt");
                  ps.println();
                  ps.println("Mais testes com PrintStream");
                  ps.println();
                  ps.println("Teste PrintWriter");
                  
          ps.close();   
    }
    
    }
    

