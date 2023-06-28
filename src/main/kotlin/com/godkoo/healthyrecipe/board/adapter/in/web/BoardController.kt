package com.godkoo.healthyrecipe.board.adapter.`in`.web

import com.godkoo.healthyrecipe.board.adapter.`in`.web.model.CreateBoardRequest
import com.godkoo.healthyrecipe.board.application.service.BoardCommandService
import com.godkoo.healthyrecipe.board.domain.BoardID
import com.godkoo.healthyrecipe.common.model.CommonResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class BoardController(
    val useCase: BoardCommandService
) {

    @PostMapping("/v1/boards")
    fun createBoard(@RequestBody request: CreateBoardRequest): CommonResponse<BoardID> {
        return CommonResponse.created(useCase.save(request.convertTo()))
    }
}