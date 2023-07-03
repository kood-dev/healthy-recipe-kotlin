package com.godkoo.healthyrecipe.board.application.service

import com.godkoo.healthyrecipe.board.adapter.out.persistence.JpaBoardRepository
import com.godkoo.healthyrecipe.board.application.model.CreateBoardCommand
import com.godkoo.healthyrecipe.board.application.port.`in`.BoardCommandUseCase
import com.godkoo.healthyrecipe.board.domain.BoardID
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(rollbackFor = [Exception::class])
class BoardCommandService(
    private val repository: JpaBoardRepository
) : BoardCommandUseCase {
    override fun save(command: CreateBoardCommand): BoardID {
        val board = repository.save(command.toEntity())
        return BoardID(board.boardId)
    }
}