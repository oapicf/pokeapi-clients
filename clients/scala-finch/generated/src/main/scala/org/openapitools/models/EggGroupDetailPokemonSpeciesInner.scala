package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name Pokemon species name.
 * @param url The URL to get more information about the species
 */
case class EggGroupDetailPokemonSpeciesInner(name: Option[String],
                url: Option[URI]
                )

object EggGroupDetailPokemonSpeciesInner {
    /**
     * Creates the codec for converting EggGroupDetailPokemonSpeciesInner from and to JSON.
     */
    implicit val decoder: Decoder[EggGroupDetailPokemonSpeciesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[EggGroupDetailPokemonSpeciesInner] = deriveEncoder
}
