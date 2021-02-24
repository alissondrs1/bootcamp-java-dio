package Polimorfismo;

public class Motocicleta extends Veiculo {
    private int cilindradadas;


    public int getCilindradas(){
        return cilindradadas;
    }
    public void setCilindradadas(int cilindradadas){
        this.cilindradadas = cilindradadas;
    }
    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }

}
