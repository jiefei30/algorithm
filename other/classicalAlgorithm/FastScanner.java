package other.classicalAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class FastScanner {
	public static void main(String[] args) {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		try {
			st.nextToken();
			int n = (int) st.nval;
			System.out.println(n);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
