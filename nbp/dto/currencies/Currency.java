package pl.sda.academy.javalon1.cantor.nbp.dto.currencies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Currency {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("code")
    private String code;
    @JsonProperty("bid")
    private double bid;
    @JsonProperty("ask")
    private double ask;

}
