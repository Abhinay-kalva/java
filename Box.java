public class Box<T> {
    private T item;
    public Box(T item) {
        this.item = item;
    }
    public void displayItem() {
        System.out.println("Item: " + item.toString());
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        intBox.displayItem();
        Box<String> strBox = new Box<>("Hello, World!");
        strBox.displayItem();
        Box<Double> doubleBox = new Box<>(45.67);
        doubleBox.displayItem();
    }
}
