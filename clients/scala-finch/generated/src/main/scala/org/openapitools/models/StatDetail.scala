package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CharacteristicSummary
import org.openapitools.models.MoveDamageClassSummary
import org.openapitools.models.StatDetailAffectingMoves
import org.openapitools.models.StatDetailAffectingNatures
import org.openapitools.models.StatName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param gameUnderscoreindex 
 * @param isUnderscorebattleUnderscoreonly 
 * @param affectingUnderscoremoves 
 * @param affectingUnderscorenatures 
 * @param characteristics 
 * @param moveUnderscoredamageUnderscoreclass 
 * @param names 
 */
case class StatDetail(id: Int,
                name: String,
                gameUnderscoreindex: Int,
                isUnderscorebattleUnderscoreonly: Option[Boolean],
                affectingUnderscoremoves: StatDetailAffectingMoves,
                affectingUnderscorenatures: StatDetailAffectingNatures,
                characteristics: Seq[CharacteristicSummary],
                moveUnderscoredamageUnderscoreclass: MoveDamageClassSummary,
                names: Seq[StatName]
                )

object StatDetail {
    /**
     * Creates the codec for converting StatDetail from and to JSON.
     */
    implicit val decoder: Decoder[StatDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[StatDetail] = deriveEncoder
}
