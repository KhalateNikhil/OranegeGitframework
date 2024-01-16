package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	public String getHomePageTitle()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
  
	
	public String getHomePageUrl()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getCurrentUrl();
	}
}
