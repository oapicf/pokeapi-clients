package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveBattleStyleSummary

/**
 * 
 * @param lowUnderscorehpUnderscorepreference 
 * @param highUnderscorehpUnderscorepreference 
 * @param moveUnderscorebattleUnderscorestyle 
 */
case class NatureBattleStylePreference(lowUnderscorehpUnderscorepreference: Int,
                highUnderscorehpUnderscorepreference: Int,
                moveUnderscorebattleUnderscorestyle: MoveBattleStyleSummary
                )

object NatureBattleStylePreference {
    /**
     * Creates the codec for converting NatureBattleStylePreference from and to JSON.
     */
    implicit val decoder: Decoder[NatureBattleStylePreference] = deriveDecoder
    implicit val encoder: ObjectEncoder[NatureBattleStylePreference] = deriveEncoder
}
