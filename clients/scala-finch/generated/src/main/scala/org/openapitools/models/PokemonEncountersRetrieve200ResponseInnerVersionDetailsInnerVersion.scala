package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name 
 * @param url 
 */
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion(name: String,
                url: URI
                )

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion {
    /**
     * Creates the codec for converting PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion from and to JSON.
     */
    implicit val decoder: Decoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion] = deriveEncoder
}
