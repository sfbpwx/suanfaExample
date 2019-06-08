package suanfaExample;

import java.util.Arrays;

public class paixu02_charu {
	public static void sort(Comparable[] a){
		//将a[]按照升序排列
		int N = a.length;
		for(int i=0;i<N;i++){//将a[i]插入到a[i-1]、a[i-2]、a[i-s]。。。。。之中
			System.out.println("第"+i+"遍     "+Arrays.toString(a));
			for(int j=i;j>0&&less(a[j],a[j-1]);j--){
				System.out.println("before  a["+i+"]:"+a[i]+"   a["+j+"]:"+a[j]+"   a["+(j-1)+"]:"+a[j-1]);
				System.out.println(Arrays.toString(a));
				exch(a,j,j-1);
				System.out.println("after   a["+i+"]:"+a[i]+"   a["+j+"]:"+a[j]+"   a["+(j-1)+"]:"+a[j-1]);
				System.out.println(Arrays.toString(a));
			}
		}
	}
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
