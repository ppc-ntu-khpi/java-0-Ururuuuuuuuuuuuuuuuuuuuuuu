public class Shirt {
    public int shirtID = 32;
    public String description = "РУБАХА";
    public String colorCode = "U";
    public double price = 9.0;
    public int quantityInStock = 0;
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }


    public Shirt(int shirtID, String description, String colorCode, double price, int quantityInStock) {
        this.shirtID = shirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String  getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}