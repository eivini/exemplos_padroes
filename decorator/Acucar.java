class Acucar extends DecoradorBebida {
    public Acucar(Bebida bebida) { super(bebida); }
    @Override
    public String getDescricao() { return super.getDescricao() + ", Acucar"; }
    @Override
    public double getCusto() { return super.getCusto() + 0.2; }
}
