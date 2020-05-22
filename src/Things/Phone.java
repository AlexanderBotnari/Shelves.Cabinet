package Things;
public class Phone extends Thing{

	private String name;

	public Phone(String name) {
		setName(name);
	}
	
	@Override
	public void setName(String name){
		if(name.length() != 0) {
			this.name = name;
		}else {
			System.out.println("Invalid name!");
		}
		
	}

	@Override
	public String getName() {
		return name;
	}
}


