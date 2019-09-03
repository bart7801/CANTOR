package pl.sda.academy.javalon1.cantor.service;

import pl.sda.academy.javalon1.cantor.nbp.dto.exchange.RateExchange;
import pl.sda.academy.javalon1.cantor.repository.api.ExchangeApi;

public class ExchangeService {

    private final ExchangeApi exchangeApi;

    public ExchangeService() {
        exchangeApi = new ExchangeApi();
    }

    public String getBuyCourseForCurrencyAndDate(String currency, String date) {

        RateExchange data = exchangeApi.getData(currency, date);
        double bid = data.getRates().get(0).getBid();
        return String.valueOf(bid);

    }
}