package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.MoveDetailMachinesInnerMachine

/**
 * 
 * @param machine 
 * @param versionUnderscoregroup 
 */
case class MoveDetailMachinesInner(machine: MoveDetailMachinesInnerMachine,
                versionUnderscoregroup: AbilityDetailPokemonInnerPokemon
                )

object MoveDetailMachinesInner {
    /**
     * Creates the codec for converting MoveDetailMachinesInner from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailMachinesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailMachinesInner] = deriveEncoder
}
