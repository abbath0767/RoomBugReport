package com.ng.roomtest2

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
interface FirstDao {

    @Query("SELECT * from child_first")
    fun getFirst(): Flowable<List<ChildFirst>>
}