package Navegator;

public class Navegator implements NavegatorInterface{


    @Override
    public void refreshPage() {
        System.out.println("Refreshing Page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding New Tab");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Opening Page: " + url);
    }
}
