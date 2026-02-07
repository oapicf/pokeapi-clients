package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestEffectDetail._

case class ContestEffectDetail (
  id: Integer,
appeal: Integer,
jam: Integer,
effectEntries: List[ContestEffectEffectText],
flavorTextEntries: List[ContestEffectFlavorText])

object ContestEffectDetail {
  import DateTimeCodecs._

  implicit val ContestEffectDetailCodecJson: CodecJson[ContestEffectDetail] = CodecJson.derive[ContestEffectDetail]
  implicit val ContestEffectDetailDecoder: EntityDecoder[ContestEffectDetail] = jsonOf[ContestEffectDetail]
  implicit val ContestEffectDetailEncoder: EntityEncoder[ContestEffectDetail] = jsonEncoderOf[ContestEffectDetail]
}
