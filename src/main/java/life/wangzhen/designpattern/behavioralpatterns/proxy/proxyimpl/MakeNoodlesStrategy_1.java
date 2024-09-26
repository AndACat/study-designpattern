package life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl;

import life.wangzhen.designpattern.behavioralpatterns.proxy.IMakeNoodlesStrategy;

public class MakeNoodlesStrategy_1 implements IMakeNoodlesStrategy {
    @Override
    public void makeNoodles() {
        System.out.println("还是干吃吧，不做了。。。。");
    }
}
