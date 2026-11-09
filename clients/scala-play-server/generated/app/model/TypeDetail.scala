package model

import play.api.libs.json._

/**
  * Serializer for the Type resource
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param damageRelations A detail of how effective this type is toward others and vice versa.
  * @param pastDamageRelations A list of details of how effective this type was toward others and vice versa in previous generations
  * @param gameIndices A list of game indices relevent to this item by generation.
  * @param generation The generation this type was introduced in.
  * @param moveDamageClass The class of damage inflicted by this type.
  * @param names The name of this resource listed in different languages.
  * @param pokemon A list of details of Pokémon that have this type.
  * @param moves A list of moves that have this type.
  * @param sprites Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeDetail(
  id: Int,
  name: String,
  damageRelations: TypeRelationships,
  pastDamageRelations: List[TypePastRelationships],
  gameIndices: List[TypeGameIndex],
  generation: GenerationSummary,
  moveDamageClass: MoveDamageClassSummary,
  names: List[TypeName],
  pokemon: List[TypePokemon],
  moves: List[MoveSummary],
  sprites: Map[String, Map[String, TypeGameSprite]],
)

object TypeDetail {
  implicit lazy val typeDetailJsonFormat: Format[TypeDetail] = Json.format[TypeDetail]
}

