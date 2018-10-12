
import java.util.Scanner;
 //Sammy Student, Programmer
 public class Maze 
 {
  static Scanner sc = new Scanner(System.in);
  // maze movements
  static char myMove = '\0';
  // cell position
  static int currentCell = 0;
  static int score = 0;
  static boolean advance = true;
  static boolean checkThis = false;
  public static void main(String args[])
  {
   // the local variables declared and initialized
   char answer = 'Y';
  
   displayMenu();  
      
   while(answer == 'Y' || answer == 'y') 
   {
	displayMovement();
	makeYourMove();
	checkThis = checkYourMove();
	mazeStatus();
      
	System.out.println("move again(Y or N)?");
      answer = sc.next().charAt(0);
      
  }
   System.out.println("***************************");
}// end main() method

static void displayMenu()
{
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----The Maze Strategy---");
   System.out.println("");
}// end method

static void displayMovement()
{
	if(currentCell == 0)
	{
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		currentCell = 1;
		mazeStatus();
		advance = true;
	}
      System.out.println("make your move (W, A, S, D)");
      System.out.println("W = up, A = left, S = down, D = right)");
}// end method

static void makeYourMove()
{
	myMove = sc.next().charAt(0);
	
	switch(myMove)
	{
	  case 'W': case 'w': { MoveUp(); break; }
	  case 'A': case 'a':{ MoveLeft(); break; }
	  case 'S': case 's':{ MoveDown(); break; }
	  case 'D': case 'd':{ MoveRight(); break; }
	}
   // end program menu
 }// end method
static boolean checkYourMove()
{
	if(currentCell == 1 && advance == true)
	{
		if (myMove == 'W' || myMove == 'w')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			currentCell = 2;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 2 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D'|| myMove == 'd')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			currentCell = 5;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 3 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			currentCell = 6;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 4 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			currentCell = 7;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 5 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			currentCell = 2;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			currentCell = 6;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
	}
	if(currentCell == 6 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			currentCell = 3;
			advance = true;
			System.out.println("contiune through the maze");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			currentCell = 5;
			advance = true;
			System.out.println("contiune through the maze");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			advance = false;
			System.out.println("You hit a wall try again.");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			currentCell = 9;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 7 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			currentCell = 4;
			advance = true;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
	}
	if(currentCell == 8 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			currentCell = 7;
			advance = true;
			System.out.println("contiune though the maze");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			currentCell = 9;
			advance = true;
			System.out.println("contiune through the maze");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
	}
	if(currentCell == 9 && advance == true)
	{
		if (myMove == 'W'|| myMove == 'w')
		{
			currentCell = 6;
			advance = true;
			System.out.println("contiune through the maze");
			return advance;
		}
		if (myMove == 'A'|| myMove == 'a')
		{
			currentCell = 8;
			advance = true;
			System.out.println("contiune through the maze");
			return advance;
		}

		if (myMove == 'D'|| myMove == 'd')
		{
			advance = false;
			System.out.println("you hit a wall, try again");
			return advance;
		}
		if (myMove == 'S'|| myMove == 's')
		{
			currentCell = 10;
			advance = true;
			System.out.println("Congraduation you finished the maze");
			return advance;
		}
	}
	return advance;
	// end program menu
 }// end method

static void MoveLeft()
{
   System.out.println("you moved to the left");
   
}//end method
static void MoveRight()
{
	 System.out.println("you moved to the right");
	
}//end method
static void MoveUp()
{
	System.out.println("you moved up (forward)");
	
}//end method
static void MoveDown()
{
	System.out.println("you moved down (downward)");
	
}//end method
static void mazeStatus()
{
	System.out.println("current position: cell " + currentCell);
}//end method
}// end class


