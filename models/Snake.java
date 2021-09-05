package models;

public class Snake{
    private int start;
    private int end;
    //Default Constructor
    public Snake(){
    }
    //Parameterized Constructor
    public Snake(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
    //Getter Function
    public int getStart()
    {
        return start;
    }
    public int getEnd()
    {
        return end;
    }
}