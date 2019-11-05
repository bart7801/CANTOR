package cantor.nbp.dto.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RateExchange {
    @JsonProperty("table")
    private String table;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("code")
    private String code;
    @JsonProperty("rates")
    private List<Rate> rates;

}

