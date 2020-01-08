import java.util.Random;
public class Alice{
	Addressing aliceFirstAddress = new Addressing();
	int addresslength = (int)(26 + Math.random()*35);
	public int money = 0;
	public String addressValue = aliceFirstAddress.AlphanumericStringGenerator(addresslength);
	public Alice(){
	}
	public void setMoney(int money){
		this.money = money;
	}
	public void modifier(int value){
		this.money += value;
	}
}