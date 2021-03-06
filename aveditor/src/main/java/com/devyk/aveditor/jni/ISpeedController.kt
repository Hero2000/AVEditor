package com.devyk.aveditor.jni

import com.devyk.aveditor.entity.Speed

interface ISpeedController {

    public fun initSpeedController(
        track: Int,
        channels: Int,
        samplingRate: Int,
        tempo: Double,
        pitchSemi: Double
    )


    public fun changeSpeed(track: Int, input: ByteArray, out: ShortArray, length: Int):Int

    public fun close(track: Int)

    public fun setRecordSpeed(track: Int, speed: Speed=Speed.NORMAL)
}
