package com.cardflight.mobilebowling.model

class Frame {
    val frameScore by lazy { isLastFrame } ? (roll1 + roll2) : roll1 + roll2 + roll3;
    val totalScore = 0 // total game score up to this point.
    val totalFrameScore = 0 // frameScore + 1 or 2 next balls.
    var roll1 = 0 // first roll
    var roll2 = 0 // second roll
    var roll3 = 0 // 3rd roll - only applies to 10th frame...
    val isSpare = false
    val isStrike = false
    val isFinished = false
    val isLastFrame = false
}