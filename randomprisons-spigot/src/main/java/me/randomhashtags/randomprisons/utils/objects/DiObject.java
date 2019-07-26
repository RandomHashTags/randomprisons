package me.randomhashtags.randomprisons.utils.objects;

public class DiObject {
    private Object one, two;
    public DiObject(Object one, Object two) {
        this.one = one;
        this.two = two;
    }
    public Object getFirst() { return one; }
    public Object getSecond() { return two; }
}
