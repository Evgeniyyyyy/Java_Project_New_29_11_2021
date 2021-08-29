import java.util.List;

public class MathOlegO {
    public static void main(String[] args) {

        System.out.println();

    }

    // возвр змасив с с стрингов и целых чисел в одном массиве
    public class MixedSum {
        public int Sum(List<?> mixed) {
            int result = 0;
            for (Object obj : mixed) {
                if (obj instanceof Integer) {
                    result += (Integer) obj;
                } else {
                    result += Integer.valueOf((String) obj);
                }

            }
            return result;

        }
    }
    //сотрировка слов в List<>

        public static List<String> sort (List<String> textBooks){
            textBooks.sort(String::compareToIgnoreCase);
            return textBooks;
        }
    }



