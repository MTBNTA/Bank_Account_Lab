import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {


    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Maya", "Tetteh", "2000-05-12", 84794);
    }

    @Test
    public void canGetFirstName(){
        String expected = "Maya";
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetLastName(){
        String expected = "Tetteh";
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canDateOfBirth(){
        String expected = "2000-05-12";
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        int expected = 84794;
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetBalance(){
        int expected = 0;
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName() {
        String expected = "Hannah";
        bankAccount.setFirstName("Hannah");
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
        String expected = "Smith";
        bankAccount.setLastName("Smith");
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        String expected = "1995-07-23";
        bankAccount.setDateOfBirth("1995-07-23");
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        int expected = 12345;
        bankAccount.setAccountNumber(12345);
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        int expected = 1000;
        bankAccount.setBalance(1000);
        int actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddDeposit(){
        int expected = 2000;
        int actual = bankAccount.deposit(2000);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canMakeWithdrawal(){
        int expected = -500;
        int actual = bankAccount.withdrawal(500);
        assertThat(actual).isEqualTo(expected);
    }





}
