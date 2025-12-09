class Radio implements Dispositivo {
    @Override
    public void ligar() { System.out.println("Radio ligado."); }
    @Override
    public void desligar() { System.out.println("Radio desligado."); }
    @Override
    public void ajustarVolume(int nivel) { System.out.println("Volume do radio: " + nivel); }
}
