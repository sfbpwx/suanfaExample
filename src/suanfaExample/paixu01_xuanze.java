package suanfaExample;

import java.util.Arrays;

public class paixu01_xuanze {
	public static void sort(Comparable[] a){
		//将a[]按照升序排列
		int N = a.length;
		for(int i=0;i<N;i++){
			int min = i;
			System.out.println("第"+i+"遍  "+Arrays.toString(a));
			for(int j=i+1;j<N;j++){
				//将a[i]和a[i+1..N]中最小元素做交换
				System.out.println("show    i:"+i+"   j:"+j+"   min:"+min);
				if(less(a[j],a[min]))min=j;
				System.out.println("before  a["+i+"]:"+a[i]+"   a["+j+"]:"+a[j]+"   a["+min+"]:"+a[min]);
				System.out.println(Arrays.toString(a));
				exch(a,i,min);
				System.out.println("after   a["+i+"]:"+a[i]+"   a["+j+"]:"+a[j]+"   a["+min+"]:"+a[min]);
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
