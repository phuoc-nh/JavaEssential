public class Iphone {
    private IphoneModels model;
    private double price;

    public Iphone(IphoneModels model, double price) {
        this.model = model;
        this.price = price;
    }

    public Iphone(IphoneModels model) {
        this(model, 11);
        this.model = model;
    }

    public IphoneModels getModel() {
        return model;
    }

    public void setModel(IphoneModels model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
