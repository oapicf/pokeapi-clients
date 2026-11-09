package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesPalParkEncounter.
  * @param baseScore The base score given to the player when the referenced Pokémon is caught during a pal park run.
  * @param rate The base rate for encountering the referenced Pokémon in this pal park area.
  * @param area The pal park area where this encounter happens.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesPalParkEncounter(
  baseScore: Option[Int],
  rate: Int,
  area: PalParkAreaSummary
)

object PokemonSpeciesPalParkEncounter {
  implicit lazy val pokemonSpeciesPalParkEncounterJsonFormat: Format[PokemonSpeciesPalParkEncounter] = Json.format[PokemonSpeciesPalParkEncounter]
}

