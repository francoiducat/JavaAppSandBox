package net.ducatillon.javasandbox.streams.data;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Parcel {
  private String name;
  private List<Item> items;
}
