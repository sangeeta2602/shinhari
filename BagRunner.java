class BagRunner{
public static void main(String [] args){
    
	Bag details = new Bag();
	
	details.run(234567,"jnv shool");
	
int bag =details.bag(2345);
String name =	details.bagName("saraswati");
float money = details.bagProfit(2345.34f);
boolean condition =	details.goodOrBad(true);
long sale =	details.toatalSale(4500000l);
char size =	details.bagSize('a');


	System.out.println(bag);
	System.out.println(name);
	System.out.println(money);
	System.out.println(condition);
	System.out.println(sale);
	System.out.println(size);

	
	}
	}