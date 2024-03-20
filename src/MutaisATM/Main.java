public class Main {
    public static void main(String[] args) {
        Account Mutai = new Account("Mutai", "234234");

        System.out.println(Mutai.getName());
        System.out.println(Mutai.getBalance());

        Mutai.transfer("Nancy", 40);

        System.out.println(Mutai.getBalance());

    }
}
