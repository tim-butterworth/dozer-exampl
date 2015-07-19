package models;

import java.util.List;

public class TopLevel {

    private String name;
    private String color;
    private SecondLevel secondLevel;
    private List<ListModel> listModelList;
    private List<PairItem> pairItemList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SecondLevel getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(SecondLevel secondLevel) {
        this.secondLevel = secondLevel;
    }

    public List<ListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<ListModel> listModelList) {
        this.listModelList = listModelList;
    }

    public List<PairItem> getPairItemList() {
        return pairItemList;
    }

    public void setPairItemList(List<PairItem> pairItemList) {
        this.pairItemList = pairItemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopLevel topLevel = (TopLevel) o;

        if (name != null ? !name.equals(topLevel.name) : topLevel.name != null) return false;
        if (color != null ? !color.equals(topLevel.color) : topLevel.color != null) return false;
        if (secondLevel != null ? !secondLevel.equals(topLevel.secondLevel) : topLevel.secondLevel != null)
            return false;
        if (listModelList != null ? !listModelList.equals(topLevel.listModelList) : topLevel.listModelList != null)
            return false;
        return !(pairItemList != null ? !pairItemList.equals(topLevel.pairItemList) : topLevel.pairItemList != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (secondLevel != null ? secondLevel.hashCode() : 0);
        result = 31 * result + (listModelList != null ? listModelList.hashCode() : 0);
        result = 31 * result + (pairItemList != null ? pairItemList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TopLevel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", secondLevel=" + secondLevel +
                ", listModelList=" + listModelList +
                ", pairItemList=" + pairItemList +
                '}';
    }
}
