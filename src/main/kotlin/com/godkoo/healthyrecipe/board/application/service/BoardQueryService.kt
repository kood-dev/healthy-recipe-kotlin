package com.godkoo.healthyrecipe.board.application.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class BoardQueryService {
}