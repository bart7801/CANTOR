package pl.sda.academy.javalon1.cantor.repository.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.academy.javalon1.cantor.nbp.dto.currencies.CurrencyExchange;

import java.io.IOException;

public class CurrencyApi {
    private final NBPConnector nbpConnector;
    private final ObjectMapper objectMapper;

    private static final String apiUrl = "http://api.nbp.pl/api/exchangerates/tables/C/last/1?format=json";

    public CurrencyApi() {
        nbpConnector = new NBPConnector();
        objectMapper = new ObjectMapper();
    }

    public CurrencyExchange getData() {
        try {
            String data = nbpConnector.downloadData(apiUrl);
            return objectMapper.readValue(data, CurrencyExchange[].class)[0];
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}