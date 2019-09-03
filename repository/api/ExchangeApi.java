package pl.sda.academy.javalon1.cantor.repository.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.academy.javalon1.cantor.nbp.dto.exchange.RateExchange;

import java.io.IOException;

public class ExchangeApi {

    private final NBPConnector nbpConnector;
    private final ObjectMapper objectMapper;

    public ExchangeApi() {
        nbpConnector = new NBPConnector();
        objectMapper = new ObjectMapper();
    }

    public String createUrlForNbp(String currency, String date) {
        return "http://api.nbp.pl/api/exchangerates/rates/c/" +
                currency +
                "/" + date +
                "/?format=json";
    }

    public RateExchange getData(String currency, String date) {
        try {
            String data = nbpConnector.downloadData(createUrlForNbp(currency, date));
            return objectMapper.readValue(data, RateExchange.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}