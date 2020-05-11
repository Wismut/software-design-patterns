package patterns.structural.composite;

public class GiftRunner {
    public static void main(String[] args) {
        Gift book = new Book();
        Gift pen = new Pen();
        Gift phone = new Phone();
        ComponentGift componentGift = new ComponentGift(book, phone);
        ComponentGift mainGift = new ComponentGift(componentGift);
        mainGift.addGift(pen);
        mainGift.printName();
    }
}
