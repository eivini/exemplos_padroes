import java.util.HashMap;
import java.util.Map;

class FabricaCaracteres {
    private Map<Character, Caractere> caracteres = new HashMap<>();

    public Caractere getCaractere(char simbolo) {
        Caractere caractere = caracteres.get(simbolo);
        if (caractere == null) {
            caractere = new CaractereConcreto(simbolo);
            caracteres.put(simbolo, caractere);
        }
        return caractere;
    }
}
