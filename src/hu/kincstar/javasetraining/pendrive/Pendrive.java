package hu.kincstar.javasetraining.pendrive;

import java.util.List;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;


    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive adatai -- Neve: " + name + "Kapacitása: " + capacity + "Ára: " + price;
    }
    public void risePrice(int percent)
    {
        price = price * percent;
    }

    public int comparePricePerCapacity(Pendrive)
    {
        return 0;
    }


   /* boolean cheaperThan(Pendrive)
    {
        if()
        {return true}
        return  false;
    }*/

  /*public String best(List<Pendrive>)
  {

      return  null;
  }*/
}
