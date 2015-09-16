package MainPackage;

public class MyInteger {
	
	
	private int value;
	
	
	public MyInteger(int value){
		this.value = value;
	}
	
	
	public int getvalue(){
		return value;
	}
	
	
	public boolean isEven(){
		if(value%2 == 0){
			return true;
		}
		return false;
	}
	
	
	public boolean isOdd(){
		if(value%2 != 0){
			return true;
		}
		return false;
	}
	
	
	public boolean isPrime(){
		int i = 0;
        for (i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
	public static boolean isEven(int value){
		if(value%2 == 0){
			return true;
		}
		return false;
	}
	
	
	public static boolean isOdd(int value){
		if(value%2 != 0){
			return true;
		}
		return false;
	}
	
	
	public static boolean isPrime(int value){
		int i = 0;
        for (i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
	public static boolean isEven(MyInteger myInteger){
		return MyInteger.isEven(myInteger.getvalue());
	}
	
	
	public static boolean isOdd(MyInteger myInteger){
		return MyInteger.isOdd(myInteger.getvalue());
	}
	
	
	public static boolean isPrime(MyInteger myInteger){
		return MyInteger.isPrime(myInteger.getvalue());
	}
	
	
	public boolean equals(int Value){
		return value == Value;
	}
	
	
	public boolean equals(MyInteger myInteger){
		return equals(myInteger.getvalue());
	}
	
	
	public static int parseInt(char[]s){
		return parseInt(new String(s));
	}
	
	
	public static int parseInt(String a){
		return Integer.parseInt(a);
	}
}

