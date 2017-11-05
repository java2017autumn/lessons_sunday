package com.javaguru.lesson7;

public class Car {

    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;

    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
