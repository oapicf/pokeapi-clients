package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CharacteristicDescription
import org.openapitools.models.StatSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param geneUnderscoremodulo 
 * @param possibleUnderscorevalues 
 * @param highestUnderscorestat 
 * @param descriptions 
 */
case class CharacteristicDetail(id: Int,
                geneUnderscoremodulo: Int,
                possibleUnderscorevalues: Seq[Int],
                highestUnderscorestat: StatSummary,
                descriptions: Seq[CharacteristicDescription]
                )

object CharacteristicDetail {
    /**
     * Creates the codec for converting CharacteristicDetail from and to JSON.
     */
    implicit val decoder: Decoder[CharacteristicDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[CharacteristicDetail] = deriveEncoder
}
