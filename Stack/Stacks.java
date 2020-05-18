
class CQStack
{
  int maxSize; // size of stack array
  int[] stackArray;
  int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
      System.out.print("OVERFLOW");
    }
    else
    {
      System.out.println(j + " pushed to stack");
      stackArray[++top] = j; // increment top, insert item
      System.out.println("Top is now at " + top);
    }
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      System.out.println("UNDERFLOW");
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      System.out.println(temp + " popped from stack");
      System.out.println("Top is now at " + top);
      return temp; // access item, decrement top
    }
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }
}

public class Stacks
{
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(10); // make new stack
    int temp;
    theStack.push(12);
    theStack.push(23);
    temp = theStack.pop();
    theStack.push(54);
    temp=theStack.pop();
    temp=theStack.pop();
    temp=theStack.pop();
  }
}