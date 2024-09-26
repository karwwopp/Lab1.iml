class Stock {
    private String product;
    private double cost;
    private boolean quantity;
    public Stock() {
        product = "Мяч";
        cost = 7.5;
        quantity = true;
    }
    public Stock(String product, double cost, boolean quantity) {
        this.product = product;
        this.cost = cost;
        this.quantity = quantity;
    }
    public void printProduct() {
        System.out.println("Название товара: "+product);
    }
    public void printCost() {
        System.out.println("Цена товара: "+cost);
    }
    public void printQuantity() {
        if(quantity) {
            System.out.println("Есть в наличии");
        }
        else{
            System.out.println("Нет в наличии");
        }
    }
}