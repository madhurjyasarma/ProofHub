public class MyClass {
	public static void main(String[] args) {
    	// We can take input for n by using Scanner class
    	// we can take Integer.MAX_VALUE (Wrapper class) for n

	int n = 100, firstTerm = 0, secondTerm = 1, i=1;
	System.out.println("Fibonacci Series till " + n + " terms:");
	System.out.println();

	while (i<=n) {
  	System.out.print(firstTerm + ", ");

  	int nextTerm = firstTerm + secondTerm;
  	firstTerm = secondTerm;
  	secondTerm = nextTerm;  
  	++i;
	}
  }
}
