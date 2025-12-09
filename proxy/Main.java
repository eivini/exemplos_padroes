public class Main {
    public static void main(String[] args) {
        Imagem imagem = new ProxyImagem("foto.jpg");
        imagem.exibir();
        imagem.exibir();
    }
}