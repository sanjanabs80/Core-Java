public class WatchRun{

    public static void main(String[] args) {
        
   WatchValid watchval=new WatchValid();
   
   String[] str={"case","scratchproof","glass"};
   Watch obj1=new Watch("omega","blackwatch",1200,true,str);
   Watch obj2=new Watch("fastrack","i3800",2000,true,str);
   Watch obj3=new Watch("","",0,true,str);
   
   watchval.saveWatch(obj1);
   watchval.saveWatch(obj2);
   watchval.saveWatch(obj3);
   
   Watch[] fetchValue=watchval.fetchWatchList();
   for(int i=0;i<fetchValue.length;i++){
	   if(fetchValue[i]!=null)
		   fetchValue[i]. printValues();
   }
	}
}

   
   
   
   