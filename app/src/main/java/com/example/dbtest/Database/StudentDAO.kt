package com.example.dbtest.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {

    @Query("SELECT * FROM student")
    fun getAll(): List<Student>

    @Query("SELECT * FROM student where studentid= :id")
    fun getStudByID(id:String): Student

    @Insert
    fun insert(vararg s : Student)

    @Delete
    fun delete(vararg s: Student):Int
}