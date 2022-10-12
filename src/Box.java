public class Box {
    int height;
    int width;
    int length;

    public void increaseBoxSize() {
        height = height * 2;
        width = width * 2;
        length = length * 2;
        //läggs i klassen med grundinformation för att kunna justera data utan att skriva ut alla variabler igen
    }
    public void printBoxInfo() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
    }
}
