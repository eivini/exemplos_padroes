abstract class ControleRemoto {
    protected Dispositivo dispositivo;
    public ControleRemoto(Dispositivo dispositivo) { this.dispositivo = dispositivo; }
    public abstract void alternarPower();
    public void aumentarVolume() { dispositivo.ajustarVolume(10); }
}
