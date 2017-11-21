import java.util.InputMismatchException;
import java.util.Scanner;

public class Top5 {

    public static Scanner in = new Scanner(System.in).useDelimiter("\\n");

    public static void menu () {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("[Top 5 svømmere]");
        System.out.println("Hvad ønsker du at gøre?");
        System.out.println(" ");
        System.out.println("1. Se Top 5 - Crawl");
        System.out.println("2. Se Top 5 - Brystsvømning");
        System.out.println("3. Se Top 5 - Rygsvømning");
        System.out.println("4. Se Top 5 - Butterfly");
        System.out.println("5. Afslut");

        boolean korrektSvar = false;

        while(!korrektSvar){
            int svar = intRespons();
            if(svar == 1){
                crawlTop5();
                korrektSvar = true;
            }
            else if(svar == 2){
                brystTop5();
                korrektSvar = true;
            }
            else if(svar == 3){
                rygTop5();
                korrektSvar = true;
            }
            else if(svar == 4){
                butterflyTop5();
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

    private static void crawlTop5 () {
        System.out.println("Medlem oprettet");
        Menu.main();
    }

    private static void brystTop5 () {
        System.out.println("Oplysninger rettet");
        Menu.main();
    }

    private static void rygTop5 () {
        System.out.println("Tider tilføjet");
        Menu.main();
    }

    private static void butterflyTop5 () {
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
