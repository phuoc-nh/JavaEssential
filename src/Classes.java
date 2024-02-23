public class Classes {
    public static void main(String[] args) {
        var iphoneX = new Iphone(IphoneModels.IPHONE_7, 123);
        var iphone11 = new Iphone(IphoneModels.IPHONE_11, 1231);
        System.out.println(iphoneX.getModel().getModesl());;
        System.out.println(iphoneX.getModel());;

        System.out.println(iphoneX.toString());
    }
}
