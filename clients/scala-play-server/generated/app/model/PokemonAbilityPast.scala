package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonAbilityPast.
  * @param isHidden Whether or not this is a hidden ability.
  * @param slot The slot this ability occupies in this Pokémon species.
  * @param ability The ability the Pokémon may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonAbilityPast(
  isHidden: Option[Boolean],
  slot: Int,
  ability: AbilitySummary
)

object PokemonAbilityPast {
  implicit lazy val pokemonAbilityPastJsonFormat: Format[PokemonAbilityPast] = Json.format[PokemonAbilityPast]
}

