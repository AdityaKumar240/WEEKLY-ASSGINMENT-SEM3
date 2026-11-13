package encapsulation.assigment_problems;
public class ShoppingCart {
    private final String cartId;
    private final double[] prices;
    private int itemCount;
    public ShoppingCart(String cartId, int capacity) {
        this.cartId = cartId; prices = new double[capacity];
    }
    public void addItem(double price) {
        if (price >= 0 && itemCount < prices.length) prices[itemCount++] = price;
        else System.out.println("Invalid price or cart is full");
    }
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) total += prices[i];
        return total;
    }
    public int getItemCount() { return itemCount; }
    public String getCartId() { return cartId; }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("CART-5", 20);
        cart.addItem(250); cart.addItem(99); cart.addItem(151);
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Count: " + cart.getItemCount());
    }
}