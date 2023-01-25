package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;

    UserHelper user;
    BoardHelper board;
    ListHelper list;
    CardHelper card;
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://trello.com/");

        user= new UserHelper(wd);
        board= new BoardHelper(wd);
        list= new ListHelper(wd);
        card= new CardHelper(wd);
        user.login("katuha1995@gmail.com","12345.com");

    }

    public void quit(){
        wd.close();
        wd.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public BoardHelper getBoard() {
        return board;
    }
    public ListHelper getList() {
        return list;
    }

    public CardHelper getCard() {
        return card;
    }
}
