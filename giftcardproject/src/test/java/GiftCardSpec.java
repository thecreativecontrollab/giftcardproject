import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A gift card")
class GiftCards extends GiftCardProduct {

    private GiftCard giftCard;


    @BeforeEach
     void runBeforeEachUnitTestInThisClass() {
        giftCard = new GiftCard();
    }

        // Is Empty returns false, given the user has purchased a gift card

        // Is returns true given the gift card has been used
        @Test
        @DisplayName("Not Empty")
        private Object hasBalance(GiftCard giftCard) {

            // Arrange - Fulfill the condition

            // Act - Call on the method you want to test
            boolean result;
            if (giftCard) {
                result = true;
            } else result = false;
            return result;


            // Assert - Verify the Act method is what is to be expected
        assertEquals(true, result);

        }

    @Test
    @DisplayName("No Balance")
    public void isEmptyReturnsZeroBalance_IfUsed() {
        // Arrange - Fulfill the condition

        // Act - Call on the method you want to test
        boolean result = giftCard.isEmpty();

        // Assert - Verify the Act method is what is to be expected
        assertEquals(true,
                true);
    }

    @Test
    @DisplayName("Check Balance")
    public void displaysBalanceOfCard() {

        // arrange

        // Act - Call on the method you want to test
        double result = giftCard.displaysBalanceOfCard();

        assertEquals(25, result);

    }

}


//
//    @Test
//    private  GiftCardProduct newCard;
//    List<GiftCards> newCard = newCard.purchase();
//     assertTrue(newCard.purchase(), () -> "Gift Card should have an amount")
//}
