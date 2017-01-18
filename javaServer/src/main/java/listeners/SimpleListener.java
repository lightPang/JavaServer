package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SimpleListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context loaded!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {}

}
