public class BoxDemo {
    public static void main(String[] args) {
        int i = 2;

        Box smallBox = new Box();
            smallBox.height = 10;
            smallBox.width = 5;
            smallBox.length = 10;

        System.out.println(smallBox.height);

        //increaseBoxSize(smallBox);
        smallBox.increaseBoxSize();
        smallBox.printBoxInfo();
    }

    public static void increaseBoxSize(Box box){
        box.length = box.length * 2;
        box.width = box.width * 2;
        box.height = box.height * 2;
    }
}
