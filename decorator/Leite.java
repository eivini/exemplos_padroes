class Leite extends DecoradorBebida {
    public Leite(Bebida bebida) { super(bebida); }
    @Override
    public String getDescricao() { return super.getDescricao() + ", Leite"; }
    @Override
    public double getCusto() { return super.getCusto() + 0.5; }
}
