
public class DirectionGiver implements Translator {

	Translate translate;

	public DirectionGiver(String language) {
		if (language == "French") {
			translate = new French();
		} else if (language == "English") {
			translate = new English();
		}
	}

	public void translation(String language, String message) {
		if (language == "French") {
			translate.fromFrench(message);
		} else if (language == "English") {
			translate.fromEnglish(message);
		}
	}

}
