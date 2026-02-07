package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryDetailFlavorsInner
import org.openapitools.models.BerryFirmnessSummary
import org.openapitools.models.ItemSummary
import org.openapitools.models.TypeSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param growthUnderscoretime 
 * @param maxUnderscoreharvest 
 * @param naturalUnderscoregiftUnderscorepower 
 * @param size 
 * @param smoothness 
 * @param soilUnderscoredryness 
 * @param firmness 
 * @param flavors 
 * @param item 
 * @param naturalUnderscoregiftUnderscoretype 
 */
case class BerryDetail(id: Int,
                name: String,
                growthUnderscoretime: Int,
                maxUnderscoreharvest: Int,
                naturalUnderscoregiftUnderscorepower: Int,
                size: Int,
                smoothness: Int,
                soilUnderscoredryness: Int,
                firmness: BerryFirmnessSummary,
                flavors: Seq[BerryDetailFlavorsInner],
                item: ItemSummary,
                naturalUnderscoregiftUnderscoretype: TypeSummary
                )

object BerryDetail {
    /**
     * Creates the codec for converting BerryDetail from and to JSON.
     */
    implicit val decoder: Decoder[BerryDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryDetail] = deriveEncoder
}
