package careercup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeList {
	/*
	 * 3 sorted list
	 * Remove words which are repeated across list and not in same list
	 * Merge and print the final list
	 */
	public static void main(String[] args) {
		mergeLists(Arrays.asList("aaa", "bbb", "ddd", "xyxz"),
                Arrays.asList("bbb", "ccc", "ccc", "hkp"),
                Arrays.asList("ddd", "eee", "ffff", "lmn"));
	}
	public static void mergeLists(List<String> l1, List<String> l2, List<String> l3){

		List<String> mergedList = new ArrayList<>(l1.size()+l2.size()+l3.size());

		Iterator<String> itr1 = l1.iterator();
		Iterator<String> itr2 = l2.iterator();
		Iterator<String> itr3 = l3.iterator();


		if(itr1.hasNext() && itr2.hasNext() && itr3.hasNext()){
			String str1 = itr1.next();
			String str2 = itr2.next();
			String str3 = itr3.next();
			while(!(str1.equals(str2) && str2.equals(str3))){
				if(str1.compareTo( str2) < 0){
					if(str1.compareTo(str3) < 0){
						mergedList.add(str1);
						if(itr1.hasNext())
							str1 = itr1.next();
						else 
							str1 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}else if(str1.compareTo(str3)==0){
						if(itr1.hasNext())
							str1 = itr1.next();
						else
							str1 = "zzzzzzzzzzzzzzzzzzzzzzz";
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}else{
						mergedList.add(str3);
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}
				}else if(str1.compareTo( str2) ==  0){
					if(str1.compareTo(str3)==0){
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}else if(str1.compareTo(str3) > 0){
						mergedList.add(str3);
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}
					if(itr1.hasNext())
						str1 = itr1.next();
					else
						str1 = "zzzzzzzzzzzzzzzzzzzzzzz";
					if(itr2.hasNext())
						str2 = itr2.next();
					else
						str2 = "zzzzzzzzzzzzzzzzzzzzzzz";

				}else{
					if(str2.compareTo(str3) < 0){
						mergedList.add(str2);
						if(itr2.hasNext())
							str2 = itr2.next();
						else
							str2 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}else if(str2.compareTo(str3)==0){
						if(itr2.hasNext())
							str2 = itr2.next();
						else
							str2 = "zzzzzzzzzzzzzzzzzzzzzzz";
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}else{
						mergedList.add(str3);
						if(itr3.hasNext())
							str3 = itr3.next();
						else
							str3 = "zzzzzzzzzzzzzzzzzzzzzzz";
					}
				}
			}
		}
		System.out.println(mergedList.toString());
	}





}
