package com.theironyard.charlotte.candyjar.models;


import javax.persistence.*;

@Entity
@Table(name = "candies")
public class Candy {
    @Id // this is a primary key column
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // the value of "id" will be automatically generated
    private Integer id;

    @Column
    private int diameter;

    @Column
    private boolean containsNuts;

    @Column
    private boolean isChocolate;

    @Column
    private boolean isSour;


    public Candy() {
    }

    public Candy(int diameter, boolean containsNuts, boolean isChocolate, boolean isSour) {
        this.diameter = diameter;
        this.containsNuts = containsNuts;
        this.isChocolate = isChocolate;
        this.isSour = isSour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    public boolean isSour() {
        return isSour;
    }

    public void setisSour(boolean isSour) {
        this.isSour = isSour;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "diameter=" + diameter +
                ", containsNuts=" + containsNuts +
                ", isChocolate=" + isChocolate +
                ", isSour=" + isSour +
                ", id=" + id +
                '}';
    }
}
