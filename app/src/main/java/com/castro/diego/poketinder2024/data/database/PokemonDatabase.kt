package com.castro.diego.poketinder2024.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.castro.diego.poketinder2024.data.database.dao.PokemonDao
import com.castro.diego.poketinder2024.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], exportSchema = false, version = 1)
abstract class PokemonDatabase: RoomDatabase() {
    abstract fun getPokemonDao(): PokemonDao
}
