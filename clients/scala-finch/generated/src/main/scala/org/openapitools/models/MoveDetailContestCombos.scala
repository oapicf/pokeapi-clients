package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveDetailContestCombosNormal

/**
 * 
 * @param normal 
 * @param _super 
 */
case class MoveDetailContestCombos(normal: MoveDetailContestCombosNormal,
                _super: MoveDetailContestCombosNormal
                )

object MoveDetailContestCombos {
    /**
     * Creates the codec for converting MoveDetailContestCombos from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailContestCombos] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailContestCombos] = deriveEncoder
}
