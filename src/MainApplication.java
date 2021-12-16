
public class MainApplication {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {
		int cheese_counter = 0;
		int apple_counter = 0;
		int coffee_counter = 0;
		Food[] breakfast = new Food[20];

		int itemsSoFar = 0;
		for (String arg : args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese();
			} else if (parts[0].equals("Apple")) {
				breakfast[itemsSoFar] = new Apple(parts[1]);
			} else if (parts[0].equals("Coffee")) {
				breakfast[itemsSoFar] = new Coffee(parts[1]);
			}
			itemsSoFar++;
		}
		for (Food item : breakfast)
			if (item != null)
				item.consume();
			else
				break;
		for (int i = 0; i < breakfast.length; i++) {
			if (breakfast[i] == null)
				break;
			if ((breakfast[i].equals(new Apple("�����"))) || breakfast[i].equals(new Apple("�������"))) {
				apple_counter++;
			} else if ((breakfast[i].equals(new Coffee("����������"))) || breakfast[i].equals(new Apple("�������"))) {
				coffee_counter++;
			} else if (breakfast[i].equals(new Cheese()) && (breakfast[i] != null)) {
				cheese_counter++;
			}
		}
		System.out.println("C�� - " + cheese_counter);
		System.out.println("������ - " + apple_counter);
		System.out.println("���� - " + coffee_counter);
		System.out.println("����� ��������!");
	}
}
