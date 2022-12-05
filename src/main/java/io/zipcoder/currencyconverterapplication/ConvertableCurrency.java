package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    ConvertableCurrency currency = null;
    CurrencyType getCurrencyType();
    default Double convert(CurrencyType currencyType) {return currencyType.getRate();}
}
