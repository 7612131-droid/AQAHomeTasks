package java_hw_7_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse <String> warehouse=new Warehouse<>();

        System.out.println("Is warehouse empty?");
        System.out.println(warehouse.isEmpty());

        System.out.println("Adding items");
        warehouse.addItem("Table");
        warehouse.addItem("Chair");
        warehouse.addItem("Sofa");
        warehouse.addItem("Kitchen");

        System.out.println("Item count:");
        System.out.println(warehouse.getItemCount());

        System.out.println("Retrieve all items:");
        List<String> retrievedItems = warehouse.retrieveAll();
        System.out.println(retrievedItems);

        System.out.println("Item count after retrieveAll:");
        System.out.println(warehouse.getItemCount());

        System.out.println("Is warehouse empty?");
        System.out.println(warehouse.isEmpty());

        System.out.println("Add items again:");
        warehouse.addItem("Phone");
        warehouse.addItem("Tablet");
        warehouse.addItem("Laptop");

        System.out.println("View items:");
        System.out.println(warehouse.viewItems());

        System.out.println("Clear warehouse:");
        warehouse.clear();

        System.out.println("Is warehouse empty after clear?");
        System.out.println(warehouse.isEmpty());






    }
}
