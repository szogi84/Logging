package com.employees;

/**
 * Created by Szogi on 13/04/2015.
 */
public class Jenny implements Employee {
    double salary;
    @Override
    public void setSalary(double salary) {
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void giveRaise(double raise) {
        this.salary+=raise;
    }
    public void removeSalary(){
        this.salary=0.0;
    }
}
