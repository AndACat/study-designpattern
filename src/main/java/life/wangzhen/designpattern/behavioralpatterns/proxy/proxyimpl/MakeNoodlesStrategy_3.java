package life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl;

import life.wangzhen.designpattern.behavioralpatterns.proxy.IMakeNoodlesStrategy;

public class MakeNoodlesStrategy_3 implements IMakeNoodlesStrategy {
    @Override
    public void makeNoodles() {
        System.out.println("烧水，泡着吃，很方便。。。。");
    }
}
