package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonPastAbility.
  * @param abilities The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
  * @param generation The last generation in which the referenced pokémon had the listed abilities.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonPastAbility(
  abilities: List[PokemonAbilityPast],
  generation: GenerationSummary
)

object PokemonPastAbility {
  implicit lazy val pokemonPastAbilityJsonFormat: Format[PokemonPastAbility] = Json.format[PokemonPastAbility]
}

