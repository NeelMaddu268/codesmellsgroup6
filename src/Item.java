class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
        this.discountAmount = discountAmount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscount() {
        double newPrice = price;
        switch (discountType) {
            case PERCENTAGE:
                newPrice -= discountAmount * newPrice;
                break;
            case AMOUNT:
                newPrice -= discountAmount;
                break;
            default:
                // no discount
                break;
        }
        return newPrice;
    }
}
