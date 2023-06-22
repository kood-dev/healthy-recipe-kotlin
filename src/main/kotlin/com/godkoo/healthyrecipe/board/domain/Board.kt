package com.godkoo.healthyrecipe.board.domain

import com.godkoo.healthyrecipe.common.entity.BaseEntity
import com.godkoo.healthyrecipe.common.types.YnType
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Board(
    @Id
    var boardId: BoardId,
    var title: String,
    var contents: String,
    var useYn: YnType

) : BaseEntity() {
}