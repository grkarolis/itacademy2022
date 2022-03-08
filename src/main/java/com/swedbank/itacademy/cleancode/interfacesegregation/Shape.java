package com.swedbank.itacademy.cleancode.interfacesegregation;

import java.math.BigDecimal;

public interface Shape {
    BigDecimal calculatePerimeter();
    BigDecimal calculateArea();
    BigDecimal calculateVolume();
}
