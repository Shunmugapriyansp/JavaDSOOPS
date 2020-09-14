package tester;
public class Link{
	public String bookName;
	public int millionsSold;

	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links

	public	Link next;

	public Link(String bookName, int millionsSold){

		this.bookName = bookName;
		this.millionsSold = millionsSold;
		}
	
 public void display(){
	 System.out.println(bookName+": "+millionsSold + "000,000 Sold");
	 }
 
 
 public String toString(){
	 return bookName;
 }
 
 
 public static void main(String[] args) {
	 
	 Linklist theLinklist = new Linklist();
	 theLinklist.insertFirstLink("test",100);
	 theLinklist.insertFirstLink("Baby", 1000);
	 theLinklist.insertFirstLink("Love",500);
	 theLinklist.insertFirstLink("you", 90000);
	 
	theLinklist.display();
	
	theLinklist.removeFirst();
	theLinklist.display();
}


}
 
 class Linklist{
	 public Link firstLink;
	 Linklist(){
		 firstLink = null;
	 }
	 
	 public boolean isEmpty(){
	return (firstLink==null);
	
	 }

 public void insertFirstLink(String bookName, int millionsSold){
	 Link newLink = new Link(bookName, millionsSold);
	 newLink.next= firstLink;
	 firstLink= newLink;
 }
 
 
 
public Link removeFirst(){
	Link linkref=firstLink;
	if(!isEmpty()){
		firstLink = firstLink.next;
	}else{
		System.out.println("Link is empty");
	}
	return linkref;
	
}

public void display() {
	Link theLink = firstLink;
	
	while(theLink != null){
		theLink.display();
		System.out.println("Next --->   " + theLink.next);
		theLink = theLink.next;
		
		System.out.println();
	}
}


public Link findLink(String bookName) {
	Link theLink = firstLink;
	if (!isEmpty()){
		while(theLink.bookName != bookName){
			if(theLink.next!=null){
				theLink= theLink.next;
			}else{
				return null;
			}
		}	
		return theLink;		
	}else{
		System.out.println("List is Empty");
		return null;	
	}
	
	
}

public Link removeLink(String bookName) {
	Link CurrentLink = firstLink;
	Link PrevLink = firstLink;
	if (!isEmpty()){
		while(CurrentLink.bookName != bookName){
			if(CurrentLink.next!=null){
				PrevLink= CurrentLink;
				CurrentLink= CurrentLink.next;
				
			}else{
				return null;
			}
		}	
		if (CurrentLink == firstLink){
			firstLink=CurrentLink.next;
		}	else{
		PrevLink.next = CurrentLink.next;
		}
		return CurrentLink;
	}else{
		System.out.println("List is Empty");
		return null;	
	}


}
}	