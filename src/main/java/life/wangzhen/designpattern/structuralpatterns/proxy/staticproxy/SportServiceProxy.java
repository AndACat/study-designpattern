package life.wangzhen.designpattern.structuralpatterns.proxy.staticproxy;

public class SportServiceProxy implements ISportService{
    private ISportService sportService = new SportServiceImpl();

    @Override
    public void swimming() {
        this.before();
        sportService.swimming();
        this.after();
    }

    @Override
    public void run() {
        this.before();
        sportService.run();
        this.after();
    }

    @Override
    public void playBasketball() {
        this.before();
        sportService.playBasketball();
        this.after();
    }
    private void before(){
        System.out.println("before: 拉伸一下身体，防止意外伤害~~~~");
    }
    private void after() {
        System.out.println("after: 运动后洗个澡~~~~~");
    }
}
