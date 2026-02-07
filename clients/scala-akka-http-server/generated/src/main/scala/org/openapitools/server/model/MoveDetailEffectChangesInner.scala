package org.openapitools.server.model


/**
 * @param effectEntries  for example: ''null''
 * @param versionGroup  for example: ''null''
*/
final case class MoveDetailEffectChangesInner (
  effectEntries: Seq[MoveDetailEffectChangesInnerEffectEntriesInner],
  versionGroup: AbilityDetailPokemonInnerPokemon
)

