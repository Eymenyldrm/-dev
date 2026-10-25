//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double vize1 = 60.0;
    double vize2 = 70.0;
    double finalsinav = 75.0;
    double ort = (vize1/4) + (vize2/4) + (finalsinav/2);
    System.out.println("Ortalamanız 70");
    if (ort >= 85) {
        System.out.println("Takdir aldınız");
    } else if (ort >= 70) {
        System.out.println("Teşekkür aldınız");
    } else if (ort >= 50) {
        System.out.println("Geçtiniz");
    } else {
        System.out.println("Kaldınız");
    }}