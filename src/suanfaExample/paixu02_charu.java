package suanfaExample;

import java.util.Arrays;

public class paixu02_charu {
	public static void sort(Comparable[] a){
		//��a[]������������
		int N = a.length;
		for(int i=0;i<N;i++){//��a[i]���뵽a[i-1]��a[i-2]��a[i-s]����������֮��
			System.out.println("��"+i+"��     "+Arrays.toString(a));
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
