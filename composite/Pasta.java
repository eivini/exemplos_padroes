import java.util.*;

class Pasta implements ComponenteArquivo {
    private String nome;
    private List<ComponenteArquivo> filhos = new ArrayList<>();

    public Pasta(String nome) { this.nome = nome; }

    public void adicionar(ComponenteArquivo componente) { filhos.add(componente); }
    public void remover(ComponenteArquivo componente) { filhos.remove(componente); }

    @Override
    public void exibir() {
        System.out.println("Pasta: " + nome);
        for (ComponenteArquivo filho : filhos) {
            filho.exibir();
        }
    }

    @Override
    public int getTamanho() {
        int total = 0;
        for (ComponenteArquivo filho : filhos) {
            total += filho.getTamanho();
        }
        return total;
    }
}
