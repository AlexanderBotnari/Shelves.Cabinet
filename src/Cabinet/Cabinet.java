package Cabinet;
import Things.Thing;

public class Cabinet {
       
	    private Thing topShelf;
	    private Thing middleShelf;
	    private Thing bottomShelf;
	    
	    public Cabinet() {
	    	
	    }
	    
	    public Thing whatIsOn( String shelfName ) {
	    	
	    	switch(shelfName) {
	    	case "topShelf" : return topShelf;
	    	case "middleShelf" : return middleShelf;
	    	case "bottomShelf" : return bottomShelf;
	    	default: return null;
			}
	    }
	    
	    public void put( String shelfName, Thing thing ){
	    	if(shelfName == "topShelf") {
	    		this.topShelf = thing;
	    	}else if(shelfName == "middleShelf") {
	    		this.middleShelf = thing;
	    	}else if(shelfName == "bottomShelf") {
	    		this.bottomShelf = thing;
	    	}else {
	    		System.out.println("The shelf does not exist");
	    	}
	    }
	    
	    public Thing take( String shelfName ) {
	    	Thing object = null;
	    	if(shelfName == "topShelf") {
	    		object = topShelf;
	    		topShelf = null;
	    	 }else if (shelfName == "middleShelf") {
	    		object = middleShelf;
	     		middleShelf = null;
	    	 }else if (shelfName == "bottomShelf") {
	    		object = bottomShelf;
	     		bottomShelf = null;
	    	 }
                return object;
	    }
}