import java.util.*;

public class Main {
    public static void main(String[] args) {
        Arquivo arq1 = new Arquivo("doc1.txt", 100);
        Arquivo arq2 = new Arquivo("doc2.txt", 200);
        Pasta pasta = new Pasta("Documentos");
        pasta.adicionar(arq1);
        pasta.adicionar(arq2);
        pasta.exibir();
        System.out.println("Tamanho total: " + pasta.getTamanho());
    }
}