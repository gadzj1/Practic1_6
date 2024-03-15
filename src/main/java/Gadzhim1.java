import java.util.Scanner;

public class Gadzhim1 {
    public static void main(String[] args) {
        System.out.println("Магомедов Гаджи Вариант 5");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите название");
        String inputName = input.next();

        Store store = new Store();
        store.setName(inputName);

        Revizor revizor = new Revizor();
        revizor.closeStore(store);
        revizor.rebrand(store);
    }
}