package cantor.nbp.dto.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rate {
    @JsonProperty("no")
    private String number;
    @JsonProperty("effectiveDate")
    private String date;
    @JsonProperty("bid")
    private double bid;
    @JsonProperty("ask")
    private double ask;

}
