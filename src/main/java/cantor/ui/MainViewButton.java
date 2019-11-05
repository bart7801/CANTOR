package cantor.ui;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;
import cantor.repository.service.ExchangeService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MainViewButton extends Button {

    private static final String PARSE_FORMAT = "yyyy-MM-dd";
    private static final String BUTTON_TEXT = "GO";

    MainViewButton(
            ComboBox<String> currencyChooser,
            DatePicker datePicker,
            ExchangeService exchangeService,
            Text text) {

        this.setText(BUTTON_TEXT);
        actionForClick(currencyChooser, datePicker, exchangeService, text);

    }

    private void actionForClick(ComboBox<String> currencyChooser, DatePicker datePicker, ExchangeService exchangeService, Text text) {
        this.setOnAction(event -> {
            String currencyValue = currencyChooser.getSelectionModel().getSelectedItem();
            LocalDate date = datePicker.getValue();

            String formattedDate = date.format(DateTimeFormatter.ofPattern(PARSE_FORMAT));

            String buyCourse = exchangeService.getBuyCourseForCurrencyAndDate(currencyValue, formattedDate);
            text.setText(buyCourse);
        });
    }
}