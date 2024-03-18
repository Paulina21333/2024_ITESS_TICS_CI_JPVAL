/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;


public class cordinate {
    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax; 
    private double width;
    private double higth;        

    public cordinate(double xmin, double xmax, double ymin, double ymax, double width, double higth) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
        this.width = width;
        this.higth = higth;
    }

    public double getXmin() {
        return xmin;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public double getXmax() {
        return xmax;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public double getYmin() {
        return ymin;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }

    public double getYmax() {
        return ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigth() {
        return higth;
    }

    public void setHigth(double higth) {
        this.higth = higth;
    }
public double toScreenx(double xr) {
    return (xr - xmin)*width/(xmax-xmin);
}
public double toScreeny (double yr){
    return (yr - ymin)*higth/(ymax - ymin);
}
}
