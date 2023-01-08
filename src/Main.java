import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] mas = {-4, -2, 2, 3, 6,8};

        boolean isSorted = false; //Нашел в гугле)))
        int buf;
        while(!isSorted) {
            isSorted = true; //сначало не понятно но потом ооочень как понятно))
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false; //по скорее бы все освоить((

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

