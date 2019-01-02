package Model;

import java.util.*;

public class Goods implements Comparable<Goods> {

    public Goods() {
    }

    public Goods(double size, double value) {
        this.Id = java.util.UUID.randomUUID().toString();
        this.Name = "����";
        this.Size = size;
        this.Value = value;
        this.PerValue = value / size;
    }

    private String Id;//Ψһ��ʶ
    private String Name;//û��ʵ������
    private double Size;//���
    private double Value;//��ֵ
    private double PerValue;//ƽ����ֵ

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
        //��size����
//        if (g.Size >= this.Size) return -1;
//        else return 1;

        //��ƽ����ֵ����
        if (g.PerValue >= this.PerValue) return 1;
        else return -1;
    }
}
