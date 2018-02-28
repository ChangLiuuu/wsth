import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Fileio {
	public static void main(String args[]) {
		try {

			String pathname = "src/test5.txt";
			File filename = new File(pathname);
			InputStreamReader reader = new InputStreamReader(
					new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			String line = "";

			while (line != null) {
				line = br.readLine();
				if (line != null) {
					System.out.println(line);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}