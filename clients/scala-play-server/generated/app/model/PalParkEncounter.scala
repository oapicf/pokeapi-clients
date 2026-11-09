package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PalParkEncounter.
  * @param baseScore The base score given to the player when this Pokémon is caught during a pal park run.
  * @param rate The base rate for encountering this Pokémon in this pal park area.
  * @param pokemonSpecies The Pokémon species being encountered.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PalParkEncounter(
  baseScore: Option[Int],
  rate: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

object PalParkEncounter {
  implicit lazy val palParkEncounterJsonFormat: Format[PalParkEncounter] = Json.format[PalParkEncounter]
}

