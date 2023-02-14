package net.ducatillon.javasandbox.streams;

import net.ducatillon.javasandbox.streams.data.Item;
import net.ducatillon.javasandbox.streams.data.Parcel;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayingWithLinkedHashSet {

    public static void main(String[] args) {
        work();
    }

    private static void work() {

        Item item1 = new Item("2f5f6a45-41b0-4253-9b69-9c2768fd9a4b");
        Item item2 = new Item("447b1cbc-ca56-4bc8-820c-ca018d11abb5");
        Item item3 = new Item("e507f5a3-71e0-4354-a9d4-6c441c7e88bb");
        List<Item> items = Arrays.asList(item3, item2, item1);
        Parcel parcel = new Parcel("parcel", items);

        List<Item> itemsList = parcel.getItems().stream().collect(Collectors.toList());
        Set<Item> itemsSet = parcel.getItems().stream().collect(Collectors.toSet());
        LinkedHashSet<Item> itemsLinkedHashSet = parcel.getItems().stream().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("itemsList: " + itemsList);
        System.out.println("itemsSet: " + itemsSet);
        System.out.println("itemsLinkedHashSet: " + itemsLinkedHashSet);
    }


}
