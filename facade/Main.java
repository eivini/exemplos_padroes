public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Projetor projetor = new Projetor();
        Luzes luzes = new Luzes();
        HomeTheaterFacade facade = new HomeTheaterFacade(amp, projetor, luzes);
        facade.assistirFilme();
        facade.fimDoFilme();
    }
}