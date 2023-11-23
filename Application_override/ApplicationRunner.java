public class ApplicationRunner{
public static void main(String[] args){

System.out.println("main method starting");
Application application=new Application(12,"java",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
System.out.println(application.id);
System.out.println(application.name);
System.out.println(application.type);
System.out.println(application.version);
System.out.println(application.developer);
System.out.println(application.date);
application.run();
application.stop();
application.execute();
application.collectInfo();
application.displayInfo();

System.out.println("======================================================");


StandaloneApplication alone=new StandaloneApplication(10,"windows7",Os.MAC,12,"java",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
System.out.println(alone.size);
System.out.println(alone.compatiblewith);
System.out.println(alone.os);
alone.consumeMemory();
alone.consumeInternet();
alone.run();
alone.execute();

System.out.println("======================================================");

String[] supportedBrowsers= {"google","chrome"};
WebApplication web=new WebApplication(supportedBrowsers,true,12,"java",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
System.out.println(web.supportBrowsers);
System.out.println(web.free);
web.connectInternet();
web.sendUsage();
web.run();
web.stop();
web.execute();

System.out.println("======================================================");

String[] downloads={"Intellij","vscode"};
String[] browsingHistorySites={"google","youTube"};

Browser browser=new Browser(downloads,browsingHistorySites,10,"windows7",Os.UBUNTU,10,"windows7",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
System.out.println(browser.downloads);
System.out.println(browser.browsingHistorySites);
System.out.println(browser.size);
System.out.println(browser.compatiblewith);
System.out.println(browser.os);
browser.settings();
browser.displayHistory();

System.out.println("======================================================");
String[] fav={"mxplayer","spotify"};
MediaPlayer media=new MediaPlayer(fav,10,"windows7",Os.UBUNTU,10,"windows7",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
System.out.println(media.favourites);
System.out.println(media.size);
System.out.println(media.type);
System.out.println(media.os);
media.play();
media.delete();
media.download();

System.out.println("======================================================");

Chrome chrome=new Chrome(downloads,browsingHistorySites,10,"windows7",Os.UBUNTU,10,"windows7",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");

chrome.run();
chrome.stop();
chrome.execute();
chrome.consumeMemory();
chrome.connectInternet();
chrome.collectInfo();
chrome.displayHistory();
chrome.displayInfo();
chrome.settings();
chrome.sendUsage();

System.out.println("======================================================");

EdgeBrowser edge=new EdgeBrowser(downloads,browsingHistorySites,10,"windows7",Os.UBUNTU,10,"windows7",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");

edge.run();
edge.stop();
edge.execute();
edge.consumeMemory();
edge.connectInternet();
edge.collectInfo();
edge.displayHistory();
edge.displayInfo();
edge.settings();
edge.sendUsage();

System.out.println("======================================================");

FireFox fire=new FireFox(downloads,browsingHistorySites,10,"windows7",Os.UBUNTU,10,"windows7",ApplicationType.EXCEL,1.8,"sun microsystem","4-06-1994");
fire.run();
fire.stop();
fire.execute();
fire.consumeMemory();
fire.connectInternet();
fire.collectInfo();
fire.displayHistory();
fire.displayInfo();
fire.settings();
fire.sendUsage();


System.out.println("main method ending");




}

}