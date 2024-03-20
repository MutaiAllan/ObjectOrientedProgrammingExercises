import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account Mutai = new Account("Mutai", "234234", "password");
        // Account Mutai1 = new Account("Mutai1", "2342");

        // System.out.println(Mutai.getName());
        // System.out.println(Mutai.getBalance());

        // System.out.println(Mutai1.getName());

        // Mutai.transfer("Nancy", 40);

        // System.out.println(Mutai.getBalance());

        // Mutai.getAccountDetails(Mutai1);

        Scanner scanner = new Scanner(System.in);

        landingPage();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                createAccount(scanner);
                break;
            case 2:
                // login(scanner);
                System.out.print("Enter name: ");
                scanner.nextLine();
                String existingName = scanner.nextLine();

                System.out.print("Enter password: ");
                String existingPassword = scanner.nextLine();

                String yourPassword = getPassword(Mutai);

                if (existingPassword != yourPassword) {
                    System.out.println("Invalid Password!");
                } else {
                    System.out.println(yourPassword);
                }
                break;
            default:
                System.out.println("Invalid choice, try again");
        }

        scanner.close();

    }


    public static void landingPage(){
            System.out.println("Welcome to Mutai's ATM!");
            System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
        }


    public static void createAccount(Scanner scanner) {
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter account name: ");
        Account newAccount = new Account(name, accNo, password);

        System.out.println("Account created successfully.");
        getAccountDetails(newAccount);
        System.out.println();
        main(null);
    }

    // public static void login(Scanner scanner) {
    //     System.out.print("Enter name: ");
    //     scanner.nextLine();
    //     String name = scanner.nextLine();

    //     System.out.print("Enter password: ");
    //     String password = scanner.nextLine();

    //     System.out.println(getPassword(userAccount));
    //     // System.out.println("Name:" + account.getName());
    //     // System.out.println("Balance:" + account.getBalance());
    // }


    public static void getAccountDetails(Account account) {
        System.out.println("Name:" + account.getName());
        System.out.println("Account No:" + account.getAccNo());
        System.out.println("Balance:" + account.getBalance());
    }

    public static String getPassword(Account account) {
        return account.getPassword();
    }

}
