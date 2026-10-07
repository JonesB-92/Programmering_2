package navigation;

public class NavigationTest {

    public static void main(String[] args) {
        NavigationComponent globalMenu = new NavigationMenu("Pez International");

        NavigationComponent products = new NavigationMenu("Products");
        NavigationComponent play = new NavigationMenu("PEZ Play");
        NavigationComponent brand = new NavigationMenu("The Brand");
        NavigationComponent company = new NavigationMenu("Company");
        NavigationComponent bee = new NavigationMenu("Bee");
        NavigationComponent news = new NavigationMenu("News");
        NavigationComponent contact = new NavigationMenu("Contact");
        NavigationComponent shop = new NavigationMenu("Shop");

        NavigationComponent candies = new NavigationMenu("Candies");
        NavigationComponent dispensers = new NavigationMenu("Dispensers");
        NavigationComponent seasonals = new NavigationMenu("Seasonals");
        NavigationComponent gifts = new NavigationMenu("Gifts");
        NavigationComponent dextrose = new NavigationMenu("Dextrose");
        NavigationComponent fizzy = new NavigationMenu("Fizzy");
        NavigationComponent worlds = new NavigationMenu("Theme Worlds");

        NavigationComponent potter = new NavigationMenu("Harry Potter");
        NavigationComponent disney = new NavigationMenu("Disney");
        NavigationComponent mickey = new NavigationMenu("Mickey Mouse");
        NavigationComponent kitty = new NavigationMenu("Hello Kitty");
        NavigationComponent trolls = new NavigationMenu("Trolls");
        NavigationComponent supermario = new NavigationMenu("Super Mario");

        NavigationComponent luigi = new NavigationItem("Luigi", "https://int.pez.com/en/Products/Dispensers/Luigi");
        NavigationComponent mario = new NavigationItem("Mario", "https://int.pez.com/en/Products/Dispensers/Mario");
        NavigationComponent kinopio = new NavigationItem("Kinopio", "https://int.pez.com/en/Products/Dispensers/Kinopio");
        NavigationComponent yoshi = new NavigationItem("Yoshi", "https://int.pez.com/en/Products/Dispensers/Yoshi");

        supermario.addChild(luigi);
        supermario.addChild(mario);
        supermario.addChild(kinopio);
        supermario.addChild(yoshi);

        worlds.addChild(potter);
        worlds.addChild(disney);
        worlds.addChild(mickey);
        worlds.addChild(kitty);
        worlds.addChild(trolls);
        worlds.addChild(supermario);

        products.addChild(candies);
        products.addChild(dispensers);
        products.addChild(seasonals);
        products.addChild(gifts);
        products.addChild(dextrose);
        products.addChild(fizzy);
        products.addChild(worlds);

        globalMenu.addChild(products);
        globalMenu.addChild(play);
        globalMenu.addChild(brand);
        globalMenu.addChild(company);
        globalMenu.addChild(bee);
        globalMenu.addChild(news);
        globalMenu.addChild(contact);
        globalMenu.addChild(shop);

        HomePage homePage = new HomePage(globalMenu);
        homePage.print();
    }
}
