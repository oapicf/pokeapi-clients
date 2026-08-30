package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveDetailContestCombosNormal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetailContestCombos(
    val normal: MoveDetailContestCombosNormal,
    val `super`: MoveDetailContestCombosNormal
)
