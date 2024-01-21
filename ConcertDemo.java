public class ConcertDemo {
    public static void main(String[] args) {
        
        Concert aConcert = new Concert();

        // set details
        aConcert.setBand("Mayday");
        aConcert.setNumSeats(100);
        aConcert.setTicketPrice(200);

        // display initial information
        System.out.println("Initially:");
        System.out.println(aConcert.toString());;

        // sell some tickets
        aConcert.sellTickets(50);

        // display updated
        System.out.println("\nUpdated: ");
        System.out.println(aConcert.toString());

        // compare two concerts
        Concert aConcert2 = new Concert();
        aConcert2.setBand("Sodagreen");
        aConcert2.setNumSeats(100);
        aConcert2.setTicketPrice(200);

        System.out.println("\nComparing two concerts");
        if(aConcert.equals(aConcert2)){
            System.out.println("These two concerts are equal.");
        } else {
            System.out.println("These two concerts are not equal.");
        }


    }
}
