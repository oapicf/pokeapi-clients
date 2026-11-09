package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestEffectDetail._

case class ContestEffectDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The base number of hearts the user of this move gets. */
  appeal: Integer,
/* The base number of hearts the user's opponent loses. */
  jam: Integer,
/* The result of this contest effect listed in different languages. */
  effectEntries: List[ContestEffectEffectText],
/* The flavor text of this contest effect listed in different languages. */
  flavorTextEntries: List[ContestEffectFlavorText])

object ContestEffectDetail {
  import DateTimeCodecs._

  implicit val ContestEffectDetailCodecJson: CodecJson[ContestEffectDetail] = CodecJson.derive[ContestEffectDetail]
  implicit val ContestEffectDetailDecoder: EntityDecoder[ContestEffectDetail] = jsonOf[ContestEffectDetail]
  implicit val ContestEffectDetailEncoder: EntityEncoder[ContestEffectDetail] = jsonEncoderOf[ContestEffectDetail]
}
