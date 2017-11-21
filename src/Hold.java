import java.util.InputMismatchException;
import java.util.Scanner;

public class Hold {

    public static Scanner in = new Scanner(System.in).useDelimiter("\\n");

    public static void menu () {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("[Administration af hold]");
        System.out.println("Hvad ønsker du at gøre?");
        System.out.println(" ");
        System.out.println("1. Opret hold");
        System.out.println("2. Ret oplysninger");
        System.out.println("3. Tilføj deltagere");
        System.out.println("4. Se holdets deltagere");
        System.out.println("5. Afslut");

        boolean korrektSvar = false;

        while(!korrektSvar){
            int svar = intRespons();
            if(svar == 1){
                opretHold();
                korrektSvar = true;
            }
            else if(svar == 2){
                retOplysninger();
                korrektSvar = true;
            }
            else if(svar == 3){
                tilfoejDeltagere();
                korrektSvar = true;
            }
            else if(svar == 4){
                seDeltagere();
                korrektSvar = true;
            }
            else if(svar == 5){
                Menu.main();
                korrektSvar = true;
            }
            else{
                System.out.println("Det indtastede valg (" + svar + ") eksisterer ikke.");
            }
        }
    }

    private static void opretHold () {
        System.out.println("Medlem oprettet");
        Menu.main();
    }

    private static void retOplysninger () {
        System.out.println("Oplysninger rettet");
        Menu.main();
    }

    private static void tilfoejDeltagere () {
        System.out.println("Tider tilføjet");
        Menu.main();
    }

    private static void seDeltagere () {
        System.out.println("Hér ser du masser af medlemmer");
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
