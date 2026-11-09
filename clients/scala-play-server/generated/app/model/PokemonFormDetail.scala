package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonFormDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
  * @param formOrder The order in which forms should be sorted within a species' forms.
  * @param isDefault True for exactly one form used as the default for each Pokémon.
  * @param isBattleOnly Whether or not this form can only happen during battle.
  * @param isMega Whether or not this form requires mega evolution.
  * @param formName The name of this form.
  * @param pokemon The Pokémon that can take on this form.
  * @param sprites A set of sprites used to depict this Pokémon form in the game.
  * @param versionGroup The version group this Pokémon form was introduced in.
  * @param formNames The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
  * @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
  * @param types A list of details showing types this Pokémon form has.
  * @param triggerConditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
  * @param flavorTextEntries The flavor text of this form listed in different languages and versions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonFormDetail(
  id: Int,
  name: String,
  order: Option[Int],
  formOrder: Option[Int],
  isDefault: Option[Boolean],
  isBattleOnly: Option[Boolean],
  isMega: Option[Boolean],
  formName: String,
  pokemon: PokemonSummary,
  sprites: PokemonFormSprites,
  versionGroup: VersionGroupSummary,
  formNames: List[PokemonFormName],
  names: List[PokemonFormName],
  types: List[PokemonFormType],
  triggerConditions: List[PokemonFormTriggerCondition],
  flavorTextEntries: List[PokemonFormFlavorText]
)

object PokemonFormDetail {
  implicit lazy val pokemonFormDetailJsonFormat: Format[PokemonFormDetail] = Json.format[PokemonFormDetail]
}

