import java.nio.file.*;

public class Arquivos{
    public static void main(String[] args) {

        Path diretorio = Paths.get("/home/lucaspolitti/CFBJava/Matrizes/");
        Path arquivo = Paths.get("/home/lucaspolitti/CFBJava/Matrizes/Matrizes.java");

        if(Files.isDirectory(diretorio)){
            System.out.println("Diretorio existe");
        }else{
            System.out.println("Diretorio não existe");
        }

        if(Files.exists(arquivo)){
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe");
        }
        
    }
}