package codinginterview.stackandqueues;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Tower towers[] = new Tower[3];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n-1; i >=0; i--) {
			towers[0].add(i);
		}
		towers[0].moveToDestination(n, towers[2], towers[1]);
		scanner.close();
	}
}

class Tower{
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		disks = new Stack<>();
		index = i;
	}
	public int index(){
		return index;
	}
	public void add(int top){
		if(!disks.isEmpty()&&disks.peek()<=top){
			
		}else{
			disks.push(top);
		}
	}
	public void moveTopTo(Tower destination){
		int top = disks.pop();
		destination.add(top);
		
	}
	public void moveToDestination(int n, Tower destination, Tower buffer	){
		if(n>0){
			moveToDestination(n-1, destination, buffer);
			moveTopTo(destination);
			moveToDestination(n-1, destination, this);
		}
		
	}
}