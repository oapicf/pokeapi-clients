package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EncounterMethodName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param order 
 * @param names 
 */
case class EncounterMethodDetail(id: Int,
                name: String,
                order: Option[Int],
                names: Seq[EncounterMethodName]
                )

object EncounterMethodDetail {
    /**
     * Creates the codec for converting EncounterMethodDetail from and to JSON.
     */
    implicit val decoder: Decoder[EncounterMethodDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterMethodDetail] = deriveEncoder
}
