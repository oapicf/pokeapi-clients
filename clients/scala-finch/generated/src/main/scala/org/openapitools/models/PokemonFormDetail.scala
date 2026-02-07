package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonDetailTypesInner
import org.openapitools.models.PokemonFormDetailFormNamesInner
import org.openapitools.models.PokemonFormDetailSprites
import org.openapitools.models.PokemonSummary
import org.openapitools.models.VersionGroupSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param order 
 * @param formUnderscoreorder 
 * @param isUnderscoredefault 
 * @param isUnderscorebattleUnderscoreonly 
 * @param isUnderscoremega 
 * @param formUnderscorename 
 * @param pokemon 
 * @param sprites 
 * @param versionUnderscoregroup 
 * @param formUnderscorenames 
 * @param names 
 * @param types 
 */
case class PokemonFormDetail(id: Int,
                name: String,
                order: Option[Int],
                formUnderscoreorder: Option[Int],
                isUnderscoredefault: Option[Boolean],
                isUnderscorebattleUnderscoreonly: Option[Boolean],
                isUnderscoremega: Option[Boolean],
                formUnderscorename: String,
                pokemon: PokemonSummary,
                sprites: PokemonFormDetailSprites,
                versionUnderscoregroup: VersionGroupSummary,
                formUnderscorenames: Seq[PokemonFormDetailFormNamesInner],
                names: Seq[PokemonFormDetailFormNamesInner],
                types: Seq[PokemonDetailTypesInner]
                )

object PokemonFormDetail {
    /**
     * Creates the codec for converting PokemonFormDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonFormDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonFormDetail] = deriveEncoder
}
