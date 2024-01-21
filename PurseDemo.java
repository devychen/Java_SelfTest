public class PurseDemo {
    public static void main(String[] args) {
        
        Purse myPurse = new Purse();
        
        myPurse.addOneCentCoins(100);
        myPurse.addTenCentCoins(10);
        myPurse.addFiftyCentCoins(2);
        myPurse.addOneEuroCoins(2);

        System.out.println(myPurse.getTotal());

        System.out.println(myPurse.toString());
    }
}
