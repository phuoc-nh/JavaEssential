public enum IphoneModels {
    IPHONE_7("IPHONE 7"),
    IPHONE_11("iPhone 11"),
    IPHONE_10("iPhone 10");

    private String model;

    IphoneModels(String model) {
        this.model =model;
    }

    public  String getModesl() {
        return this.model;
    }
}
