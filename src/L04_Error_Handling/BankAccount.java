package L04_Error_Handling;

public class BankAccount {

    private String accountId;
    private String owner;
    private double balance;

    public BankAccount(String accountId, String owner, double initialBalance) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = initialBalance;
    }

    /*
    TODO: Throw InvalidAmountException if amount <= 0.
    Deposits the given amount into this account.
    Depozitează suma dată în contul this.
    */
    public void deposit(double amount) {
        // TODO: validate amount.
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountId +
                ". New balance: " + balance);
    }
    /*
    TODO: Throw InvalidAmountException if amount <= 0.
    TODO: Throw InsufficientFundsException if balance < amount.
    Withdraws the given amount from this account.
    Retrage suma dată din acest cont.
    */
    public void withdraw(double amount) {
        /*
        TODO: validate amount
        TODO: check balance
         */
        balance -= amount;
        System.out.println("Withdrew " + amount + " from account " + accountId +
                ". New balance: " + balance);
    }
    /*
    TODO: Throw InvalidAmountException if amount <= 0.
    TODO: Throw InsufficientFundsException if this account's balance < amount.
    Transfers the given amount from this account to the target account.
    Transferă suma dată din acest cont în contul target.
    */
    public void transfer(BankAccount target, double amount) {
        // TODO: validate, then withdraw from this and deposit to target
        // TODO_RO: validează, apoi retrage din this și depozitează în target.
        this.balance -= amount;
        target.balance += amount;
        System.out.println("Transferred " + amount + " from " + accountId +
                " to " + target.accountId);
    }

    public String getAccountId() { return accountId; }
    public String getOwner()     { return owner; }
    public double getBalance()   { return balance; }

    @Override
    public String toString() {
        return "BankAccount[id=" + accountId + ", owner=" + owner +
                ", balance=" + balance + "]";
    }
}