package models;

public class Ladder{
    private int start;
    private int end;
    //Default Constructor.
    public Ladder(){
    }
    //Parameterized Constructor.
    public Ladder(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
    //Getter Functions.
    public int getStart()
    {
        return start;
    }
    public int getEnd()
    {
        return end;
    }
}
