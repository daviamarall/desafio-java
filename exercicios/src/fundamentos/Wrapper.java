package fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 1000000000000000l;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 123.0f;
		System.out.println(f);

		Double d = 12345678d;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		Character c = '#';
		System.out.println(c + "...");

		// entrada.close();

	}

}
