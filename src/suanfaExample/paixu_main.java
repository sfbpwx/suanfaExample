package suanfaExample;

public class paixu_main {
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a){
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]: "+a[i]);
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] a){
		for(int i=1;i<a.length;i++){
			if(less(a[i],a[i-1]))return false;
		}
		return true;
	}
	public static void main(String[] args){
		String input = "SORTEXAMPLE";
		String[] a = input.split("");
		paixu01_xuanze.sort(a);
//		paixu02_charu.sort(a);
		assert isSorted(a);
		show(a);
	}
	
	
	//�����㷨��ʱ
}
