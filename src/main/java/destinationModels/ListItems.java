package destinationModels;

public class ListItems {
    private String someName;
    private String atr2;

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public String getAtr2() {
        return atr2;
    }

    public void setAtr2(String atr2) {
        this.atr2 = atr2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListItems listItems = (ListItems) o;

        if (someName != null ? !someName.equals(listItems.someName) : listItems.someName != null) return false;
        return !(atr2 != null ? !atr2.equals(listItems.atr2) : listItems.atr2 != null);

    }

    @Override
    public int hashCode() {
        int result = someName != null ? someName.hashCode() : 0;
        result = 31 * result + (atr2 != null ? atr2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListItems{" +
                "someName='" + someName + '\'' +
                ", atr2='" + atr2 + '\'' +
                '}';
    }
}
