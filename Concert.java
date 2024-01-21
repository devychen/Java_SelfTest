public class Concert {

    public static final double EPSILON = 0.01;

    private int numSeats;
    private int numTicketsSold;
    private double ticketPrice;
    private double totalSales;
    private String band;

    public Concert() {
        numSeats = numTicketsSold = 0;
        ticketPrice = 0;
        totalSales = 0;
        band = "";
    }

    /**
     * Get the name of the band
     * 
     * @return the name of the band
     */
    public String getBand() {
        return band;
    }

    /**
     * Set the name of the band
     * 
     * @param band the name of the band
     */
    public void setBand(String band) {
        this.band = band; // ???
    }

    /**
     * Get the number of seats
     * 
     * @return the number of seats
     */
    public int getNumSeats() {
        return numSeats;
    }

    /**
     * Set the number of sears
     * 
     * @param numSeats the number of seats
     */
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    /**
     * Get the ticket price
     * 
     * @return ticket price
     */
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Set the ticketPrice
     * 
     * @param ticketPrice price of the ticket
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Get the number of tickets sold
     * 
     * @return number of tickets sold
     */
    public int getTicketsSold() {
        return numTicketsSold;
    }

    /**
     * Get the number of tickets left unsold
     * 
     * @return number of tickets left unsold
     */
    public int getTicketsLeft() {
        return numSeats - numTicketsSold;
    }

    /**
     * Determine if there are still available seats for selling
     * 
     * @param numTickets number of tickets to sell
     * @return true if there still are available seats
     */
    private boolean okToSell(int numTickets) {
        /*
         * numTickets = numSeats - numTicketsSold;
         * if (numTickets > 0);
         * return true;
         */
        return getTicketsLeft() >= numTickets;
    }

    /**
     * Sell numTickets for this concert at current price
     * 
     * @param numTickets number of tickets to sell
     */
    public void sellTickets(int numTickets) {
        if (okToSell(numTickets)) {
            numTicketsSold += numTickets;
            totalSales += numTickets * ticketPrice;
        }
    }

    /**
     * Get the euro amount of the tickets sold
     * 
     * @return euro amount of the tickets sold
     */
    public double getTotalSales() {
        return totalSales;
    }

    /**
     * Print out the concert information
     * 
     * @return a String representing the concert
     *         (include band, ticket price and tickets left)
     */
    public String toString() {
        String rval = "Concert band name: " + getBand() + "\n" +
                "Per ticket price: " + getTicketPrice() + " euros.\n" +
                "Tickets left: " + getTicketsLeft() + "\n" +
                "Total sales: " + getTotalSales();
        return rval;
    }

    /**
     * Compare two concerts on their instance variables
     * @param otherConcert the concert to compare to
     * @return true if this Concert is equal to otherConcert
     * Concert 1 is the calling object (this)
     */
    public boolean equals(Concert otherConcert){
        boolean rval = false;
        if ((otherConcert != null) &&
            band.equals(otherConcert.band) &&
            numSeats == otherConcert.numSeats &&
            Math.abs(ticketPrice - otherConcert.ticketPrice) < EPSILON)
        {
            rval = true; 
        }
        return rval;
    }

}
