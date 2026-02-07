package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param isMainSeries  for example: ''null''
 * @param generation  for example: ''null''
 * @param names  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param effectChanges  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
 * @param pokemon  for example: ''null''
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
  pokemon: Seq[AbilityDetailPokemonInner]
)

