import java.util.InputMismatchException;
import java.util.Scanner;

    public class Menu {

        public static Scanner in = new Scanner(System.in).useDelimiter("\\n");


        public static void main() {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Hvad ønsker du at gøre?");
            System.out.println(" ");
            System.out.println("1. Administration af medlemmer");
            System.out.println("2. Administration af hold");
            System.out.println("3. Administration af trænere");
            System.out.println("4. Gør noget helt fjerde");
            System.out.println("5. Se top 5 svømmere");
            System.out.println("6. Afslut");

            boolean korrektSvar = false;

            while(!korrektSvar){
                int svar = intRespons();
                if(svar == 1){
                    Medlemmer.menu();
                    korrektSvar = true;
                }
                else if(svar == 2){
                    Hold.menu();
                    korrektSvar = true;
                }
                else if(svar == 3){
                    Træner.menu();
                    korrektSvar = true;
                }
                else if(svar == 4){
                    nogetHeltFjerde();
                    korrektSvar = true;
                }
                else if(svar == 5){
                    Top5.menu();
                    korrektSvar = true;
                }
                else if(svar == 6){
                    korrektSvar = true;
                }
                else{
                    System.out.println("Det indtastede valg (" + svar + ") eksisterer ikke.");
                }
            }
        }

        private static void nogetHeltFjerde () {
            //Eksempel på metoden i et åbent menupunkt, til evt. senere brug.
            System.out.println("Du har gjort noget helt fjerde...");
            Menu.main();
        }

        public static int intRespons(){
            //intRespons metoden sørger for, at vi ikke kan bryde ud af while-loopet ved at taste andet end integers.
            int intRespons = -1;
            int n = 0;
            for(int x=0;x<=n;x++) {
                try {
                    intRespons = in.nextInt();
                }
                catch (InputMismatchException exception) {
                    System.out.println("Indtast et nummer.");
                    in.nextLine();
                }
            }
            return intRespons;
        }

    }


