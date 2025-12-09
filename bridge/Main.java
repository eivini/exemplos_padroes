public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        ControleRemoto controle = new ControleRemotoAvancado(tv);
        controle.alternarPower();
        controle.aumentarVolume();
    }
}