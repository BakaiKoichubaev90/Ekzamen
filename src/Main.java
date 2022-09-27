import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        String knopka = " ";
        while (!knopka.equals("x")) {
            System.out.println("__________________________________________");
            System.out.println("1 - Polozhit dengi na shet");
            System.out.println("2 - Uvedet tekushiy ostatok na cshetu");
            System.out.println("3 - Snyt dengi s csheta");

            knopka = scanner.nextLine();
            try {
                switch (knopka) {
                    case "1" -> bankAccount.deposit(scanner1.nextDouble());
                    case "2" -> System.out.println(bankAccount.getAmount());
                    case "3" -> bankAccount.withDraw(scanner1.nextInt());
                    default -> System.out.println("Myndai knopka jok");
                }
            } catch (LimitException e) {
                e.getRemainingAmount();
            }
        }
    }
}
