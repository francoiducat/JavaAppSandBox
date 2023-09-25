package net.ducatillon.javasandbox.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    int id;
    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("last_name")
    String lastName;
}
