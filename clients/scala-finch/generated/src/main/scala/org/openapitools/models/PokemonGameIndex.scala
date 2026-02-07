package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VersionSummary

/**
 * 
 * @param gameUnderscoreindex 
 * @param version 
 */
case class PokemonGameIndex(gameUnderscoreindex: Int,
                version: VersionSummary
                )

object PokemonGameIndex {
    /**
     * Creates the codec for converting PokemonGameIndex from and to JSON.
     */
    implicit val decoder: Decoder[PokemonGameIndex] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonGameIndex] = deriveEncoder
}
