
public class Fraction {
	
	    // instance variables - replace the example below with your own
	    private int num;
	    private int denum;
	    
	    public static Fraction ZERO = new Fraction(0,1);
	    public static Fraction UN = new Fraction(1,1);

	   
	    public Fraction(int num,int denum)
	    {
	        
	        this.num=num;
	        this.denum=denum;
	        if (denum==0)  {throw new ArithmeticException();}
	        
	    }

	    
	    public Fraction(int numerateur)
	    {
	       this(numerateur,1);
	    }
	    
	    public Fraction()
	    {this(0,1);}
	    
	    public int getNum()
	    {return num;}
	    
	    public int getDenum()
	    {return denum;}
	    
	    public double FractionFloat()
	    {
	        double result,n,d;
	        n=this.num;
	        d=this.denum;
	        result=n/d;
	        
	        return result;
	    }
	    // Calculer l'addition
	    
	    public Fraction Addition(Fraction a, Fraction b)
	    {
	        
	        Fraction add= new Fraction(num, denum);
	        
	         if(b.denum!=a.denum)
	        {
	            a.num= a.num*b.denum;
	            b.num=b.num*a.denum;
	            
	            add.num=a.num+b.num;
	            add.denum=a.denum*b.denum;
	            
	         }
	         else
	         {
	             add.num=a.num+b.num;
	             add.denum=a.denum;
	          }
	        
	        return add;
	        

	       
	    }
	    
	    public boolean egaliter(Fraction a,Fraction b)
	    {
	        double r1=a.FractionFloat();
	        double r2=b.FractionFloat();
	        
	        double res;
	        res= r1-r2;
	        
	        if(res==0)
	        {return true;}
	        else return false;
	    
	    
	    }
	    
	    public String toString()
	    {
	        return ( this.num + "/" + this.denum ) ;
	    }
	    
	    public static String compare(Fraction a, Fraction b)
	    {
	        if (a.num*b.denum == b.num*a.denum)
	           { return (a.toString() + " = " + b.toString());}
	           
	        if (a.num*b.denum < b.num*a.denum)
	            {return (a.toString() + " < " + b.toString() );}
	        
	        else
	            {return (a.toString() + " > " + b.toString() );}
	    }
	}

