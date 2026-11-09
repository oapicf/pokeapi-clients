package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatDetail._

case class PokeathlonStatDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A detail of natures which affect this Pokéathlon stat positively or negatively. */
  affectingNatures: PokeathlonStatAffectingNatures,
/* The name of this resource listed in different languages. */
  names: List[PokeathlonStatName])

object PokeathlonStatDetail {
  import DateTimeCodecs._

  implicit val PokeathlonStatDetailCodecJson: CodecJson[PokeathlonStatDetail] = CodecJson.derive[PokeathlonStatDetail]
  implicit val PokeathlonStatDetailDecoder: EntityDecoder[PokeathlonStatDetail] = jsonOf[PokeathlonStatDetail]
  implicit val PokeathlonStatDetailEncoder: EntityEncoder[PokeathlonStatDetail] = jsonEncoderOf[PokeathlonStatDetail]
}
