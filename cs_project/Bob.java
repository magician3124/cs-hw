import java.util.Random;
public class Bob{
	Addressing bobFirstAddress = new Addressing();
	int addresslength = (int)(26 + Math.random()*35);
	public int money = 0;
	public String addressValue = bobFirstAddress.AlphanumericStringGenerator(addresslength);
	public Bob(){
	}
	public void setMoney(int money){
		this.money = money;
	}
	public void modifier(int value){
		this.money += value;
	}
}

