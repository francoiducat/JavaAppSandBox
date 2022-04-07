package net.ducatillon.javasandbox.streams.data;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class Parcel {
  private List<Item> items;
}
