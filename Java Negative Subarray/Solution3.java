
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        sc.nextLine();
        String spaceSeparatedIntegers = sc.nextLine();
        sc.close();

        String[] array = spaceSeparatedIntegers.split(" ");
        int contador = 0;

        for (int i = 0; i < arrayLength; i++) {
            int suma = 0;
            int numeroI = Integer.parseInt(array[i]);
            System.out.println("Numero i:" + numeroI);
            for (int j = i; j < arrayLength; j++) {
                int numeroJ = Integer.parseInt(array[j]);
                System.out.println("Numero j:" + numeroJ);
                suma += numeroJ;
                if (suma < 0) {
                    contador++;
                }
            }

        }

        System.out.println(contador);
    }
}