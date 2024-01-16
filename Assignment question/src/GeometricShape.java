import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class GeometricShape{
    protected static String borderColor;
    protected static Boolean filled;
    
    GeometricShape(String c, boolean f){
        borderColor=c;
        filled=f;
    }
    public String getBorderColor(){
        return borderColor;
    }
    public Boolean getFilled(){
        return filled;
    }
}
class Rectangle extends GeometricShape{
    private int length;
    private int width;
    private int height;
    Rectangle(int length,int width,int height){
        super(borderColor, filled);
        this.height=length;
        this.width=width;
        this.height=height;
    }
   
    public String toString()
    {
    	return length+" "+width+" "+height;
    }
    
    }