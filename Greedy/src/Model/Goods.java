package Model;

import java.util.*;

public class Goods implements Comparable<Goods> {

    public Goods() {
    }

    public Goods(double size, double value) {
        this.Id = java.util.UUID.randomUUID().toString();
        this.Name = "都行";
        this.Size = size;
        this.Value = value;
        this.PerValue = value / size;
    }

    private String Id;//唯一标识
    private String Name;//没有实际意义
    private double Size;//体积
    private double Value;//价值
    private double PerValue;//平均价值

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double size) {
        Size = size;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public double getPerValue() {
        return PerValue;
    }

    public void setPerValue(double perValue) {
        PerValue = perValue;
    }

    @Override
    public int compareTo(Goods g) {
        //按size排序
//        if (g.Size >= this.Size) return -1;
//        else return 1;

        //按平均价值排序
        if (g.PerValue >= this.PerValue) return 1;
        else return -1;
    }
}
