package com.mobile.member.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 角色
 */
@Entity("Role")
public class MRole extends Role implements BasicEntity {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;

    public MRole() {
        super();
    }

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
