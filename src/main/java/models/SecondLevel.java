package models;

public class SecondLevel {
    private String name;
    private String location;

    private ThirdLevel thirdLevel;

    public ThirdLevel getThirdLevel() {
        return thirdLevel;
    }

    public void setThirdLevel(ThirdLevel thirdLevel) {
        this.thirdLevel = thirdLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecondLevel that = (SecondLevel) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        return !(thirdLevel != null ? !thirdLevel.equals(that.thirdLevel) : that.thirdLevel != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (thirdLevel != null ? thirdLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SecondLevel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", thirdLevel=" + thirdLevel +
                '}';
    }

}
