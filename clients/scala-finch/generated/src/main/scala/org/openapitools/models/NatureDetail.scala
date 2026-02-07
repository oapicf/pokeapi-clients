package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryFlavorSummary
import org.openapitools.models.BerrySummary
import org.openapitools.models.NatureBattleStylePreference
import org.openapitools.models.NatureDetailPokeathlonStatChangesInner
import org.openapitools.models.NatureName
import org.openapitools.models.StatSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param decreasedUnderscorestat 
 * @param increasedUnderscorestat 
 * @param likesUnderscoreflavor 
 * @param hatesUnderscoreflavor 
 * @param berries 
 * @param pokeathlonUnderscorestatUnderscorechanges 
 * @param moveUnderscorebattleUnderscorestyleUnderscorepreferences 
 * @param names 
 */
case class NatureDetail(id: Int,
                name: String,
                decreasedUnderscorestat: StatSummary,
                increasedUnderscorestat: StatSummary,
                likesUnderscoreflavor: BerryFlavorSummary,
                hatesUnderscoreflavor: BerryFlavorSummary,
                berries: Seq[BerrySummary],
                pokeathlonUnderscorestatUnderscorechanges: Seq[NatureDetailPokeathlonStatChangesInner],
                moveUnderscorebattleUnderscorestyleUnderscorepreferences: Seq[NatureBattleStylePreference],
                names: Seq[NatureName]
                )

object NatureDetail {
    /**
     * Creates the codec for converting NatureDetail from and to JSON.
     */
    implicit val decoder: Decoder[NatureDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[NatureDetail] = deriveEncoder
}
