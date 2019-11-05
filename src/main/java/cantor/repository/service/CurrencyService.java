package cantor.repository.service;

import cantor.nbp.dto.currencies.CurrencyExchange;
import cantor.repository.api.CurrencyApi;

import java.util.List;
import java.util.stream.Collectors;

public class CurrencyService {

    private final CurrencyApi currencyApi;

    public CurrencyService() {
        currencyApi = new CurrencyApi();
    }

    public List<String> getCurrenciesList() {

        CurrencyExchange data = currencyApi.getData();
        return data.getRates()
                .stream()
                .map(x -> x.getCode())
                .collect(Collectors.toList());
    }
}