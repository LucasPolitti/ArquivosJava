import java.nio.file.*;
import java.util.List;

public class ArquivoJava2{
    public static void main(String[] args){
        
        Path arquivo = Paths.get("/home/lucaspolitti/ArquivosTexto/Oração a Mãe");

        if(Files.exists(arquivo)){
            System.out.println("É um arquivo");
        }

        try{

            List<String> linhas = Files.readAllLines(arquivo);

            //for(String linha:linhas){
            //    System.out.println(linha);

            //}

            linhas.forEach(linha -> System.out.println(linha));


        }catch(Exception e){
            System.out.println("ERRO");
        }

        


    }
}