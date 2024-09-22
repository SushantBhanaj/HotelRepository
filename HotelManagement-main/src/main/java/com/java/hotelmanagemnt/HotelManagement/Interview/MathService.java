package com.java.hotelmanagemnt.HotelManagement.Interview;

import org.springframework.stereotype.Service;

import java.util.Objects;


public class MathService {
String name;
int id;
int dept;
double sal;
    MathService(String name, int id, int dept, double sal) {
        this.name = name;
        this.id = id;
        this.dept=dept;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathService that = (MathService) o;
        return id == that.id && dept == that.dept && Double.compare(sal, that.sal) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dept, sal);
    }

    @Override
    public String toString() {
        return "MathService{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept=" + dept +
                ", sal=" + sal +
                '}';
    }
}

