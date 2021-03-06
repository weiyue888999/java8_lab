package com.github.java8lab;

public class UserDO {

    private Long id;
    private String name;

    public UserDO() {
        System.out.println("UserDO new");
    }

    public UserDO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
