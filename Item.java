import java.util.ArrayList;
import java.util.List;

class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
    float a;
	//TODO constructor
	public Item(int id, String name, double price, float a) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
	}
    //TODO setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	double taxReturn () {
		//TODO
		double ddv = a*(price/100);
	return 15*(ddv/100);
	}
}

class Receipt{

    List<Item> lista = new ArrayList<Item>();

    public Receipt(List<Item> lista) {
        this.lista = lista;
    }

    double totalPrice () {
        double iznos = 0;
        for (Item i : lista) {
            iznos += i.getPrice();
        }
        return iznos;
    }

    double vkupnoDDV (){
        double d = i.getA()*(totalPrice()/100);
        double povratddv = 15*(d/100);
    return povratddv;
    }
}