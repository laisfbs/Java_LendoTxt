
import java.io.File;
import java.util.Scanner;


public class ScannerExcel {

  
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new Scanner(new File("Csv.csv"));
        
       String linha = scanner.nextLine();
        System.out.println(linha);
        
        scanner.close();
        
        
        
    }
    
}
