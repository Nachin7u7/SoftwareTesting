import java.util.Stack;

public class DateUtils {

	public static String nextDate(int day, String month, int year) {
		Stack<String> months = new Stack<>();
		months.add("enero");
		months.add("febrero");
		months.add("marzo");
		months.add("abril");
		months.add("mayo");
		months.add("junio");
		months.add("julio");
		months.add("agosto");
		months.add("septiembre");
		months.add("octubre");
		months.add("noviembre");
		months.add("diciembre");
		String next = "";
		boolean lowerMonth = (month.equals("febrero") || month.equals("abril") || month.equals("junio")
				|| month.equals("septiembre") || month.equals("noviembre"));

		if (day <= 31 && months.contains(month) && year > 0) {

			if (day == 31 && month.equals("diciembre"))
				year++;

			if (lowerMonth && day < 30)
				day++;
			else if (!lowerMonth && day < 31)
				day++;
			else
				next = "ERROR";

			if (lowerMonth && day == 30) {
				day = 1;
				month = months.elementAt(months.search(month) + 1);
			} else if (!lowerMonth && day == 31) {
				day = 1;
				if (month.equals("diciembre"))
					month = "enero";
				else
					month = months.elementAt(months.search(month));
			}

			next = Integer.toString(day) + " " + month + " " + Integer.toString(year);

		} else
			next = "ERROR";

		return next;
	}

	public static void main(String[] args) {

		System.out.println(nextDate(31, "diciembre", 2021)); // <- respuesta 1 de enero 2022

	}

}
