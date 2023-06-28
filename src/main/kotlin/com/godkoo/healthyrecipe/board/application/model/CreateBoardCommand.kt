package com.godkoo.healthyrecipe.board.application.model

import com.godkoo.healthyrecipe.board.domain.Board
import com.godkoo.healthyrecipe.common.types.YnType

data class CreateBoardCommand(
    var title: String,
    var contents: String,
    var useYn: YnType
) {

    fun toEntity(): Board {
        return Board(
            title = title,
            contents = contents,
            useYn = useYn
        )
    }
}