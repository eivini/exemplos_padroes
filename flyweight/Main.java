import java.util.*;

public class Main {
    public static void main(String[] args) {
        FabricaCaracteres fabrica = new FabricaCaracteres();
        Caractere a1 = fabrica.getCaractere('A');
        Caractere a2 = fabrica.getCaractere('A');
        a1.exibir("Arial", 12);
        a2.exibir("Times", 14);
    }
}