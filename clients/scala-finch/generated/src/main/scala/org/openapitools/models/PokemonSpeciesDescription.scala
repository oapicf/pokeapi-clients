package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param description 
 * @param language 
 */
case class PokemonSpeciesDescription(description: Option[String],
                language: LanguageSummary
                )

object PokemonSpeciesDescription {
    /**
     * Creates the codec for converting PokemonSpeciesDescription from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesDescription] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesDescription] = deriveEncoder
}
