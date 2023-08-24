package dev.rpmhub;


import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.io.Serial;

@Builder
@Data
public class Dto {
    private double kmH;

}
