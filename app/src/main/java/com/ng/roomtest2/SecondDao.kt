package com.ng.roomtest2

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
interface SecondDao {

    @Query("SELECT * from child_second")
    fun getSecond(): Flowable<List<ChildSecond>>
}