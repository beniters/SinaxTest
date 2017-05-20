import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		int[] a[] = {{1,2}, {2}};
		System.out.println(Arrays.asList(a).toString());
		
		Set b = new HashSet();
		b.add("1");
		b.add(2);
		b.add("3");
		
		System.out.println(b);
		
		Integer.parseInt("two");
		
		int x = 0;
		System.out.println(x + " " + ++x);
		
	}

}
