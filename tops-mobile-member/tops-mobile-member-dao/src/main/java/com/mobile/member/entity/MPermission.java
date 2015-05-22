package com.mobile.member.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 权限
 */
@Entity("Permission")
public class MPermission extends Permission implements BasicEntity {

    private static final long serialVersionUID = -2676964880098994703L;

    @Id
    private ObjectId id;

    public MPermission() {
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
