package tests;

import manager.MyDataProvider;
import model.Card;
import org.testng.annotations.Test;

public class CardCreation extends TestBase{

    @Test(dataProvider = "dataCardCSV",dataProviderClass = MyDataProvider.class)
    public void cardCreation1(Card card){
       // Card card= Card.builder().cardName("test1").color("green").build();

        app.getBoard().clickOnTheFirstBoard();
        app.getBoard().pause(2000);
        app.getList().createList("test36");
        app.getList().pause(2000);
        app.getCard().initCardCreation();
        app.getCard().fillInCardCreationForm(card);
        app.getCard().submitCardCreation();
        app.getBoard().returnToHomePage();
    }
}
