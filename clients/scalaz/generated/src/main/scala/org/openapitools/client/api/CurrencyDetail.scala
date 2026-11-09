package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CurrencyDetail._

case class CurrencyDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[CurrencyName])

object CurrencyDetail {
  import DateTimeCodecs._

  implicit val CurrencyDetailCodecJson: CodecJson[CurrencyDetail] = CodecJson.derive[CurrencyDetail]
  implicit val CurrencyDetailDecoder: EntityDecoder[CurrencyDetail] = jsonOf[CurrencyDetail]
  implicit val CurrencyDetailEncoder: EntityEncoder[CurrencyDetail] = jsonEncoderOf[CurrencyDetail]
}
