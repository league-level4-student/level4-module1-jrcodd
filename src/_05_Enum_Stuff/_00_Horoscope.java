package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	public static int input;
	public static String choice;
	public static String[] options = { "aries", "aquarius", "cancer", "capricorn", "capricorn", "gemini", "leo",
			"libra", "pisces", "sagittarius", "scorpio", "taurus", "virgo" };
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	void display(Zodiac sign) {
		switch (sign) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "aeries");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "aquarius");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "cancer");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "capricorn");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "gemini");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "leo");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "libra");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "pisces");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "sagittarius");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "scorpio");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "taurus");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "virgo");
			input = JOptionPane.showOptionDialog(null, "Chose a Zodiac sign", "Zodaic", 0, -1, null,
					options, 0);

			choice = options[input];
			break;
		default:
			break;
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope thing = new _00_Horoscope();

		input = JOptionPane.showOptionDialog(null, "Choose a Zodaic sign", "Zodaic", 0, -1, null, options,
				0);

		choice = options[input];
		for (int i = 0; i == 0;) {
			switch (choice) {
			case "aries":
				thing.display(Zodiac.ARIES);
				break;
			case "aquarius":
				thing.display(Zodiac.AQUARIUS);
				break;
			case "cancer":
				thing.display(Zodiac.CANCER);
				break;
			case "capricorn":
				thing.display(Zodiac.CAPRICORN);
				break;
			case "gemini":
				thing.display(Zodiac.GEMINI);
				break;
			case "leo":
				thing.display(Zodiac.LEO);
				break;
			case "libra":
				thing.display(Zodiac.LIBRA);
				break;
			case "pisces":
				thing.display(Zodiac.PISCES);
				break;
			case "sagittarius":
				thing.display(Zodiac.SAGITTARIUS);
				break;
			case "scorpio":
				thing.display(Zodiac.SCORPIO);
				break;
			case "taurus":
				thing.display(Zodiac.TAURUS);
				break;
			case "virgo":
				thing.display(Zodiac.VIRGO);
				break;
			default:
				break;
			}
		}

		input = JOptionPane.showOptionDialog(null, "Choose a zodiac sign", "Zodiac Signs", 0, -1, null, options, 0);
		choice = options[input];

	}
}
