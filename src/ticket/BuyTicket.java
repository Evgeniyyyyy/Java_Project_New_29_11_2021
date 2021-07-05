package ticket;

public class BuyTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setName("Yevhen");
        ticket.setAge(300);
        ticket.setSex("male");
        ticket.setPrice(100);
        System.out.println("Ticket for: " + ticket.getName() + " " + ticket.getPrice());

    }
}
