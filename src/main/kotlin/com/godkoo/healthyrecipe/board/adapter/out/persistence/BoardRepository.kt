package com.godkoo.healthyrecipe.board.adapter.out.persistence

import com.godkoo.healthyrecipe.board.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long> {
}