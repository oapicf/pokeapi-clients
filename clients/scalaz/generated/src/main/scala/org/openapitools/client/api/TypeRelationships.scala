package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeRelationships._

case class TypeRelationships (
  /* A list of types this type has no effect on. */
  noDamageTo: List[TypeSummary],
/* A list of types this type is not very effect against. */
  halfDamageTo: List[TypeSummary],
/* A list of types this type is very effect against. */
  doubleDamageTo: List[TypeSummary],
/* A list of types that have no effect on this type. */
  noDamageFrom: List[TypeSummary],
/* A list of types that are not very effective against this type. */
  halfDamageFrom: List[TypeSummary],
/* A list of types that are very effective against this type. */
  doubleDamageFrom: List[TypeSummary])

object TypeRelationships {
  import DateTimeCodecs._

  implicit val TypeRelationshipsCodecJson: CodecJson[TypeRelationships] = CodecJson.derive[TypeRelationships]
  implicit val TypeRelationshipsDecoder: EntityDecoder[TypeRelationships] = jsonOf[TypeRelationships]
  implicit val TypeRelationshipsEncoder: EntityEncoder[TypeRelationships] = jsonEncoderOf[TypeRelationships]
}
