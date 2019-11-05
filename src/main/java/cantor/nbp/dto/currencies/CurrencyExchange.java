package cantor.nbp.dto.currencies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CurrencyExchange {
    @JsonProperty("table")
    private String table;
    @JsonProperty("no")
    private String number;
    @JsonProperty("tradingDate")
    private String tradingDate;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("rates")
    private List<Currency> rates;


}

