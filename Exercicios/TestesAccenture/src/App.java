import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaInformado, mesInformado, anoInformado;
        boolean bissexto;
        int[] meses31dias = {1, 3, 5, 7, 8, 10, 12};
        int[] meses30dias = {4, 6, 9, 11};

        int numeroDias = 0;

        System.out.println("Informe o dia: ");
        diaInformado = scanner.nextInt();
        System.out.println("Informe o mês: ");
        mesInformado = scanner.nextInt();
        System.out.println("Informe o ano: ");
        anoInformado = scanner.nextInt();

        // Verifica se o ano é bissexto
        bissexto = (anoInformado % 4 == 0 && anoInformado % 100 != 0) || (anoInformado % 400 == 0);

        // Adiciona os dias completos dos meses anteriores
        for (int i = 1; i < mesInformado; i++) {
            if (i == 2) {
                numeroDias = numeroDias + (bissexto ? 29 : 28);
            } else if (mesPossui31Dias(i)) {
                numeroDias = numeroDias + 31;
            } else {
                numeroDias = numeroDias + 30;
            }
        }

        // Adiciona os dias do mês atual
        numeroDias = numeroDias + diaInformado;

        System.out.println("Número de dias desde o início do ano é de: " + numeroDias);

        scanner.close();
    }

    // Método para verificar se um mês possui 31 dias
    private static boolean mesPossui31Dias(int mes) {
        int[] meses31dias = {1, 3, 5, 7, 8, 10, 12};
        for (int m : meses31dias) {
            if (mes == m) {
                return true;
            }
        }
        return false;
    }
}