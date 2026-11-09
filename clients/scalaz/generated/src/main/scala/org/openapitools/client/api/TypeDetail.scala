package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetail._

case class TypeDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A detail of how effective this type is toward others and vice versa. */
  damageRelations: TypeRelationships,
/* A list of details of how effective this type was toward others and vice versa in previous generations */
  pastDamageRelations: List[TypePastRelationships],
/* A list of game indices relevent to this item by generation. */
  gameIndices: List[TypeGameIndex],
/* The generation this type was introduced in. */
  generation: GenerationSummary,
/* The class of damage inflicted by this type. */
  moveDamageClass: MoveDamageClassSummary,
/* The name of this resource listed in different languages. */
  names: List[TypeName],
/* A list of details of Pokémon that have this type. */
  pokemon: List[TypePokemon],
/* A list of moves that have this type. */
  moves: List[MoveSummary],
/* Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. */
  sprites: Map[String, Map[String, TypeGameSprite]])

object TypeDetail {
  import DateTimeCodecs._

  implicit val TypeDetailCodecJson: CodecJson[TypeDetail] = CodecJson.derive[TypeDetail]
  implicit val TypeDetailDecoder: EntityDecoder[TypeDetail] = jsonOf[TypeDetail]
  implicit val TypeDetailEncoder: EntityEncoder[TypeDetail] = jsonEncoderOf[TypeDetail]
}
