package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. for example: ''null''
 * @param formOrder The order in which forms should be sorted within a species' forms. for example: ''null''
 * @param isDefault True for exactly one form used as the default for each Pokémon. for example: ''null''
 * @param isBattleOnly Whether or not this form can only happen during battle. for example: ''null''
 * @param isMega Whether or not this form requires mega evolution. for example: ''null''
 * @param formName The name of this form. for example: ''null''
 * @param pokemon The Pokémon that can take on this form. for example: ''null''
 * @param sprites A set of sprites used to depict this Pokémon form in the game. for example: ''null''
 * @param versionGroup The version group this Pokémon form was introduced in. for example: ''null''
 * @param formNames The form specific form name of this Pokémon form, or empty if the form does not have a specific name. for example: ''null''
 * @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name. for example: ''null''
 * @param types A list of details showing types this Pokémon form has. for example: ''null''
 * @param triggerConditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. for example: ''null''
 * @param flavorTextEntries The flavor text of this form listed in different languages and versions. for example: ''null''
*/
final case class PokemonFormDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  formOrder: Option[Int] = None,
  isDefault: Option[Boolean] = None,
  isBattleOnly: Option[Boolean] = None,
  isMega: Option[Boolean] = None,
  formName: String,
  pokemon: PokemonSummary,
  sprites: PokemonFormSprites,
  versionGroup: VersionGroupSummary,
  formNames: Seq[PokemonFormName],
  names: Seq[PokemonFormName],
  types: Seq[PokemonFormType],
  triggerConditions: Seq[PokemonFormTriggerCondition],
  flavorTextEntries: Seq[PokemonFormFlavorText]
)

