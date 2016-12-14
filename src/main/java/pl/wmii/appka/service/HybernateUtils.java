package pl.wmii.appka.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Damian on 14.12.2016.
 */
public class HybernateUtils {
  private static final SessionFactory sessionFactory;

  static {
    try {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    } catch (Exception e) {
        System.err.println("Failed create hyernate session factory " + e);
        throw new ExceptionInInitializerError(e);
    }
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
