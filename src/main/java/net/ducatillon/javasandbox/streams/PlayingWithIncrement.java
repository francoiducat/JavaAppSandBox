package net.ducatillon.javasandbox.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PlayingWithIncrement {

    static Item item1 = new Item("item1", 1);
    static Item item2 = new Item("item2", 2);
    static Item item3 = new Item("item3", 3);

    public static void main(String[] args) {

        List<Item> itemList = List.of(item1, item2, item3);

        Integer quantity = itemList.stream()
                .collect(Collectors.summingInt(Item::getQuantity));

        Integer reduceQuantity = itemList.stream()
                .map(Item::getQuantity)
                .reduce(0, Integer::sum);

        System.out.println("quantity = " + quantity);
        System.out.println("reduceQuantity = " + reduceQuantity);

    }

    static class Item {
        String name;
        int quantity;

        Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        int getQuantity() {
            return this.quantity;
        }
    }
}
