package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterPokemonDetail.
  * @param minPerfectIvs The minimum number of perfect IVs, or null if unspecified.
  * @param alwaysShiny Whether the encountered Pokémon is always shiny.
  * @param neverShiny Whether the encountered Pokémon can never be shiny.
  * @param isAlpha Whether the encountered Pokémon is an alpha Pokémon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EncounterPokemonDetail(
  minPerfectIvs: Option[Int],
  alwaysShiny: Option[Boolean],
  neverShiny: Option[Boolean],
  isAlpha: Option[Boolean]
)

object EncounterPokemonDetail {
  implicit lazy val encounterPokemonDetailJsonFormat: Format[EncounterPokemonDetail] = Json.format[EncounterPokemonDetail]
}

