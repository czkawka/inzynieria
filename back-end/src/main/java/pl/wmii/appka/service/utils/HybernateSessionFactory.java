package pl.wmii.appka.service.utils;

import pl.wmii.appka.service.utils.HybernateUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Damian on 14.12.2016.
 *
 * Klasa ta wraz z deployem uruchamia validacje bazy danych z hybernate.cfg.xml
 */
public class HybernateSessionFactory implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    HybernateUtils.getSessionFactory();
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {

    HybernateUtils.getSessionFactory().close();
  }
}
