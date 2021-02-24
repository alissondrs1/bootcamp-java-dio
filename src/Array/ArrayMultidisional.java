package Array;

public class ArrayMultidisional {
    public static void main(String[] args) {

        int[][] meuArray = {{1,2,3,4},{5,6,7}};

        for( int i = 0; i < meuArray.length; ++i){
            System.out.println("----");
            for (int j = 0; j < meuArray[i].length; ++j){
                System.out.println(meuArray[i][j]);
            }
        }

        System.out.println("\nTamanho primeiro array: " + meuArray[0].length);
        System.out.println("Tamanho segundo array: " + meuArray[1].length);
    }

}
