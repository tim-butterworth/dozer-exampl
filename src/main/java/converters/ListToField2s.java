package converters;

import models.PairItem;
import org.dozer.ConfigurableCustomConverter;

import java.util.List;

public class ListToField2s implements ConfigurableCustomConverter {

    private String parameter;

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Object convert(Object destinationObj, Object sourceObj, Class<?> destinationClass, Class<?> sourceClass) {
        if(sourceObj instanceof List){
            String result = "";
            List<PairItem> pairItemList = (List) sourceObj;
            for(PairItem item:pairItemList){
                if("key2".equals(item.getKey())) result = item.getValue();
            }
            return result;
        } else {
            PairItem item = new PairItem();
            ((List)destinationObj).add(item);
            item.setKey("key2");
            item.setValue((String)sourceObj);
            return destinationObj;
        }
    }
}
