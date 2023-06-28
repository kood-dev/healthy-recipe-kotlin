package com.godkoo.healthyrecipe.board.adapter.out.persistence

import com.godkoo.healthyrecipe.board.domain.Board
import com.godkoo.healthyrecipe.board.domain.repository.BoardRepository
import org.springframework.data.jpa.repository.JpaRepository

interface JpaBoardRepository : JpaRepository<Board, Long>, BoardRepository {
}