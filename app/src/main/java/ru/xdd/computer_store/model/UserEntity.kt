package ru.xdd.computer_store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val userId: Long = 0,
    val username: String,
    val email: String,
    val passwordHash: String,
    val role: String
    // при необходимости можно добавить адрес, телефон и прочие поля
)

