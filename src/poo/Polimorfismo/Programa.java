package Polimorfismo;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Volks");
        carro.setModelo("Gol");
        carro.setQuantidadeDePortas(4);


        Motocicleta motocicleta = new Motocicleta();

        motocicleta.setMarca("Honda");
        motocicleta.setModelo("cg");
        motocicleta.setCilindradadas(425);

        Veiculo veiculo = new Veiculo();

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQuantidadeDePortas());
        carro.acelera();
        carro.setValorVenal(1000.0);
        System.out.println("Valor Venal: " + carro.getValorVenal());
        System.out.println(carro.calculaImposto());

        System.out.println("--------------------------------");

        System.out.println(motocicleta.getMarca());
        System.out.println(motocicleta.getModelo());
        System.out.println(motocicleta.getCilindradas());
        motocicleta.acelera();
        motocicleta.setValorVenal(800.0);
        System.out.println(motocicleta.calculaImposto());






    }
}
