package br.com.welio.demo_springboot;

import jakarta.persistence.Entity;

@Entity
public class Card {
    double food;
    double meal;
    double cash;
    public double getFood() {
        return food;
    }
    public void setFood(double food) {
        this.food = food;
    }
    public double getMeal() {
        return meal;
    }
    public void setMeal(double meal) {
        this.meal = meal;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
}
