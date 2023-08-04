package com.starkmotors.domain;

import java.util.Objects;
import java.util.UUID;

public class CarId {
    private final UUID id;

    public CarId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarId carId = (CarId) o;
        return Objects.equals(id, carId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
