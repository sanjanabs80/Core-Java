public class MediaPlayer extends StandaloneApplication{
	
	String[] favourites;
	
	MediaPlayer(String[] favourites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(size,compatiblewith,os,id,name,type,version,developer,date);
		this.favourites=favourites;
	}
	
	void play(){
		System.out.println("play");
	}
	
	void delete(){
		System.out.println("delete");
	}
	void download(){
		System.out.println("download");
	
	}
	
	}