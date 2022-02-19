package com.doughlima.passwordchecker.service.validation;

/**
 * defines a contract to be implemented in all validation rules
 * that will be instantiated via polymorphism
 * @param <E> Generic - defines the parameter in the validation implementation
 * that will be performed
 * @author Douglas Lima
 */
public interface ValidationRule<E> {
    /**
     * @param value Generic - value to be performed
     * @return Boolean - for pass or fail validation
     */
    boolean validate(E value);
}
