package project_CoreJava;
class setData extends amazon{
    private double price;
    private String brand;
    private String model;

    void setPrice(double price) {
        this.price = price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    setData(double price, String model, String brand) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }
}
