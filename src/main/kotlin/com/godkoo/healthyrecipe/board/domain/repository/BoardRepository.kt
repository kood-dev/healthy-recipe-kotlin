package com.godkoo.healthyrecipe.board.domain.repository

import com.godkoo.healthyrecipe.board.domain.Board

interface BoardRepository {
    fun save(board: Board): Board
}