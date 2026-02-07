package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveMetaAilmentSummary
import org.openapitools.models.MoveMetaCategorySummary

/**
 * 
 * @param ailment 
 * @param category 
 * @param minUnderscorehits 
 * @param maxUnderscorehits 
 * @param minUnderscoreturns 
 * @param maxUnderscoreturns 
 * @param drain 
 * @param healing 
 * @param critUnderscorerate 
 * @param ailmentUnderscorechance 
 * @param flinchUnderscorechance 
 * @param statUnderscorechance 
 */
case class MoveMeta(ailment: MoveMetaAilmentSummary,
                category: MoveMetaCategorySummary,
                minUnderscorehits: Option[Int],
                maxUnderscorehits: Option[Int],
                minUnderscoreturns: Option[Int],
                maxUnderscoreturns: Option[Int],
                drain: Option[Int],
                healing: Option[Int],
                critUnderscorerate: Option[Int],
                ailmentUnderscorechance: Option[Int],
                flinchUnderscorechance: Option[Int],
                statUnderscorechance: Option[Int]
                )

object MoveMeta {
    /**
     * Creates the codec for converting MoveMeta from and to JSON.
     */
    implicit val decoder: Decoder[MoveMeta] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveMeta] = deriveEncoder
}
