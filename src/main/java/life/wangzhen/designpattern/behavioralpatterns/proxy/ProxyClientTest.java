package life.wangzhen.designpattern.behavioralpatterns.proxy;

import life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl.MakeNoodlesStrategy_1;
import life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl.MakeNoodlesStrategy_2;
import life.wangzhen.designpattern.behavioralpatterns.proxy.proxyimpl.MakeNoodlesStrategy_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProxyClientTest {
    public static void main(String[] args) {
        // 我有三种怎么做泡面的做法
        List<IMakeNoodlesStrategy> iMakeNoodlesStrategyList = new ArrayList<>();
        iMakeNoodlesStrategyList.add(new MakeNoodlesStrategy_1());
        iMakeNoodlesStrategyList.add(new MakeNoodlesStrategy_2());
        iMakeNoodlesStrategyList.add(new MakeNoodlesStrategy_3());

        // 随机挑选一个做泡面的策略
        int index = new Random().nextInt(3);
        IMakeNoodlesStrategy makeNoodlesStrategy = iMakeNoodlesStrategyList.get(index);

        // 创建一个人
        Person person = new Person(makeNoodlesStrategy);
        // 吃泡面
        person.eat();
    }
}
