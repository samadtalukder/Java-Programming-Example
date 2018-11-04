package com.coupling;

class ShoppingCartEntry {
    public float price;
    public int quantity;

    public float getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    public ShoppingCartEntry[] items;

    public float getTotalPrice() {
        float totalPrice = 0;
        for (ShoppingCartEntry item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

class Order {
    private ShoppingCart cart;
    private float salesTax;

    public Order(ShoppingCart cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float orderTotalPrice() {
        float cartTotalPrice = 0;
        /*for (int i=0;i<cart.items.length;i++){
            cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
        }
        cartTotalPrice += cartTotalPrice * salesTax;
        return  cartTotalPrice;*/
        return cart.getTotalPrice() * (1.0f + salesTax);
    }
}
