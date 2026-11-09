package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param isMainSeries Whether or not this ability originated in the main series of the video games.
  * @param generation The generation this ability originated in.
  * @param names The name of this resource listed in different languages.
  * @param effectEntries The effect of this ability listed in different languages.
  * @param effectChanges The list of previous effects this ability has had across version groups.
  * @param flavorTextEntries The flavor text of this ability listed in different languages.
  * @param pokemon A list of Pokémon that could potentially have this ability.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilityDetail(
  id: Int,
  name: String,
  isMainSeries: Option[Boolean],
  generation: GenerationSummary,
  names: List[AbilityName],
  effectEntries: List[AbilityEffectText],
  effectChanges: List[AbilityChange],
  flavorTextEntries: List[AbilityFlavorText],
  pokemon: List[AbilityPokemonDetail]
)

object AbilityDetail {
  implicit lazy val abilityDetailJsonFormat: Format[AbilityDetail] = Json.format[AbilityDetail]
}

