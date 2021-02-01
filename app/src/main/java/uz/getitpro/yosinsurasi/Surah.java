package uz.getitpro.yosinsurasi;

public class Surah {

    private int ayatNum;
    private String arabicText;
    private String readingText;
    private String uzbekText;

    public Surah(int ayatNum, String arabicText, String readingText, String uzbekText) {
        this.ayatNum = ayatNum;
        this.arabicText = arabicText;
        this.readingText = readingText;
        this.uzbekText = uzbekText;
    }

    public int getAyatNum() {
        return ayatNum;
    }

    public void setAyatNum(int ayatNum) {
        this.ayatNum = ayatNum;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public String getReadingText() {
        return readingText;
    }

    public void setReadingText(String readingText) {
        this.readingText = readingText;
    }

    public String getUzbekText() {
        return uzbekText;
    }

    public void setUzbekText(String uzbekText) {
        this.uzbekText = uzbekText;
    }
}
