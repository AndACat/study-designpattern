package life.wangzhen.designpattern.creationalpatterns.builder;

public class PersonV1 {

    public PersonV1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonV1() {
    }
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;

        PersonBuilder() {
        }

        public PersonBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(final Integer age) {
            this.age = age;
            return this;
        }

        public PersonV1 build() {
            return new PersonV1(this.name, this.age);
        }

        public String toString() {
            return "Person.PersonBuilder(name=" + this.name + ", age=" + this.age + ")";
        }
    }
}