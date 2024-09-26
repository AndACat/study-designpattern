package life.wangzhen.designpattern.creationalpatterns.builder;

public class PersonV2 {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public PersonV2 setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public PersonV2 setAge(Integer age) {
        this.age = age;
        return this;
    }
}

