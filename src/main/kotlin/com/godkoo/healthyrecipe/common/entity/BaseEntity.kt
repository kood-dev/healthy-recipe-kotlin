package com.godkoo.healthyrecipe.common.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    lateinit var createdAt: LocalDateTime
    @LastModifiedDate
    @Column(nullable = false)
    lateinit var lastModifiedAt: LocalDateTime

    @PrePersist
    fun prePersist() {
        createdAt = LocalDateTime.now()
        lastModifiedAt = LocalDateTime.now()
    }

    @PreUpdate
    fun preUpdate() {
        lastModifiedAt = LocalDateTime.now()
    }
}