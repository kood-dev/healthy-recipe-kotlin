package com.godkoo.healthyrecipe.board.adapter.`in`.web.model

import com.godkoo.healthyrecipe.board.application.model.CreateBoardCommand
import com.godkoo.healthyrecipe.common.types.YnType

data class CreateBoardRequest(
    var title: String,
    var contents: String,
    var useYn: YnType
) {

    fun convertTo(): CreateBoardCommand {
        return CreateBoardCommand(
            title = title,
            contents = contents,
            useYn = useYn
        )
    }
}
