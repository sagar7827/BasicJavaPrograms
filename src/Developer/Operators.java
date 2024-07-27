package Developer;

public class Operators {

	public static void main(String[] args) {

	// 1) Arithmetic operators + - * / %
		
		int a=20,b=10;
		
		System.out.println("Sum is :"+(a+b));
		System.out.println("Diff is :"+(a-b));
		System.out.println("Multiplication is :"+(a*b));
		System.out.println("Division is :"+(a/b));
		System.out.println("Mod is :"+(a%b));
		
		
		// 2) Relational/comparison operators > >= < <= != ==
		// returns boolean value - true/false
		
		System.out.println(a>b);  // true
		System.out.println(a<b);  // false
		System.out.println(a>=b);  // true
		System.out.println(a<=b);  // false
		System.out.println(a!=b);  // true
		System.out.println(a==b);  // false
		
		
		// 3) Logical Operators && || !
		// returns boolean value - true/false
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x);  // false
		System.out.println(!y);  // true
		
		
		// 4) increment/decrement operators ++ --
		
		// case 1 ++ operator
		
		int i=10;
		System.out.println(i);
		i++;
		System.out.println(i); //11
		
		// case 2 post increment
		
		i=20;
		int res=i++;
		System.out.println(res); //20
		System.out.println(i); //21
		
		// case3 pre increment
		
		i=15;
		res = ++i;
		System.out.println(res); //16
		
		// case1 -- decrement
		
		int j=10;
		System.out.println(j);
		j--;
		System.out.println(j);  //9
		
		// case2 post decrement
		
		j=20;
		int result =j--;
		System.out.println(result); //20
		System.out.println(j);  //19
		
		// case3 pre decrement
		
		j = 15;
		result = --j;
		System.out.println(result); // 14
		
		
		
		// 5) Assignment Operators = += -= *= /= %=
		
		int m=10,n=20,p=30,q=40,r=50;
		 
		m+=5; // m = m+5
		n-=5; // n = n-5
		p*=5;  // p = p*5
		q/=5; // q = q/5
		r%=5; // r = r%5
		
		System.out.println(m);  // 15
		System.out.println(n); // 15
		System.out.println(p);  // 150
		System.out.println(q);  // 8
		System.out.println(r);  // 0
		
		
		// 6) Ternary Operator ?
		
		// var= exp ? result1 : result2 ;
		
		int c = 200, d = 100;
		
		int z = (c>d) ? c : d;
		System.out.println(z);
		
		z = (c<d) ? c : d;
		System.out.println(z);
		
	}

}
