package life.wangzhen.designpattern.creationalpatterns.prototype;

import lombok.Data;

@Data
public class Person{
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = new Person();
        person.setName(this.name);
        person.setAge(this.age);
        return person;
    }
}
