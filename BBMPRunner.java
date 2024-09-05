class BBMPRunner{
public static void main(String [] args){
    
	BBMP details = new BBMP();
	details.wert(234567,"jnv shool");
int workers =	details.workers(2345);
String name =	details.inchargeName("saraswati");
double donation = details.constructionDonation(450000.00d);
boolean condition =	details.condition(true);
long amount =	details.constructionAmount(4500000l);
char direction =details.building('a');
float planting = details.noPlants(23456.34f);
    
	System.out.println(workers);
	System.out.println(name);
	System.out.println(amount);
	System.out.println(condition);
	System.out.println(planting);
	System.out.println(direction);
	System.out.println(donation);
	
	}
	}