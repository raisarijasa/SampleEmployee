package com.test.SampleEmployee.model;

import java.io.Serializable;

public class BaseModel implements Serializable {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
