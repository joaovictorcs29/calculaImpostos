package entidades;

public  class PessoaJuridica extends Pessoas {
    private int nmrFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int nmrFuncionarios) {
        super(nome, rendaAnual);
        this.nmrFuncionarios = nmrFuncionarios;
    }

    public int getNmrFuncionarios() {
        return nmrFuncionarios;
    }

    public void setNmrFuncionarios(int nmrFuncionarios) {
        this.nmrFuncionarios = nmrFuncionarios;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        if (nmrFuncionarios > 10) {
            imposto = getRendaAnual() * 0.14;
            return imposto;
        }
        return getRendaAnual() * 0.16;
    }
}
