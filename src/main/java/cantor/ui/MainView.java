package cantor.ui;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import cantor.repository.service.CurrencyService;
import cantor.repository.service.ExchangeService;

class MainView extends VBox {

    private final ExchangeService exchangeService;
    private final CurrencyService currencyService;

    private final ComboBox<String> currencyComboBox;
    private final DatePicker datePicker;
    private final Button runButton;
    private final Text resultText;

    MainView() {
        this.exchangeService = new ExchangeService();
        this.currencyService = new CurrencyService();

        this.currencyComboBox = new MainViewComboBox(currencyService);
        this.datePicker = new DatePicker();
        this.resultText = new Text();
        this.runButton = new MainViewButton(currencyComboBox, datePicker, exchangeService, resultText);

        this.getChildren().addAll(currencyComboBox, datePicker, runButton, resultText);
    }
}