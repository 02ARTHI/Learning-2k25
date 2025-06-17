package Arrays.Stream.example;

import java.util.List;
import java.util.stream.Stream;

public class FibbonocciSeries {

	public static void main(String[] args) {
		List<Integer> n=Stream.iterate(new int[] {0,1}, f-> new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).toList();
	   System.out.println(n);
	}

}
