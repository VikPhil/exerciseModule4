package by.practice.simple_class08.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Write {

	private ListCustomer cus;

	public Write() {

	}

	public Write(ListCustomer cus) {
		this.cus = cus;
	}

	/*
	 * Считываем из файла данные покупателей в список
	 */
	public void writeData() throws IOException {

		String line;
		int index = 0;

		List<String> parts = new ArrayList<String>();

		String path = "src/Customers.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while ((line = br.readLine()) != null) {
			parts.add(line);
			if (line.equals("next")) {
				cus.getCustomer()[index] = new Customer(Integer.parseInt(parts.get(0)), parts.get(1), parts.get(2),
						parts.get(3), parts.get(4), Integer.parseInt(parts.get(5)), Integer.parseInt(parts.get(6)));
				parts.clear();
				index++;
			}

		}

		br.close();
		fr.close();

	}
}
