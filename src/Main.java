import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int bilet1[] = generatorBilet();
        int bilet2[] = generatorBilet();
        int Counter = 0;
        int guessed = comparaDouaBilete(bilet1, bilet2);

        while(guessed < 6){
            bilet2=generatorBilet();
            Counter++;
            System.out.println(Counter);
            guessed = comparaDouaBilete(bilet1, bilet2);
        }

        System.out.println("Avem un castigator ");
        System.out.println("Biletul Agentiei: " + Arrays.toString(bilet1));
        System.out.println("Bilet generat: " + Arrays.toString(bilet2));

    }

    public static int[] generatorBilet() {

        int sirBilet[] = new int[6];

        for(int i = 0; i < 6; i++) {
            sirBilet[i] = new Random().nextInt(49) + 1;
        }

        for(int j = 0; j < 6; j++){
            for(int x = j+1; x <6; x++){
                if(sirBilet[j] == sirBilet[x]){
                    sirBilet[x] = new Random().nextInt(49) + 1;
                }
            }
        }

        for(int j = 0; j < 6; j++){
            for(int x = j+1; x <6; x++){
                if(sirBilet[j] == sirBilet[x]){
                    sirBilet[x] = new Random().nextInt(49) + 1;
                }
            }
        }

        return sirBilet;
    }

    public static int comparaDouaBilete(int[] bilet1, int[] bilet2) {
        int gasite=0;
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                if(bilet1[i]==bilet2[j])
                    gasite++;
            }
        return gasite;
    }
}
