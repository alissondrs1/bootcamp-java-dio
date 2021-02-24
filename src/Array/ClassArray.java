package Array;

public class ClassArray {
    public static void main(String[] args) {
        int[] meuArray = new int[7]; /** Apenas passando o tamanho do array, inicializando com 0.*/

        int[] meuArray2 = {18,25,26,9,12,13,15,18,19,20,30}; /** array tambem de tamanho 7, mas ja atribuindo os valores. */

        for (int i = 0; i < meuArray2.length; i++){
            System.out.println(meuArray2[i]);
            /** Este "for" Percorre todo o array e  os valores dos elementos
             * enquanto o indice (i) for menor que o tamanho (meuArray2.length).
             *  */
        }

        System.out.println("-----------------------------------------");

        System.out.println(meuArray[1]);
        System.out.println(meuArray2[3]);


        meuArray2[2] = 40; /** Altera o valor de um elemento*/

        System.out.println(meuArray2[2]);

        System.out.println(meuArray2.length); /** Mostra o tamnho do array*/
    }
}
