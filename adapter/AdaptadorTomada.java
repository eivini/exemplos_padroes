class AdaptadorTomada implements Tomada {
    private CarregadorAntigo carregador;

    public AdaptadorTomada(CarregadorAntigo carregador) {
        this.carregador = carregador;
    }

    @Override
    public void conectar() {
        carregador.conectarAntigo();
        System.out.println("Agora funciona com nova tomada.");
    }
}
