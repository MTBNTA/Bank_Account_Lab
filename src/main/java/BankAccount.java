import java.time.LocalDate;

//  ------- PROPERTIES --------
public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;   // balance should start at 0

//    ------ CONSTRUCTOR -------
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }


//    ------- METHODS --------
    public int deposit(int inputAmount){
        this.balance += inputAmount;
        return balance;
    }

    public  int withdrawal(int outputAmount){
        this.balance -= outputAmount;
        return balance;
    }

    public double payInterest(int percentageInterest){
        balance = this.balance * percentageInterest;
        return balance;
    }


//    ----- GETTERS & SETTERS ------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
