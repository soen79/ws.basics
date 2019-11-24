package com.greenleaf.functionalinterfaces;

/**
 * we want this to map one type to another and throw an exception if needed.
 *
 * We want the types to be dynamic/generic
 * We want to throw a dynamic/generic exception that inherits from Throwable
 */
@FunctionalInterface
public interface RawMapper <I,O,E extends Throwable>{

    O convert(I input) throws E;
}
