package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CharacteristicDetail._

case class CharacteristicDetail (
  id: Integer,
geneModulo: Integer,
possibleValues: List[Integer],
highestStat: StatSummary,
descriptions: List[CharacteristicDescription])

object CharacteristicDetail {
  import DateTimeCodecs._

  implicit val CharacteristicDetailCodecJson: CodecJson[CharacteristicDetail] = CodecJson.derive[CharacteristicDetail]
  implicit val CharacteristicDetailDecoder: EntityDecoder[CharacteristicDetail] = jsonOf[CharacteristicDetail]
  implicit val CharacteristicDetailEncoder: EntityEncoder[CharacteristicDetail] = jsonEncoderOf[CharacteristicDetail]
}
