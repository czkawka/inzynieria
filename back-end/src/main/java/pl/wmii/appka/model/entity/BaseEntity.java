package pl.wmii.appka.model.entity;

import javax.persistence.*;

/**
 * Created by Damian on 18.12.2016.
 */
@MappedSuperclass
public abstract class BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
