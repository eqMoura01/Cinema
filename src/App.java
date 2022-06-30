import java.util.Scanner;

public class App {
    //Descrição no README.md
    public static void main(String[] args) throws Exception {
        String[] assento = new String[11];
        String respWhile, resp = new String();
        Scanner s = new Scanner(System.in);
        Boolean x = false;
        int n = 0;
        respWhile = "S";

        for (int i = 1; i <= 10; i++) {
            assento[i] = "B" + i;
            System.out.print("[" + assento[i] + "]");
        }

        while (respWhile.toUpperCase().equals("S")) {

            x = false;
            while (x == false) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print("[" + assento[i] + "]");
                }

                System.out.println("\nDeseja reservar qual assento?");
                resp = s.nextLine();

                if (resp.length() == 3 && Integer.parseInt(resp.substring(1, 3)) < 1
                        && Integer.parseInt(resp.substring(1, 3)) > 10
                        && resp.substring(0, 1).toUpperCase().equals("B")) {
                    n = Integer.parseInt(resp.substring(1, 3));
                    x = true;
                } else if (resp.length() == 2 && Integer.parseInt(resp.substring(1, 2)) >= 1
                        && resp.substring(0, 1).toUpperCase().equals("B")) {
                    n = Integer.parseInt(resp.substring(1, 2));
                    x = true;
                } else {
                    System.out.println("---ASSENTO INVALIDO---");
                }
            }

            if (assento[n].equals("---")) {
                System.out.println("---ERRO. ASSENTO OCUPADO!---");
            } else if (assento[n] != "---") {
                assento[n] = "---";
                System.out.println("---ASSENTO RESERVADO COM SUCESSO!---");
            }

            x = false;
            while (x == false) {
                System.out.println("\nDeseja reservar outro assento? [S]/[N]");
                respWhile = s.nextLine();
                if (respWhile.toUpperCase().equals("S")) {
                    x = true;
                } else if (respWhile.toUpperCase().equals("N")) {
                    x = true;
                } else {
                    System.out.println("---RESPOSTA INVALIDA---");
                }
            }
        }
        s.close();
    }
}
