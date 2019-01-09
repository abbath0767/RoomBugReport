package com.ng.roomtest2

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [ChildFirst::class, ChildSecond::class], version = 1)
abstract class SampleDb: RoomDatabase() {

    abstract fun getFirstDao(): FirstDao
    abstract fun getSecondDao(): SecondDao
}