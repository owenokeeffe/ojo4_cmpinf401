
public class FileIoTest {

	public static void main(String[] args) {

		String s = "a, b, c, d, e, f, g";
		String[] a = s.split(",");
		System.out.println(a.length);
		for(String temp : a) {
			System.out.println(temp);
		}

		
	}

}
