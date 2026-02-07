package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param cost  for example: ''null''
 * @param flingPower  for example: ''null''
 * @param flingEffect  for example: ''null''
 * @param attributes  for example: ''null''
 * @param category  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
 * @param gameIndices  for example: ''null''
 * @param names  for example: ''null''
 * @param heldByPokemon  for example: ''null''
 * @param sprites  for example: ''null''
 * @param babyTriggerFor  for example: ''null''
 * @param machines  for example: ''null''
*/
final case class ItemDetail (
  id: Int,
  name: String,
  cost: Option[Int] = None,
  flingPower: Option[Int] = None,
  flingEffect: ItemFlingEffectSummary,
  attributes: Seq[AbilityDetailPokemonInnerPokemon],
  category: ItemCategorySummary,
  effectEntries: Seq[ItemEffectText],
  flavorTextEntries: Seq[ItemFlavorText],
  gameIndices: Seq[ItemGameIndex],
  names: Seq[ItemName],
  heldByPokemon: Seq[ItemDetailHeldByPokemonInner],
  sprites: ItemDetailSprites,
  babyTriggerFor: ItemDetailBabyTriggerFor,
  machines: Seq[ItemDetailMachinesInner]
)

