package Woche2;

public class Aufgabe3 {
    public static void main(String[] args){
calculatePerimeter(2);
calculatePerimeter(2,2);
    }


    public static void calculatePerimeter(double sideLength){
       double p;
       p=sideLength*4;
        System.out.println("der Umfang von einem Quadrat mit den Kantenlaungen a= " + sideLength+ " = " +p);


    }

    public static void calculatePerimeter(double a,double b){
        double p;
        p=2*(a+b);
        System.out.println("der Umfang von einem Rechteck mit den Kantenlaungen a= " +a+ ",b= " +b+ " = " +p );


    }
}
