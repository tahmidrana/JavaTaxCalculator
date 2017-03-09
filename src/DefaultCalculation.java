
class DefaultCalculation {
	
	public String CalculationFunc(String input){
		int tk=Integer.parseInt(input);
		int toShow;
		
		double res=0;
	    tk=tk-220000;
	    if(tk<300000){
	        res+=(tk*10)/100;
	    }

	    else{
	        res+=(300000*10)/100;
	        tk=tk-300000;
	        if(tk<400000)
	            res+=(tk*15)/100;
	        else{
	            res+=(400000*15)/100;
	            tk=tk-400000;
	            if(tk<500000)
	                res+=(tk*20)/100;
	            else{
	                res+=(500000*20)/100;
	                tk=tk-300000;
	                if(tk<3000000)
	                	res+=(tk*20)/100;
	                else{
	                	res+=(3000000*25)/100;
	                	tk=tk-3000000;
	                	
	                	res+=(tk*30)/100;
	                }
	                
	            }
	        }
	    }
	    
	    if(res<0)
	    	toShow=0;
	    else if(res>0 && res<2000)
	    	toShow=2000;
	    else
	    	toShow=(int) (res);
	    String s = Integer.toString(toShow);
	    return s;	
	}

}
