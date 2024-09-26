package life.wangzhen.designpattern.creationalpatterns.simplefactory;

public class ClientTest {
    // 模拟客户端调用
    public static void main(String[] args) {
        // 我想吃东西了，通过简单工厂方法，获得食物
        String foodName = "西红柿";
        Food food = SimpleFactory.getFoodByName(foodName);
        System.out.println("食物名：" + food.getName() + "，重量：" + food.getWeight() + "克");
    }
}

