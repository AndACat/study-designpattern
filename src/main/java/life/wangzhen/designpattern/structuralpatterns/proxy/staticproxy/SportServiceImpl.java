package life.wangzhen.designpattern.structuralpatterns.proxy.staticproxy;

public class SportServiceImpl implements ISportService{
    @Override
    public void swimming() {
        System.out.println("游泳。。。。。。。。。。。。。");
    }

    @Override
    public void run() {
        System.out.println("跑步。。。。。。。。。。。。。");
    }

    @Override
    public void playBasketball() {
        System.out.println("玩篮球。。。。。。。。。。。");
    }
}
