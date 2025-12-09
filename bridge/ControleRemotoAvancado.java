class ControleRemotoAvancado extends ControleRemoto {
    public ControleRemotoAvancado(Dispositivo dispositivo) { super(dispositivo); }
    @Override
    public void alternarPower() {
        dispositivo.ligar();
    }
}
