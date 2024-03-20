public class Account {
    private String name;
    private String accNo;
    private int balance;

    public Account (String name, String accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;
    }

    public String getName(){
        return name;
    }

    public String getAccNo(){
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void transfer(String accNo, int amount){
        this.balance -= amount;
    }

    public void getAccountDetails(Account account) {
        System.out.println("Name:" + account.getName());
        System.out.println("Account No:" + account.getAccNo());
        System.out.println("Balance:" + account.getBalance());
    }

}