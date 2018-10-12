class TwoDShape {

	//class TwoDShape is the "superclass"
	
			double width;
			double height;
			void showDim(){
			  System.out.println("Width and height are " + width + " and " + height);
			}
}
			//Class Triangle is the subclass of TwoDShape 
			class Triangle extends TwoDShape {
				String style;
								
			double area() {return width*height/2;
				}
				void showStyle(){
					System.out.println("Triangle is " + style);
				}
			}
			//class Rectangle is a subclass of the superclass TwoDShape
			class Rectangle extends TwoDShape 
			{
				String style;
				boolean isSquare(){
				if(width==height) return true;
				return false;}
				
				double area() 
				{
					return width*height;
					}
		
				void showStyle(){
					System.out.println("Rectangle is " + style);
			}
			}
			//

			class Shape {
			//public static void main(String args[]){
					public static void main(String args[]){
					//defining objects triangle and rectangle
					Triangle t1 = new Triangle();
					Triangle t2 = new Triangle();
					
					Rectangle r1 = new Rectangle();
					Rectangle r2 = new Rectangle();

					//define variables for objects
					//triangle
					t1.width = 4.0;
					t1.height = 4.0;
					t1.style = "isosceles";
							
					t2.width = 8.0;
					t2.height = 12.0;
					t2.style = "right";
					
					//rectangle
					r1.width=8.0;
					r1.height=8.0;
					r1.style="square";
					
					r2.width=6.0;
					r2.height=10.0;
					r2.style="rectangle";

					//display for triangle
					System.out.println("Info for t1: ");
					t1.showStyle();
					t1.showDim();
					System.out.println("Area is " + t1.area());
					
					System.out.println();
					
					System.out.println("Info for t2: ");
					t2.showStyle();
					t2.showDim();
					System.out.println("Area is " + t2.area());
					
					System.out.println();
					
					//display for rectangle
					System.out.println("Info for r1: ");
					r1.showStyle();
					r1.showDim();

					System.out.println("Area is " + r1.area());
					
					System.out.println();
					
					System.out.println("Info for r2: ");
					r2.showStyle();
					r2.showDim();
					System.out.println("Area is " + r2.area());

					
					}
			}
