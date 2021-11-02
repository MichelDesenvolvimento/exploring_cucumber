package hellocucumber.comum.massa.model;

import java.util.Objects;

public class Massa {

    private final String id;
    private final String day;
    private final String example;

    public Massa(String id, String day, String example) {
        this.id = id;
        this.day = day;
        this.example = example;
    }

    public String getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public String getExample() {
        return example;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massa massa = (Massa) o;
        return id.equals(massa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
