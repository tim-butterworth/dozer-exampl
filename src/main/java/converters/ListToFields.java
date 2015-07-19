package converters;

import models.PairItem;
import org.dozer.ConfigurableCustomConverter;

import java.util.ArrayList;
import java.util.List;

public class ListToFields implements ConfigurableCustomConverter {

    private String parameter;

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Object convert(Object destinationObj, Object sourceObj, Class<?> destinationClass, Class<?> sourceClass) {
        if(sourceObj instanceof List){
            String result = "";
            List<PairItem> pairItemList = (List) sourceObj;
            for(PairItem item:pairItemList){
                if("key1".equals(item.getKey())) result = item.getValue();
            }
            return result;
        } else {
            PairItem item = new PairItem();
            item.setKey("key1");
            item.setValue((String)sourceObj);
            ArrayList<PairItem> pairItems = new ArrayList<PairItem>();
            pairItems.add(item);
            return pairItems;
        }
    }
}
