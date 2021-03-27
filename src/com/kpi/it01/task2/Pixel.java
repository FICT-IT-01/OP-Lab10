package com.kpi.it01.task2;

import java.util.Objects;

public abstract class Pixel {
    private Coordinates coordinates;

    public Pixel(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Pixel" + coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pixel pixel = (Pixel) o;

        return Objects.equals(coordinates, pixel.coordinates);
    }

    @Override
    public int hashCode() {
        return coordinates.hashCode();
    }
}
