package net.hb.controller;

public class Main1204 {
	public static void main(String[] args) {
		Main1204 m = new Main1204();
		
		int a=90, b=80, c=70;
		m.sum(a,b,c);
		
		int[] arr = new int[3];
		arr[0]=90; arr[1]=80; arr[2]=70;
		m.sum(arr);
		
	}
	public void sum(int a, int b, int c){
		int sum=0;
		sum = a + b + c;
		System.out.println("매개변수 3개의 합계 : "+sum);
	}
	public void sum(int arr[]){
		int sum=0;
		//sum = arr[0] + arr[1] + arr[2]; 
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		System.out.println("매개변수 1개의 합계 : "+sum);
	}
}
