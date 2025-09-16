package lesson11.Task3;

public class ShoppingStringBuilder {
        public static void main(String[] args) {
            // Məhsullar massivi
            String[] items = {"Çörək", "Süd", "Yumurta", "Pendir", "Yağ"};

            // StringBuilder yaradılır
            StringBuilder sb = new StringBuilder();

            // Məhsulları siyahıya əlavə edirik
            for (int i = 0; i < items.length; i++) {
                sb.append(items[i]); // məhsulu əlavə et

                // sonuncudan başqa məhsulların arasına ", " qoy
                if (i < items.length - 1) {
                    sb.append(", ");
                }
            }

            // Sonda nida işarəsi əlavə et
            sb.append("!");

            // Nəticəni çap et
            System.out.println(sb.toString());
        }
    }

}
