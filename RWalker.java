import java.util.*;
import java.io.*;
import java.math.*;

public class RWalker {
	
	int nparticels = 1000;
	
	private int[][] grid = new int [200][200];
	private int[][] particles = new int[nparticels][2];
	
	public RWalker(){
		for(int i=0;i<nparticels;i++){
			particles[i][0] = (int)(200*Math.random());
                        particles[i][1] = (int)(200*Math.random());
                        grid[particles[i][0]][particles[i][1]]++;
                }
	}

	public RWalker(int x, int y, int z){
		for(int i=0;i<nparticels;i++){
			particles[i][0] = (int)(x*Math.random());
                        particles[i][1] = (int)(y*Math.random());
                        grid[particles[i][0]][particles[i][1]]++;
                }
	}
	
	public RWalker(int x, int y){
		for(int i=0;i<nparticels;i++){
			particles[i][0] = x%200;
                        particles[i][1] = y%200;
                }
                grid[x%200][y%200] = nparticels;
	}

	
	public void step(){
		for(int i=0;i<nparticels;i++){
                        grid[particles[i][0]][particles[i][1]]--;
			particles[i][0] += (int)(3*Math.random())-1;
                        particles[i][1] += (int)(3*Math.random())-1;
                        particles[i][0] = particles[i][0]%200;
                        particles[i][1] = particles[i][1]%200;
                        if(particles[i][0] < 0) particles[i][0] += 200;
                        if(particles[i][1] < 0) particles[i][1] += 200;
                        grid[particles[i][0]][particles[i][1]]++;
                }
	}

	public void step(int x){
		for(int i=0;i<x;i++){
			step();
		}
	}
        
	public double logFactorial(int x){
		if(x<=1) return 0;
		return logFactorial(x-1)+Math.log(x);
	}

	public double getEntropy(){
		double x = 0;
		for(int i=0;i<200;i++){
			for(int j=0;j<200;j++){
				x = x+logFactorial(grid[i][j]);	
			}
		}
		double ret = logFactorial(nparticels)-x;
                return ret;
        }
	

}
