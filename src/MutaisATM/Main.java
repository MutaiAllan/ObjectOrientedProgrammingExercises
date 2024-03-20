public class Main {
    public static void main(String[] args) {
        Account Mutai = new Account("Mutai", "234234");
        Account Mutai1 = new Account("Mutai1", "2342");

        System.out.println(Mutai.getName());
        System.out.println(Mutai.getBalance());

        System.out.println(Mutai1.getName());

        Mutai.transfer("Nancy", 40);

        System.out.println(Mutai.getBalance());

        Mutai.getAccountDetails(Mutai1);

    }
}
