package doStuff;

import destinationModels.MergedModel;
import models.*;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExecuteMappings {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("mapping.xml");
        Mapper mapper = new DozerBeanMapper(list);

        TopLevel topLevel = new TopLevel();
        topLevel.setName("Name");
        topLevel.setColor("Color");

        PairItem pairItem = new PairItem();
        PairItem pairItem2 = new PairItem();

        pairItem.setKey("key1");
        pairItem.setValue("value1");

        pairItem2.setKey("key2");
        pairItem2.setValue("value2");

        topLevel.setPairItemList(Arrays.asList(pairItem,pairItem2));

        SecondLevel secondLevel = new SecondLevel();
        secondLevel.setName("second name");
        secondLevel.setLocation("fancy");
        topLevel.setSecondLevel(secondLevel);

        ThirdLevel thirdLevel = new ThirdLevel();
        thirdLevel.setName("thirdName");

        secondLevel.setThirdLevel(thirdLevel);

        ListModel listModel = new ListModel();
        ListModel listModel1 = new ListModel();

        listModel.setName("someName");
        listModel.setAge("100");
        listModel1.setName("thisName");
        listModel1.setAge("500");

        topLevel.setListModelList(Arrays.asList(listModel, listModel1));
//        topLevel.setListModelList(new ArrayList<ListModel>());

        MergedModel a = mapper.map(topLevel, MergedModel.class, "rootMapping");
        System.out.println(topLevel.toString());
        System.out.println(a.toString());

        TopLevel tl = mapper.map(a, TopLevel.class, "rootMapping");
        System.out.println(tl);
    }
}
