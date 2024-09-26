package life.wangzhen.designpattern.creationalpatterns.simplefactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpleFactoryV2 {
    private final static List<Food> foodList = new ArrayList<>();
    static {
        // 采用预热/预加载的方式获得所有的foodList
        foodList.add(new TomatoFood());
        foodList.add(new EggFood());
    }
    public static Food getFoodByName(String foodName){
        for (Food food : foodList) {
            if(Objects.equals(food.getName(), foodName)){
                return food;
            }
        }
        throw new RuntimeException("没有这样的食物：" + foodName);
    }
}