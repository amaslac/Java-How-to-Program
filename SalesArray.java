/*(Sales Commissions) Use a one-dimensional array to solve the following problem: A company
pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5000 in sales in a week 
receives $200 plus 9% of $5000, or a total of $650. Write an application (using an array of 
counters) that determines how many of the salespeople earned salaries in each of the following 
ranges (assume that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1000 and over
Summarize the results in tabular format.*/

package Examples;

public class SalesArray {

	public static void main(String[] args) {
		
		int[] sales = {7523, 6000, 2007, 802, 0, 5000, 325, 9820, 8050, 10270};
		int[] salary = new int[10];
		int[] getSalespeople = new int[9];
		int[] range1 = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
		String[] range2 = {"299", "399", "499", "599", "699", "799",  "899", "999", "and over" };
		

		System.out.printf("   %s %13s %16s", "Salesperson", "Gross sales", "Week salary\n\n");
		
		for (int i = 0; i < sales.length; i++) {
			
			double commission = 0.09 * sales[i];
			salary[i] = 200 + (int) commission;
			
			System.out.printf("Salesperson %2d %12d$ %13d$\n", 
					i + 1, sales[i], salary[i]);
		}
		
		for (int i = 0; i < salary.length; i++)
			getSalespeople[getRanges(salary[i])]++;
		
		System.out.println("\nSalary statistics:"
				+ "\n(Number of salespeople that earned salaries in each of the following ranges)\n");
		
		for (int i = 0; i < range1.length; i++) 
			System.out.printf("$%d - %s:  %d \n", range1[i], range2[i], getSalespeople[i]);
	}	
		
	private static int getRanges(int earned) {
		
		if (earned <= 299)
			return 0;
		else if (earned <= 399)
			return 1;
		else if (earned <= 499)
			return 2;
		else if (earned <= 599)
			return 3;
		else if (earned <= 699)
			return 4;
		else if (earned <= 799)
			return 5;
		else if (earned <= 899)
			return 6;
		else if (earned <= 999)
			return 7;
		else
			return 8;
			
	}
	
}

/*
   Salesperson   Gross sales    Week salary

Salesperson  1         7523$           877$
Salesperson  2         6000$           740$
Salesperson  3         2007$           380$
Salesperson  4          802$           272$
Salesperson  5            0$           200$
Salesperson  6         5000$           650$
Salesperson  7          325$           229$
Salesperson  8         9820$          1083$
Salesperson  9         8050$           924$
Salesperson 10        10270$          1124$

Salary statistics:
(Number of salespeople that earned salaries in each of the following ranges)

$200 - 299:  3 
$300 - 399:  1 
$400 - 499:  0 
$500 - 599:  0 
$600 - 699:  1 
$700 - 799:  1 
$800 - 899:  1 
$900 - 999:  1 
$1000 - and over:  2 
*/
