package PracticalLabTest;

public class Area implements Shape{

    double Area=0;                                             //taking area as 0

	void RectangleArea(double length ,double breadth){

	 Area = length * breadth;
	    System.out.println("Area of rectangle is: "+Area);     // finding the rectangle area

	    }


	    void SquareArea(double Side){

	    Area= Side * Side;                                       //finding the square area

	        System.out.println("Area of Square is: "+Area);

	    }

	    
	    void CircleArea(double radius){

	    Area= (radius * radius)*3.14;                           //finding  the circle area
	        System.out.println("Area of Circle is: "+Area);
	}


	
}


