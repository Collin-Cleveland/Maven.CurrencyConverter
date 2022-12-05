package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    CurrencyType cType = CurrencyType.SINGAPORE_DOLLAR;
    public CurrencyType getCurrencyType() {
        return this.cType;
    }

    public Double convert(CurrencyType ct) {
        return ct.getRate() / cType.getRate();
    }
}
