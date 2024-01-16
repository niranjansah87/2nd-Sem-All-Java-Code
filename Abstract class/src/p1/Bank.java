package p1;

abstract class Bank
{    
abstract double getRateOfInterest();
abstract double calculateInterest();
}    
class SBI extends Bank{ 
	double p=5000;
	double noofyear=5;
double getRateOfInterest(){
	return 7;
	}

@Override
double calculateInterest() {
	
	double interest;
	interest=((p*noofyear*7)/100);
	return interest;
}    
}    
class ICICI extends Bank{ 
	double p=5000;
	double noofyear=5;
double getRateOfInterest(){
	return 8;
	}

@Override
double calculateInterest() {
	
	double interest;
	interest=((p*noofyear*8)/100);
	return interest;
}    
}    
    
   