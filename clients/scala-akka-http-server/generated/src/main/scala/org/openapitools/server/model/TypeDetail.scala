package org.openapitools.server.model


/**
 * Serializer for the Type resource
 *
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param damageRelations  for example: ''null''
 * @param pastDamageRelations  for example: ''null''
 * @param gameIndices  for example: ''null''
 * @param generation  for example: ''null''
 * @param moveDamageClass  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemon  for example: ''null''
 * @param moves  for example: ''null''
 * @param sprites  for example: ''null''
*/
final case class TypeDetail (
  id: Int,
  name: String,
  damageRelations: TypeDetailDamageRelations,
  pastDamageRelations: Seq[TypeDetailPastDamageRelationsInner],
  gameIndices: Seq[TypeGameIndex],
  generation: GenerationSummary,
  moveDamageClass: MoveDamageClassSummary,
  names: Seq[AbilityName],
  pokemon: Seq[TypeDetailPokemonInner],
  moves: Seq[MoveSummary],
  sprites: Map[String, Map[String, TypeDetailSpritesValueValue]]
)

