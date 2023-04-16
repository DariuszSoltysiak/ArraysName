import java.util.Scanner;

public class ArraysName {
    public static void main(String[] args) {
        boolean find = false;//domyslna incjalizacja na false jest wazne w tym przypadku
        int[] arr = {15, -2, 304, 4844, -2255, 66, -777};

        Scanner scan = new Scanner(System.in);
        int seek;

        int numberOfRetries = 3;
        while (numberOfRetries > 0) {
            System.out.println("Pass number");
            seek = scan.nextInt(); //pobierasz liczbe od uzytkownika


            for (int i = 0; i < arr.length; i++) {//w tej petli sprawdzasz czy jest poprawna
                if (arr[i] == seek) {
                    find = true;
                    break;//poprawna liczba znaleziona, mozna przerwac petle sprawdzania
                }
            }

            if (find == true) {//jesli poprawna liczba jest znaleziona, to mozna przerwac petle sterujaca ponawianiem
                System.out.println("Number has been found");
                break;
            } else {//w tej iteracji ponawiania liczba nie zostala znaleziona, wyswietlamy komunikat i probujemy jeszcze raz
                System.out.println("Number hasn`t been found, plese try again");
                numberOfRetries--;
            }
        }
    }
}


