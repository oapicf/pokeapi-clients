package model

import play.api.libs.json._

/**
  * Serializer for the Type resource
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeDetail(
  id: Int,
  name: String,
  damageRelations: TypeDetailDamageRelations,
  pastDamageRelations: List[TypeDetailPastDamageRelationsInner],
  gameIndices: List[TypeGameIndex],
  generation: GenerationSummary,
  moveDamageClass: MoveDamageClassSummary,
  names: List[AbilityName],
  pokemon: List[TypeDetailPokemonInner],
  moves: List[MoveSummary],
  sprites: Map[String, Map[String, TypeDetailSpritesValueValue]],
)

object TypeDetail {
  implicit lazy val typeDetailJsonFormat: Format[TypeDetail] = Json.format[TypeDetail]
}

