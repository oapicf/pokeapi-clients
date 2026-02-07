package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EncounterConditionSummary
import org.openapitools.models.EncounterConditionValueName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param condition 
 * @param names 
 */
case class EncounterConditionValueDetail(id: Int,
                name: String,
                condition: EncounterConditionSummary,
                names: Seq[EncounterConditionValueName]
                )

object EncounterConditionValueDetail {
    /**
     * Creates the codec for converting EncounterConditionValueDetail from and to JSON.
     */
    implicit val decoder: Decoder[EncounterConditionValueDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterConditionValueDetail] = deriveEncoder
}
