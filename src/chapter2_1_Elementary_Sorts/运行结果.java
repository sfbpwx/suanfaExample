package chapter2_1_Elementary_Sorts;

import suanfaExample.paixu01_xuanze;

public class 运行结果 {
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
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
//		Selection.sort(a);//选择排序
		Insertion.sort(a);//插入排序
//		Shell.sort(a);//希尔排序
		assert isSorted(a);
		show(a);
	}
}
