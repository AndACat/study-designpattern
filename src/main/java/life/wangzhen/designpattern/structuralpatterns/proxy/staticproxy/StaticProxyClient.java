package life.wangzhen.designpattern.structuralpatterns.proxy.staticproxy;

public class StaticProxyClient {
    public static void main(String[] args) {
        // 使用未经代理的对象
        ISportService sportService = new SportServiceImpl();
        sportService.swimming();
        sportService.run();
        sportService.playBasketball();

        System.out.println("-----------------------------");

        // 使用代理对象
        ISportService sportServiceProxy = new SportServiceProxy();
        sportServiceProxy.swimming();
        sportServiceProxy.run();
        sportServiceProxy.playBasketball();
    }
}
