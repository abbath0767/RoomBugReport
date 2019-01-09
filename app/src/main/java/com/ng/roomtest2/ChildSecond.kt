package com.ng.roomtest2

import android.arch.persistence.room.Entity

@Entity(tableName = "child_second")
class ChildSecond(
    entityId: String,
    someField: String,
    contactDetails: ContactDetails?
) : Parent(
    entityId,
    EntityType.SECOND.type,
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