public class WatchValid{
	Watch[] features=new Watch[5];
	boolean saveWatch(Watch watches){
		boolean validWatch=isWatchValid(watches);
		if(validWatch){
			for(int i=0;i<features.length;i++)
			{
				if(features[i]==null){
					features[i]=watches;
					System.out.println("watch is succcessfully saved");
					return true;
				}
				else{
					System.out.println(" index is not empty, the watch is not saved");	
				}
			}
			System.out.println("watch is not valid , so it is not saved");
			return false;
		}
		return false;
	}
	boolean isWatchValid(Watch watches){
		if(watches!=null){
			System.out.println("watch is not null");
			if(watches.getBrand()!=null&&watches.getBrand().length()>3){
				if(watches.getModel()!=null&&watches.getModel().length()>3){
					if(watches.getPrice()>0){
						return true;
					}
					else{
						System.out.println("price is not valid");
						return false;
					}
					
				}
				else{
					System.out.println("model is not valid");
					return false;
				}
			}
			else{
				System.out.println("brand is not valid");
				return false;
			}

		}
		else{
			System.out.println("watch is not null");
			return false;
		}
	}
	Watch[] fetchWatchList(){
		return this.features;
	}
	boolean checkWatchExists(Watch watches){
		if(watches!=null){
			for(int i=0;i<features.length;i++){
				if(features[i].getBrand().equals(watches.getBrand())){
					return true;
				}
				else{
					return false;
				}
				
			}
		}
		return false;
	}
	
}