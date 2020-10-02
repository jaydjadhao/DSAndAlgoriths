package com.deepdive.section7.hashtables.vo;

public class StoredEmployee {
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee){
        this.key = key;
        this.employee = employee;
    }

    public String toString(){
        return this.key + " = " + this.employee;
    }
}
