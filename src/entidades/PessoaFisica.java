package entidades;

public class PessoaFisica extends Pessoas {

    private double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (getRendaAnual() < 20000.00){
            imposto = getRendaAnual() * 0.15;
        }
        else {
            imposto = getRendaAnual() * 0.25;
        }

        imposto -= getGastosSaude() * 0.50;
        if (imposto < 0.0) {
            return 0.0;
        }
        return imposto;
    }
}
