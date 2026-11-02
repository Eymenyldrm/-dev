void main(String[] args) {
    double vize1 = 60.0;
    double vize2 = 70.0;
    double finalsinav = 75.0;
    double ort = (vize1 / 4.0) + (vize2 / 4.0) + (finalsinav / 2.0);

    String mesaj = "Durumunuz: ";
    mesaj = mesaj + "Ortalamanız " + ort;

    System.out.println(mesaj);

    if (ort >= 85.0) {
        System.out.println("Takdir aldın!");
    } else if (ort >= 70.0) {
        System.out.println("Teşekkür aldın!");
    } else if (ort >= 50.0) {
        System.out.println("Geçtin!");
    } else {
        System.out.println("Kaldın!");
    }
}