package ru.synergy.customgenerictypes;

public interface Accountable <T>{
    T getid();
    void setid(T id);
    void  setSum(int sum);
    int getSum();



}
