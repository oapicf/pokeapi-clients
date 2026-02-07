package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param machine 
 * @param versionUnderscoregroup 
 */
case class ItemDetailMachinesInner(machine: URI,
                versionUnderscoregroup: AbilityDetailPokemonInnerPokemon
                )

object ItemDetailMachinesInner {
    /**
     * Creates the codec for converting ItemDetailMachinesInner from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetailMachinesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetailMachinesInner] = deriveEncoder
}
