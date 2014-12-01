package net.hb.model;

public class Gugudan {
	int dan = 0;
	int su = 0;
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public void getGugudan(int dan){
		if(dan>=2&&dan<=9){
			for (int a = 0; a < 10; a++) {
				//System.out.println(dan+"*"+a+"="+(dan*a));
				System.out.printf("%d * %d = %d\t",dan,a,dan*a);
				System.out.println();
			}
		}else{
			System.out.println("2부터 9까지 정수만 입력 !!");
		}
	}
}
