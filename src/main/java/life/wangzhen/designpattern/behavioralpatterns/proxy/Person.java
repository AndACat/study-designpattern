package life.wangzhen.designpattern.behavioralpatterns.proxy;

public class Person {
    private IMakeNoodlesStrategy iMakeNoodlesStrategy;
    public Person(IMakeNoodlesStrategy iMakeNoodlesStrategy) {
        this.iMakeNoodlesStrategy = iMakeNoodlesStrategy;
    }

    public void eat(){
        this.iMakeNoodlesStrategy.makeNoodles();
        System.out.println("面做好了，我要开吃了 (#^.^#)");
    }
}
