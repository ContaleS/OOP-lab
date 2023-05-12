public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDc[] dvdList = new DigitalVideoDc[Cart.maxNumOrdered];
        dvdList[0] = new DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        dvdList[1] = new DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        dvdList[2] = new DigitalVideoDc("Aladin", "Animation", 18.99f);
/*        DigitalVideoDc dvd1 = new DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        DigitalVideoDc dvd2 = new DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDc dvd3 = new DigitalVideoDc("Aladin", "Animation", 18.99f);
       anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd2);
       anOrder.addDigitalVideoDisc(dvd1); */
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvdList,3);
        anOrder.addDigitalVideoDisc(dvdList[0],dvdList[1]);
        System.out.println("Total cost is:");
        System.out.println(anOrder.calculateCost());
    }
}
