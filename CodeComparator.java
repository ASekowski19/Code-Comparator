package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CodeComparator implements Comparator<Product> {
//	public int compare(Product o1, Product o2) {
	
//		int diff = o1.getCode().compareTo(o2.getCode());
//		if (diff != 0) {
//			return diff;
//		}
//		else {
//			return o1.getCode().compareTo(o2.getCode());
//		}
//		CodeComparator codeComparator = new CodeComparator();
//		Collections.sort(prodsSorted, codeComparator);
//	}		
//}
public int compare(Product o1, Product o2) {
		String o1Code = o1.getCode().substring(0, 2);
		String o2Code = o2.getCode().substring(0, 2);
		if(o2Code.equals(o1Code)) {
			return o1.getCode().substring(3).compareTo(o2.getCode().substring(3));
		}
		else if(o1Code.equals("QC") && !(o2Code.equals("QC"))) {
			return -1;
		}
		else if(o2Code.equals("QC") && !(o1Code.equals("QC"))) {
			return 1;
		}
		else if(o1Code.equals("DA") && !(o2Code.equals("DA"))) {
			return -1;
		}
		else if(o2Code.equals("DA") && !(o1Code.equals("DA"))) {
			return 1;
		}
		else {
			return 1;
		}
		
	}
}