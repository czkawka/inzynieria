package pl.wmii.appka.service.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Damian on 14.12.2016.
 */
public class EntityUtil {

  private static final Logger logger = LoggerFactory.getLogger(EntityUtil.class);
  private EntityManagerFactory emf;
  private EntityManager em;

  public EntityUtil() {
    createEntityManagerFactory();
    createEntityManager();
  }

  private void createEntityManagerFactory() {
    logger.debug("Tworzenie EntityManagerFactory ");

    try {
      emf = Persistence.createEntityManagerFactory("testJPA");
    } catch (Exception e) {
      logger.error("Tworzenie EntityManagerFactory nie powiodlo sie " + e);
      throw new IllegalStateException("Nie udało się utworzyć EntityManagerFactory",e);
    }
    logger.debug("Utowrzono EntityManagerFactory");
  }

  public void createEntityManager() {
    logger.debug("Tworzenie EntityManager ");
    try {
      em = emf.createEntityManager();
    } catch (Exception e) {
      logger.error("Tworzenie EntityManager nie powiodlo sie" + e);
      throw new IllegalStateException("Nie udało się utorzeyć EntityManager",e);
    }
    logger.debug("Utworzono EntityManager ");
  }


  public EntityManager getEntityManager() {
    return em;
  }

}
