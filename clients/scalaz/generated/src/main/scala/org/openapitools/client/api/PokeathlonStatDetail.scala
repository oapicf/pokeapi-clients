package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatDetail._

case class PokeathlonStatDetail (
  id: Integer,
name: String,
affectingNatures: PokeathlonStatDetailAffectingNatures,
names: List[PokeathlonStatName])

object PokeathlonStatDetail {
  import DateTimeCodecs._

  implicit val PokeathlonStatDetailCodecJson: CodecJson[PokeathlonStatDetail] = CodecJson.derive[PokeathlonStatDetail]
  implicit val PokeathlonStatDetailDecoder: EntityDecoder[PokeathlonStatDetail] = jsonOf[PokeathlonStatDetail]
  implicit val PokeathlonStatDetailEncoder: EntityEncoder[PokeathlonStatDetail] = jsonEncoderOf[PokeathlonStatDetail]
}
