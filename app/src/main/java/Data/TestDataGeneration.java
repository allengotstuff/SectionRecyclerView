package Data;

import java.util.ArrayList;

/**
 * *************************************************************************
 *
 * @版权所有: 北京云图微动科技有限公司 (C) 2016
 * @创建人: 孙旭光
 * @创建时间: xxx(2016-12-07 15:43)
 * @Email: 410073261@qq.com
 * <p>
 * 描述:Data-TestDataGeneration
 * <p>
 * <p>
 * *************************************************************************
 */

public class TestDataGeneration {

    public static ArrayList<SectionObject> getTestData(){
        ArrayList<SectionObject> resultData = new ArrayList<>();

        SectionObject sectionObject_1 = new SectionObject();
        SectionObject sectionObject_2 = new SectionObject();
        SectionObject sectionObject_3 = new SectionObject();

        for(int i =0; i<4;i++){
            ItemObject itemObject = new ItemObject();
            itemObject.setImageSource(i);
            sectionObject_1.addItem(itemObject);
        }

        for(int i =4; i<8;i++){
            ItemObject itemObject = new ItemObject();
            itemObject.setImageSource(i);
            sectionObject_2.addItem(itemObject);
        }

        for(int i =8; i<12;i++){
            ItemObject itemObject = new ItemObject();
            itemObject.setImageSource(i);
            sectionObject_3.addItem(itemObject);
        }

        resultData.add(sectionObject_1);
        resultData.add(sectionObject_2);
        resultData.add(sectionObject_3);

        return resultData;
    }
}
