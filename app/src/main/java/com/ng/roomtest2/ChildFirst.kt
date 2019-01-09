package com.ng.roomtest2

import android.arch.persistence.room.Entity

@Entity(tableName = "child_first")
class ChildFirst(
    entityId: String,
    someField: String,
    contactDetails: ContactDetails?
) : Parent(
    entityId,
    EntityType.FIRST.type,
    someField,
    contactDetails
) {
    constructor(parent: Parent)
            : this(
        parent.entityId,
        parent.someField,
        parent.contactDetails
    )
}