package com.appmetr.hercules.model;

import com.appmetr.hercules.annotations.Entity;
import com.appmetr.hercules.annotations.Id;
import com.appmetr.hercules.annotations.PKIndex;
import com.appmetr.hercules.annotations.TimeToLive;

import java.io.Serializable;

@Entity
@PKIndex
@TimeToLive(2)
public class TestEntityWithTTL implements Serializable {
    @Id public String id;

    public String stringValue;

    public TestEntityWithTTL() {
    }

    public TestEntityWithTTL(String id) {
        this.id = id;
        this.stringValue = "value" + id;
    }

    @Override public String toString() {
        return "TestEntity{" +
                "id='" + id + '\'' +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntityWithTTL entity = (TestEntityWithTTL) o;

        if (id != null ? !id.equals(entity.id) : entity.id != null) return false;
        if (stringValue != null ? !stringValue.equals(entity.stringValue) : entity.stringValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stringValue != null ? stringValue.hashCode() : 0);
        return result;
    }
}
