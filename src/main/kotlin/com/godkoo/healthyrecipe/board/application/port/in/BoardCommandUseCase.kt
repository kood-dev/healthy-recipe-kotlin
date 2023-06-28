package com.godkoo.healthyrecipe.board.application.port.`in`

import com.godkoo.healthyrecipe.board.application.model.CreateBoardCommand
import com.godkoo.healthyrecipe.board.domain.BoardID
import com.godkoo.healthyrecipe.common.annotation.UseCase

@UseCase
interface BoardCommandUseCase {
    fun save(command: CreateBoardCommand): BoardID
}