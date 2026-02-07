package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatDetailAffectingNatures._

case class PokeathlonStatDetailAffectingNatures (
  decrease: List[PokeathlonStatDetailAffectingNaturesDecreaseInner],
increase: List[PokeathlonStatDetailAffectingNaturesIncreaseInner])

object PokeathlonStatDetailAffectingNatures {
  import DateTimeCodecs._

  implicit val PokeathlonStatDetailAffectingNaturesCodecJson: CodecJson[PokeathlonStatDetailAffectingNatures] = CodecJson.derive[PokeathlonStatDetailAffectingNatures]
  implicit val PokeathlonStatDetailAffectingNaturesDecoder: EntityDecoder[PokeathlonStatDetailAffectingNatures] = jsonOf[PokeathlonStatDetailAffectingNatures]
  implicit val PokeathlonStatDetailAffectingNaturesEncoder: EntityEncoder[PokeathlonStatDetailAffectingNatures] = jsonEncoderOf[PokeathlonStatDetailAffectingNatures]
}
