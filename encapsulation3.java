class ReportCard {
    private int marks;

    public void setMarks(int m) {
        if (m >= 0 && m <= 100)
            marks = m;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main7 {
    public static void main(String[] args) {
        ReportCard r = new ReportCard();
        r.setMarks(85);
        System.out.println("Marks: " + r.getMarks());
    }
}
