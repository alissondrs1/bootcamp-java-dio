package Heranca;

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

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQuantidadeDePortas());
        carro.acelera();


        System.out.println(motocicleta.getMarca());
        System.out.println(motocicleta.getModelo());
        System.out.println(motocicleta.getCilindradas());
        motocicleta.acelera();



    }
}
