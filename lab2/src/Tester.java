/**
 * Lab 2 - Locks
 * Tester (Main) class
 * Stefana Chiritescu
 * A00282343
 */

public class Tester {

    public static void main(String[] args) {

        Bank b = new Bank();

        System.out.printf("Account : Initial Balance: " + b.getBalance() + "\n");

        BankThread[] threads = new BankThread[2];

        threads[0] = new BankThread(b);
        threads[1] = new BankThread(b);

        //thread[0]
        for (int i = 0; i < 100; i++) {
            threads[0].b.addAmount();

            try {
                threads[0].sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

            threads[1].b.subtractAmount();

            try {
                threads[1].sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Account : Final Balance: " + b.getBalance());

    }

}
