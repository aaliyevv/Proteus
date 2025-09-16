package lesson11.Task3;

public class StringBuilder {
        public static void main(String[] args) {
            String[] words = {"Java", "StringBuilder", "ilə", "asan", "və", "sürətlidir"};

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                sb.append(words[i]); // sözü əlavə edirik
                
                

                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }

            sb.append(".");

            System.out.println(sb.toString());
        }
    }
