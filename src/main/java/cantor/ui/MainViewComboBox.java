package cantor.ui;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import cantor.repository.service.CurrencyService;

class MainViewComboBox extends ComboBox<String> {

    MainViewComboBox(CurrencyService currencyService) {
        super(FXCollections.observableArrayList(currencyService.getCurrenciesList()));
    }
}