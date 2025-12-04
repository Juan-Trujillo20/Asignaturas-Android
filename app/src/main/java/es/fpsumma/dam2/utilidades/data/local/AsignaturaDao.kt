package es.fpsumma.dam2.utilidades.data.local

import androidx.room.Dao
import androidx.room.Delete

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import es.fpsumma.dam2.utilidades.model.Asignatura
import es.fpsumma.dam2.utilidades.model.Tarea


@Dao
interface AsignaturaDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(asignatura : Asignatura)

    @Update
    suspend fun update(asignatura : Asignatura)


    @Delete
    suspend fun delete(asignatura : Asignatura)


}

