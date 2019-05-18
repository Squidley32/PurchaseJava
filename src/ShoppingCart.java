public class ShoppingCart {
    public int itemsInCart;
    public double cartTotal;
    public String[] cartItems = new String[50];
    public int[] qtyItems = new int[50];

    public static void forDisplay(String[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                break;
            } else {
                System.out.println(b[i] + " " +a[i] + "\n");
            }
        }
    }
}