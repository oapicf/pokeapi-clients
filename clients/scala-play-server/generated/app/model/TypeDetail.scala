package model

import play.api.libs.json._

/**
  * Serializer for the Type resource
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

