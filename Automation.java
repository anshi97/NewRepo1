import java.util.ArrayList;

public class Automation <wishlist> {
	private String name; 
	private ArrayList<Item> wishlist;
	private User mytaste;
	private User con;
	
	public User(String name, User con){
		this.name = name;
                this.con = con;
		wishlist = new ArrayList<Item>();
	}
	//#BR45
	public String getName(){
		return name;
	}

	public ArrayList<Item> getWishlist(){
		return wishlist;
	}
	
	public void addToWishlist(Item item){
		wishlist.add(item);
	}
	
	public void removeFromWishlist(Item item){
		wishlist.remove(item);					//US1003
	}
      
	public User getTasteManager(){
		return mytaste;
	}

        public Item getddItemFromWishlist(int i){
		return wishlist.get(i);
	}
	public static void main(String[] args) {
		//Auto-generated method stub

	}
//User_123
