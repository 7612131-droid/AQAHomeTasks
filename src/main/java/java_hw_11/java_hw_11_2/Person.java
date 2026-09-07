package java_hw_11.java_hw_11_2;

public class Person {
    String name;
    String surename;
    Integer age;
    Integer salary;

    public Person(String name,String surename,Integer age, Integer salary) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
