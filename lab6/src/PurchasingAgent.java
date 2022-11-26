/**
 * Lab 6 - Threading
 * PurchasingAgent class
 * Stefana Chiritescu
 * A00282343
 */

public class PurchasingAgent {

    public PurchasingAgent() {

        //used to discover how many instances of this class are being created
        System.out.println("Creating a purchasing agent...");
    }

    public void purchase() {
        Store store = Store.getInstance();
        synchronized (store) {
            if (store.getShirtCount() > 0 &&
                    store.authorizeCreditCard("1234", 15.00)) {
                Shirt shirt = store.takeShirt();
                System.out.println("The shirt is ours!");
                System.out.println(shirt);
            } else {
                System.out.println("No shirt for you");
            }
        }
    }
}
