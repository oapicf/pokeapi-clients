package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param isMainSeries Whether or not this ability originated in the main series of the video games. for example: ''null''
 * @param generation The generation this ability originated in. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param effectEntries The effect of this ability listed in different languages. for example: ''null''
 * @param effectChanges The list of previous effects this ability has had across version groups. for example: ''null''
 * @param flavorTextEntries The flavor text of this ability listed in different languages. for example: ''null''
 * @param pokemon A list of Pokémon that could potentially have this ability. for example: ''null''
*/
final case class AbilityDetail (
  id: Int,
  name: String,
  isMainSeries: Option[Boolean] = None,
  generation: GenerationSummary,
  names: Seq[AbilityName],
  effectEntries: Seq[AbilityEffectText],
  effectChanges: Seq[AbilityChange],
  flavorTextEntries: Seq[AbilityFlavorText],
  pokemon: Seq[AbilityPokemonDetail]
)

