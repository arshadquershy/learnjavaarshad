class CarWash{
	//public static void main(String[] args) {
	private   String category;
	  private int  p;
	private   String ownername;
	final public static String storename="tata and tata";
	public  void setOwner(String owner){
		ownername=owner;
		}
	public String   getOwner(){
		return ownername;
		}		
	public  void  setCategory(String ctr){
		category =ctr;
		}  
	public String   getCategory() {
			return category;	
		}
	public void setPrice(int  p){
		this.p = p;
	}
	public int  getPrice(){
		if(category=="a")
			p=200;
		else
		if(category=="b")
			p=150;
		else
			p=100;
		return p;
		}	
	
}
class Company
{
	public static void main(String[] args) {
		CarWash c1=new CarWash();
		CarWash c2=new CarWash();
		c1.setOwner("arshad");
		c2.setOwner("kaboom");
		c1.setCategory("a");
		c2.setCategory("b");
		//c1.setPrice(100);
		//c2.setPrice(150);
		System.out.println(c1.getOwner()+"\t"+c1.getCategory()+"\t"+c1.getPrice()+"\t"+c1.storename);
		System.out.println(c2.getOwner()+"\t"+c2.getCategory()+"\t"+c2.getPrice()+"\t"+c2.storename);
	}
}