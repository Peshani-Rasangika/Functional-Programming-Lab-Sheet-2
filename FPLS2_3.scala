def normal(hours:Int)=hours*250;

def ot(hours:Int)=hours*85;

def totalIncome(hours1:Int,hours2:Int):Int=normal(hours1)+ot(hours2);

def tax(hours1:Int,hours2:Int):Double=totalIncome(hours1,hours2)*0.12;

def takeHomeSalary(hours1:Int,hours2:Int)=totalIncome(hours1,hours2)-tax(hours1,hours2);

def main(args: Array[String])={
    println("Take Home Salary of an Employee: " + takeHomeSalary(40,30));
}