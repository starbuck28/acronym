import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Acronym {
  private String phrase;
  private String abbreviation = "";

    Acronym(String phrase) {
      this.phrase = phrase;
    }

    String get() {
      Pattern pattern = Pattern.compile("\\b[a-zA-Z]");
      Matcher matcher = pattern.matcher(phrase);

      while(matcher.find()) {
        abbreviation += matcher.group();
      }
      return abbreviation.toUpperCase();
    }
}
