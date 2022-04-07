package net.ducatillon.javasandbox.streams;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import net.ducatillon.javasandbox.streams.data.Item;
import net.ducatillon.javasandbox.streams.data.Parcel;


@Slf4j
public class PlayingWithFlatMap {


    private void playingWithFlatMap() {

    //Parcel 1
    final Item laptop = Item.builder().name("Laptop").build();
    final Item phone = Item.builder().name("Phone").build();
    final List<Item> list1 = Arrays.asList(laptop, phone);
    final Parcel parcel1 = Parcel.builder().items(list1).build();

    //Parcel 2
    final Item mouse = Item.builder().name("Mouse").build();
    final Item keyboard = Item.builder().name("Keyboard").build();
    final List<Item> list2 = Arrays.asList(laptop, phone);
    final Parcel parcel2 = Parcel.builder().items(list2).build();

    List<Parcel> parcels = Arrays.asList(parcel1,parcel2);
    log.info(parcels.toString());

    List<List<Item>> lists = Arrays.asList(list1,list2);
    log.info(lists.toString());

  }


  }
