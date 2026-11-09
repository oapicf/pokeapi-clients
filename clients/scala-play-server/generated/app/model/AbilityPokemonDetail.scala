package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityPokemonDetail.
  * @param isHidden Whether or not this a hidden ability for the referenced Pokémon.
  * @param slot Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
  * @param pokemon The Pokémon this ability could belong to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilityPokemonDetail(
  isHidden: Option[Boolean],
  slot: Int,
  pokemon: PokemonSummary
)

object AbilityPokemonDetail {
  implicit lazy val abilityPokemonDetailJsonFormat: Format[AbilityPokemonDetail] = Json.format[AbilityPokemonDetail]
}

