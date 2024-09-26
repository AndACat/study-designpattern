package life.wangzhen.designpattern.creationalpatterns.simplefactory;

public class TomatoFood implements Food{
    @Override
    public String getName() {
        return "西红柿";
    }

    @Override
    public Long getWeight() {
        return 150L;
    }
}
