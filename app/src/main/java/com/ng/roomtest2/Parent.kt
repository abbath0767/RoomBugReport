package com.ng.roomtest2

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.PrimaryKey

open class Parent(

    @ColumnInfo(name = "entity_id")
    @PrimaryKey(autoGenerate = false)
    val entityId: String,

    @ColumnInfo(name = "entity_type")
    var entityType: Int,

    @ColumnInfo(name = "some_field")
    var someField: String,

    @Embedded
    val contactDetails: ContactDetails?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Parent

        if (entityId != other.entityId) return false
        if (entityType != other.entityType) return false
        if (someField != other.someField) return false
        if (contactDetails != other.contactDetails) return false

        return true
    }

    override fun hashCode(): Int {
        var result = entityId.hashCode()
        result = 31 * result + entityType
        result = 31 * result + someField.hashCode()
        result = 31 * result + (contactDetails?.hashCode() ?: 0)
        return result
    }
}