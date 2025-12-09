class CaractereConcreto implements Caractere {
    private char simbolo;

    public CaractereConcreto(char simbolo) { this.simbolo = simbolo; }

    @Override
    public void exibir(String fonte, int tamanho) {
        System.out.println("Letra  + simbolo +  em " + fonte + ", tamanho " + tamanho);
    }
}
