class Arquivo implements ComponenteArquivo {
    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void exibir() { System.out.println("Arquivo: " + nome); }
    @Override
    public int getTamanho() { return tamanho; }
}
