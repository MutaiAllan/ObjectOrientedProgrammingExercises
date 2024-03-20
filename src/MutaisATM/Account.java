public class Account {
    private String name;
    private String accNo;
    private int balance;
    public String password;

    public Account (String name, String accNo, String password) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void depositMoney(int amount){
        if(amount <= 0){
            System.out.println("Enter amount more than 0!");
        }
        else {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        }
    }

    public void transfer(Account accNo, int amount){
        this.balance -= amount;
        accNo.balance += amount;
    }

}