import java.util.*;
import java.io.*;
import java.math.*;

public class RWalk {

	public static void main(String[] args)throws IOException{ 
		RWalker it = new RWalker();
		
		PrintWriter p = new PrintWriter("output1.txt");
		
		System.out.println();
		
		int nsys = 25;
		int npasses = 2000;
		int [] ary1 = new int[npasses];
		
		for(int i=0;i<nsys;i++){
			it = new RWalker();
			for(int j=0;j<npasses;j++){
				ary1[j]+=it.getEntropy();
				it.step();
			}
		}
		
		for(int i=0;i<npasses;i++){
			p.print(i);
			p.print("\t");
			p.println(ary1[i]/nsys);
		}
		
		p.close();
		
		p = new PrintWriter("output2.txt");
		
		ary1 = new int[npasses];
		
		
		for(int i=0;i<nsys;i++){
			it = new RWalker(15,15,0);
			for(int j=0;j<npasses;j++){
				ary1[j]+=it.getEntropy();
				it.step();
			}
		}
		
		for(int i=0;i<npasses;i++){
			p.print(i);
			p.print("\t");
			p.println(ary1[i]/nsys);
		}
		
		p.close();
		
		p = new PrintWriter("output3.txt");
		
		ary1 = new int[npasses];
		
		
		for(int i=0;i<nsys;i++){
			it = new RWalker(5,5,0);
			for(int j=0;j<npasses;j++){
				ary1[j]+=it.getEntropy();
				it.step();
			}
		}
		
		for(int i=0;i<npasses;i++){
			p.print(i);
			p.print("\t");
			p.println(ary1[i]/nsys);
		}
		
		p.close();
		
		p = new PrintWriter("output4.txt");
		
		ary1 = new int[npasses];
		
		
		for(int i=0;i<nsys;i++){
			it = new RWalker(5,5,0);
			for(int j=0;j<npasses;j++){
				ary1[j]+=it.getEntropy();
				it.step();
			}
		}
		
		for(int i=0;i<npasses;i++){
			p.print(i);
			p.print("\t");
			p.println(ary1[i]/nsys);
		}
		
		p.close();
		
		p = new PrintWriter("output5.txt");
		
		ary1 = new int[npasses];
		
		
		for(int i=0;i<nsys;i++){
			it = new RWalker(0,0);
			for(int j=0;j<npasses;j++){
				ary1[j]+=it.getEntropy();
				it.step();
			}
		}
		
		for(int i=0;i<npasses;i++){
			p.print(i);
			p.print("\t");
			p.println(ary1[i]/nsys);
		}
		
		p.close();
		
	}

}