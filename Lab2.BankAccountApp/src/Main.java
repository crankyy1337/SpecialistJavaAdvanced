import Lab2.BankAccountLib.*;

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Source");
        b1.deposit(1000);
        BankAccount b2 = new BankAccount("Destination");
        //печатаем перед трансфером
        System.out.println(b1);
        System.out.println(b2);
        //трансфер и печать
        System.out.println();
        BankAccount.transfer(b1, b2, 300);
        System.out.println(b1);
        System.out.println(b2);

    }
}