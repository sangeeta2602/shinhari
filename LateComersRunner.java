class LateComersRunner{
public static void main(String [] args){
    
	LateComers details = new LateComers();
	details.run(234567,"jnv shool");
	
int lateC =	details.lateComers(15);
String name =details.day("monday");
boolean condition = details.punshmentOrFree(true);
long fine =	details.fine(250l);
char sec =details.section('a');
float time = details.time(6.34f);
    
	System.out.println(lateC);
	System.out.println(name);
	System.out.println(condition);
	System.out.println(fine);
	System.out.println(sec);
	System.out.println(time);


	
	}
	}