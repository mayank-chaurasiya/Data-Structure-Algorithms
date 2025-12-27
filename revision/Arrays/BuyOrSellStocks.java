public class BuyOrSellStocks {

    public static int buySellStocks(int prices[]) {
        int buyStock = Integer.MAX_VALUE;
        int sellStock = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {

            // check for the lowest price and assign it to buyStock
            buyStock = Math.min(prices[i], buyStock);

            // if (prices[i] < buyStock) {
            // buyStock = prices[i];
            // }

            // check for the high price and assign it to sellStock
            sellStock = Math.max(prices[i], sellStock);
            
            // if (prices[i] > sellStock) {
            // sellStock = prices[i];
            // }

        }

        if (buyStock < sellStock) {
            return sellStock - buyStock;
        }

        return 0;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        int profit = buySellStocks(prices);

        if (profit == 0) {
            System.out.println("No profit achieved");
        } else {
            System.out.println("The profit is : " + buySellStocks(prices));
        }

    }
}
