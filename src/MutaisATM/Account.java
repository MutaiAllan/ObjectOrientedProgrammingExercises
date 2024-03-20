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

    public int getBalance() {
        return balance;
    }

    public void transfer(String recepientName, int amount){
        this.balance -= amount;
    }

}