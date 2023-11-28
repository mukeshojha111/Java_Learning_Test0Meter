package Learning_Java;

public class HoursMinSecConversion {

	public static void main(String[] args) {
		int seconds = 86399;
        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours+" hours " + minutes +" minutes " + seconds+" seconds");
	}

}
