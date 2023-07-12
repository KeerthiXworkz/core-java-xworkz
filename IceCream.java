class IceCream{

static String flavorsNames[]={null,null,null,null,null,null};
static int index;

public static boolean intoFlavors(String flavors){
  boolean isFlavor = false;
  if(flavors != null){
  flavorsNames[index]=flavors;
  index++;
  isFlavor = true;
  }
 return isFlavor; 
}

   public static boolean updateFlavorsName(String existingName,String updatedName){
	  boolean isUpdated =false;
     for(int flavorindex=0 ;flavorindex<flavorsNames.length; flavorindex++){
      if(flavorsNames[flavorindex].equals(existingName)){
		  flavorsNames[flavorindex] = updatedName;
		  isUpdated =true;
	  }		 
   }
   return isUpdated;
   } 
   
    public static void getFlavorsName(){

 System.out.println("invoking of getFlavorsName");
 for(int flavors=0; flavors<flavorsNames.length;flavors++){
 String reference = flavorsNames[flavors];
 System.out.println(reference);
 }
 System.out.println("end of getFlavorsName");
}
 
   
   public static int deleteFlavorName(String delflavorName){
	   System.out.println("invoking of deleteFlavorName");
	   boolean isDeleted = false;
	   int flavorindex;
	   int noOfElement = flavorsNames.length;
	   System.out.println(noOfElement);
	   for(flavorindex=0 ; flavorindex<flavorsNames.length ;flavorindex++){
		   if(flavorsNames[flavorindex].equals(delflavorName)){
			 System.out.println("item name is matched");
              break ;			 
	   }
	    
   }
    if(flavorindex < noOfElement)
	{ 
        noOfElement =noOfElement-1;
		for(int newNameIndex =flavorindex ; newNameIndex<noOfElement; newNameIndex++){
			
			flavorsNames[newNameIndex] = flavorsNames[newNameIndex+1];
		}
	}
	System.out.println(noOfElement);
   return noOfElement;
   } 
   
	 public static void getFlavorsNamePostDeletion(int newLength){
		for(int flavorindex= 0;flavorindex< newLength;flavorindex++){
			System.out.println(flavorsNames[flavorindex]);
		} 
	}
	public static String searchFlavorName(String flavorsName){
		System.out.println("invoking of searchFlavorName");
		System.out.println("no of parameter is 1,type String");
		String fName = null;
		for(String name : flavorsNames){
			if(name.equals(flavorsName)){
			fName =	name;
			System.out.println("the flavor name is found");
			}
			else{
				System.out.println("the flavor name is not found");
			}
		}
		
		return fName;
	}
}

   
 