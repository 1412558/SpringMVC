package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Entity {
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public Entity() {

	}
}
