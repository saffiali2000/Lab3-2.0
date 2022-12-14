import java.util.*;

public class AddressBook{
    private ArrayList<BuddyInfo> buddyInfoArray;

    public AddressBook() {
        buddyInfoArray = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null)
            buddyInfoArray.add(buddy);
    }

    public BuddyInfo removeBuddy(int i){
        if( i >= 0 && i < buddyInfoArray.size()) {
            buddyInfoArray.remove(i);
        }
        return null;
    }
//testing changes
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
    //testing change 2
}
