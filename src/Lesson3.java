public class Lesson3 {
    public  static  void main (String[] Args) {

        // if total more than 1000 15% discount applied
        // if total more than 500 10% discount applied

        // && - AND
        // || - OR
        // ! - Not equal
        // true && true == true
        // true && false == false
        // false && true == false
        // false && false == false

        // true || true == true
        // true || false == true
        // false || true == true
        // false || false == false


        // !false == true
        // !true == false


        int cartTotal = 1001;
        double totalToPay;

     /*   if (cartTotal > 1000) {
            System.out.println("Discount 15% applied");
            totalToPay = cartTotal * 0.85;
        }
        else if (cartTotal > 500) {
            System.out.println("Discount 10% applied");
            totalToPay = cartTotal * 0.9;
        }
        else
        {
            totalToPay = cartTotal;
        }
            System.out.println("Your Total: " + totalToPay );*/



        if (cartTotal >= 500 && cartTotal <= 1000) {
            System.out.println("Discount 10% applied");
            totalToPay = cartTotal * 0.9;
        }
        else if (cartTotal > 1000) {
            System.out.println("Discount 15% applied");
            totalToPay = cartTotal * 0.85;
        }
        else if (cartTotal > 0 && cartTotal <= 499) {


            {
                totalToPay = cartTotal;
            }
            System.out.println("Discount absent Your Total:" + totalToPay );
        }


    }
}
