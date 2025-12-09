class HomeTheaterFacade {
    private Amplificador amp;
    private Projetor projetor;
    private Luzes luzes;

    public HomeTheaterFacade(Amplificador amp, Projetor projetor, Luzes luzes) {
        this.amp = amp;
        this.projetor = projetor;
        this.luzes = luzes;
    }

    public void assistirFilme() {
        System.out.println("Preparando filme...");
        luzes.dim();
        projetor.ligar();
        projetor.modoCinema();
        amp.ligar();
        amp.ajustarVolume(10);
    }

    public void fimDoFilme() {
        System.out.println("Fim do filme...");
        amp.ligar();
        projetor.ligar();
        luzes.dim();
    }
}
