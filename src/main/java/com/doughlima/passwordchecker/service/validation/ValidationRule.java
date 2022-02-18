package com.doughlima.passwordchecker.service.validation;

public interface ValidationRule<E> {
    boolean validate(E value);
}
