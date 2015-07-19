package destinationModels;

import java.util.List;

public class MergedModel {
    private String mergedName;
    private String mergedColor;
    private String secondName;
    private String thirdName;
    private String location;
    private String field1;
    private String field2;
    private List<ListItems> listItemsList;

    public String getMergedName() {
        return mergedName;
    }

    public void setMergedName(String mergedName) {
        this.mergedName = mergedName;
    }

    public String getMergedColor() {
        return mergedColor;
    }

    public void setMergedColor(String mergedColor) {
        this.mergedColor = mergedColor;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public List<ListItems> getListItemsList() {
        return listItemsList;
    }

    public void setListItemsList(List<ListItems> listItemsList) {
        this.listItemsList = listItemsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MergedModel that = (MergedModel) o;

        if (mergedName != null ? !mergedName.equals(that.mergedName) : that.mergedName != null) return false;
        if (mergedColor != null ? !mergedColor.equals(that.mergedColor) : that.mergedColor != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (thirdName != null ? !thirdName.equals(that.thirdName) : that.thirdName != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (field1 != null ? !field1.equals(that.field1) : that.field1 != null) return false;
        if (field2 != null ? !field2.equals(that.field2) : that.field2 != null) return false;
        return !(listItemsList != null ? !listItemsList.equals(that.listItemsList) : that.listItemsList != null);

    }

    @Override
    public int hashCode() {
        int result = mergedName != null ? mergedName.hashCode() : 0;
        result = 31 * result + (mergedColor != null ? mergedColor.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (thirdName != null ? thirdName.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (field1 != null ? field1.hashCode() : 0);
        result = 31 * result + (field2 != null ? field2.hashCode() : 0);
        result = 31 * result + (listItemsList != null ? listItemsList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MergedModel{" +
                "mergedName='" + mergedName + '\'' +
                ", mergedColor='" + mergedColor + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", location='" + location + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", listItemsList=" + listItemsList +
                '}';
    }
}
