package com.sethjava.ocp;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
