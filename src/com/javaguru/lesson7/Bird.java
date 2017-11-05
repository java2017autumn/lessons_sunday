package com.javaguru.lesson7;

public class Bird implements Comparable<Bird>{

    private int weight;
    private String name;

    public Bird(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;

        Bird bird = (Bird) o;

        if (getWeight() != bird.getWeight()) return false;
        return getName() != null ? getName().equals(bird.getName()) : bird.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getWeight();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird o) {
        return Integer.compare(weight, o.getWeight());
    }
}
