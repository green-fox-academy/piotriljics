package counter;

public class Counter {

    int fieldValue;

    public Counter(){
        fieldValue = 0;
    }

    public void setFieldValue(int number){
        fieldValue = number;
    }
    public void AddNumber(int number) {
        fieldValue = fieldValue + number;
    }
    public void Add() {
        fieldValue++;
    }
    public void Get() {
        System.out.println(fieldValue);
    }
    public void Reset() {
        fieldValue = 0;
    }
}
