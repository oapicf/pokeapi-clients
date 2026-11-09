package org.openapitools.server.model


/**
 * Serializer for the Type resource
 *
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param damageRelations A detail of how effective this type is toward others and vice versa. for example: ''null''
 * @param pastDamageRelations A list of details of how effective this type was toward others and vice versa in previous generations for example: ''null''
 * @param gameIndices A list of game indices relevent to this item by generation. for example: ''null''
 * @param generation The generation this type was introduced in. for example: ''null''
 * @param moveDamageClass The class of damage inflicted by this type. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemon A list of details of Pokémon that have this type. for example: ''null''
 * @param moves A list of moves that have this type. for example: ''null''
 * @param sprites Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. for example: ''null''
*/
final case class TypeDetail (
  id: Int,
  name: String,
  damageRelations: TypeRelationships,
  pastDamageRelations: Seq[TypePastRelationships],
  gameIndices: Seq[TypeGameIndex],
  generation: GenerationSummary,
  moveDamageClass: MoveDamageClassSummary,
  names: Seq[TypeName],
  pokemon: Seq[TypePokemon],
  moves: Seq[MoveSummary],
  sprites: Map[String, Map[String, TypeGameSprite]]
)

