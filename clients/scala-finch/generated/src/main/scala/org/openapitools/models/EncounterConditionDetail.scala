package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EncounterConditionName
import org.openapitools.models.EncounterConditionValueSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param values 
 * @param names 
 */
case class EncounterConditionDetail(id: Int,
                name: String,
                values: Seq[EncounterConditionValueSummary],
                names: Seq[EncounterConditionName]
                )

object EncounterConditionDetail {
    /**
     * Creates the codec for converting EncounterConditionDetail from and to JSON.
     */
    implicit val decoder: Decoder[EncounterConditionDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterConditionDetail] = deriveEncoder
}
