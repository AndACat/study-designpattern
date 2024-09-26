package life.wangzhen.designpattern.creationalpatterns.simplefactory;

import java.util.Objects;

public class SimpleFactory {
    public static Food getFoodByName(String foodName){
        if(Objects.equals("西红柿", foodName)){
            return new TomatoFood();
        }
        if(Objects.equals("鸡蛋", foodName)){
            return new EggFood();
        }
        throw new RuntimeException("没有这样的食物：" + foodName);
    }
}

