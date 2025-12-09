public class Main {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();
        bebida = new Leite(bebida);
        bebida = new Acucar(bebida);
        System.out.println(bebida.getDescricao() + " - Custo: " + bebida.getCusto());
    }
}