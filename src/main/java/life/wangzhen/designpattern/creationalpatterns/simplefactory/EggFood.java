package life.wangzhen.designpattern.creationalpatterns.simplefactory;

public class EggFood implements Food{
    @Override
    public String getName() {
        return "鸡蛋";
    }

    @Override
    public Long getWeight() {
        return 50L;
    }
}
