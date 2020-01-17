class GiftCard {

    private GiftCard giftCard;
    private double amount;
    private long pin;
    private long giftCardId;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double balance;


    public GiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    public GiftCard() {

    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    private double displaysBalanceOfCard() {
        return 25;
    }
    protected boolean isEmpty() {
        return true;
    }

    private  GiftCard hasBalance(GiftCard giftCard) {
        return giftCard;
    }
}
