package com.starkmotors.domain;

public interface Entity<T> {

    public boolean hasSameIdentityAs(T that);
}
