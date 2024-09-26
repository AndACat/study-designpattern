package life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl;

import life.wangzhen.designpattern.behavioralpatterns.proxy.IMakeNoodlesStrategy;

public class MakeNoodlesStrategy_2 implements IMakeNoodlesStrategy {
    @Override
    public void makeNoodles() {
        System.out.println("开火，煮着吃，味道好。。。。");
    }
}
