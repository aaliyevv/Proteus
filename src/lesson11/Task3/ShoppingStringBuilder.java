package lesson11.Task3;

public class ShoppingStringBuilder {
        public static void main(String[] args) {
            String[] items = {"Çörək", "Süd", "Yumurta", "Pendir", "Yağ"};

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < items.length; i++) {
                sb.append(items[i]); // məhsulu əlavə et

                if (i < items.length - 1) {
                    sb.append(", ");
                }
            }

            sb.append("!");

            System.out.println(sb.toString());
        }
    }

