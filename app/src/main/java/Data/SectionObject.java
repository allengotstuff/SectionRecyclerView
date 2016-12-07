package Data;

import java.util.ArrayList;
import java.util.List;

/**
 * *************************************************************************
 *
 * @版权所有: 北京云图微动科技有限公司 (C) 2016
 * @创建人: 孙旭光
 * @创建时间: xxx(2016-12-07 15:34)
 * @Email: 410073261@qq.com
 * <p>
 * 描述:Data-SectionObject
 * <p>
 * <p>
 * *************************************************************************
 */

public class SectionObject {

    public List<ItemObject> listOfObject;

    public SectionObject(){
        listOfObject = new ArrayList<>();
    }

    public void addItem(ItemObject object){
        listOfObject.add(object);
    }
}
