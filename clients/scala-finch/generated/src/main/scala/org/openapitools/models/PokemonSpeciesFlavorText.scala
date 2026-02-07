package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary
import org.openapitools.models.VersionSummary

/**
 * 
 * @param flavorUnderscoretext 
 * @param language 
 * @param version 
 */
case class PokemonSpeciesFlavorText(flavorUnderscoretext: String,
                language: LanguageSummary,
                version: VersionSummary
                )

object PokemonSpeciesFlavorText {
    /**
     * Creates the codec for converting PokemonSpeciesFlavorText from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesFlavorText] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesFlavorText] = deriveEncoder
}
