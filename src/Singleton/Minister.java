package Singleton;

public class Minister {
    public static void main(String[] args) {
        King king1 = King.getInstance();
        king1.kingInfo();

        King king2 = King.getInstance();
        king2.kingInfo();
    }
}
