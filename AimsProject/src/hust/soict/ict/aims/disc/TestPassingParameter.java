package hust.soict.ict.aims.disc;

import hust.soict.ict.aims.disc.DigitalVideoDc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDc jungleDVD = new DigitalVideoDc("Jungle");
        DigitalVideoDc cinderellaDVD = new DigitalVideoDc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jugle dvd title : " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title : " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title : " + jungleDVD.getTitle());

    }

/*    public static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
*/
    public static void changeTitle(DigitalVideoDc dvd, String title) {
        String oldTitleString = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDc(oldTitleString);
    }
    public static void swap(DigitalVideoDc dvd1, DigitalVideoDc dvd2) {
        DigitalVideoDc temp = new DigitalVideoDc(dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirector(), dvd1.getLength(), dvd1.getCost());

        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setLength(dvd2.getLength());
        dvd1.setCost(dvd2.getCost());

        dvd2.setTitle(temp.getTitle());
        dvd2.setCategory(temp.getCategory());
        dvd2.setDirector(temp.getDirector());
        dvd2.setLength(temp.getLength());
        dvd2.setCost(temp.getCost());
    }
}
