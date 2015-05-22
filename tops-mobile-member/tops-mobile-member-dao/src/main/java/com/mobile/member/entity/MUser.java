package com.mobile.member.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("User")
public class MUser extends User implements BasicEntity {

	private static final long serialVersionUID = -8461005111360054614L;

	@Id
    private ObjectId id;

	public MUser() {}


	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = new ObjectId(id);
	}

}
