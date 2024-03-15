public class Revizor {
    public void closeStore(Store store) {
        String storeName = store.getName();
        if (storeName.equals("IKEA")) {
            storeName = null;
            System.out.println(storeName);
        }
        else {
            System.out.println(storeName);
        }
    }

    public void rebrand(Store store) {
        String storeName = store.getName();
        if (storeName.equals("MacDonalds")) {
            storeName = "Вкусно и точка";
            System.out.println(storeName);
        }
        else {
            String newStoreName = storeName.substring(1);
            System.out.println(newStoreName);
        }
    }
}
