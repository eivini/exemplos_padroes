public class Main {
    public static void main(String[] args) {
        CarregadorAntigo carregador = new CarregadorAntigo();
        Tomada adaptador = new AdaptadorTomada(carregador);
        adaptador.conectar();
    }
}