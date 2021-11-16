public class Games {
    Object[] objects;

    public Games() {

        objects = new Object[3];

        objects[0] = new DarkSouls();
        objects[1] = new Bloodborne();
        objects[2] = new TheLegendOfZelda();
    }

    public void print(){
        for (Object a : objects){
            System.out.println(a);
        }
    }

    public void platform(){
        for (Object a : objects){
            if (a instanceof Platform)
                ((Platform)a).platform();
        }
    }
}
