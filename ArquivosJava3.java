import java.nio.file.*;

public class ArquivosJava3{
    public static void main(String[] args) {
        
        Path ArvoreEsfera = Paths.get("/home/lucaspolitti/Imagens/ImagensCfbCursos/pequenaArvoreEsfera.jpg");
        Path araraAzul = Paths.get("/home/lucaspolitti/Imagens/ImagensCfbCursos/araraAzulPequena.jpg");

        try{

            byte[] bytesArvoreEsfera=Files.readAllBytes(ArvoreEsfera);
            Files.write(araraAzul, bytesArvoreEsfera);
        }catch(Exception e){
            System.out.println("ERRO");
        }


    }
}