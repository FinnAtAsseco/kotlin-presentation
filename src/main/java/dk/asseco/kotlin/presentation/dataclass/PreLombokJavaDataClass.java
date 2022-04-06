package dk.asseco.kotlin.presentation.dataclass;

import java.util.Objects;

public class PreLombokJavaDataClass {
    private String name;
    private String email;
    private int points;

    public PreLombokJavaDataClass() {
    }

    public PreLombokJavaDataClass(String name, String email, int points) {
        this.name = name;
        this.email = email;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreLombokJavaDataClass that = (PreLombokJavaDataClass) o;
        return points == that.points &&
            Objects.equals(name, that.name) &&
            Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, points);
    }

    @Override
    public String toString() {
        return "PreLombokDataClass{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", points=" + points +
            '}';
    }
}
