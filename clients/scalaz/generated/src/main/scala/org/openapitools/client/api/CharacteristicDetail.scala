package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CharacteristicDetail._

case class CharacteristicDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The remainder of the highest stat/IV divided by 5. */
  geneModulo: Integer,
/* The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. */
  possibleValues: List[Integer],
/* The stat which results in this characteristic. */
  highestStat: StatSummary,
/* The descriptions of this characteristic listed in different languages. */
  descriptions: List[CharacteristicDescription])

object CharacteristicDetail {
  import DateTimeCodecs._

  implicit val CharacteristicDetailCodecJson: CodecJson[CharacteristicDetail] = CodecJson.derive[CharacteristicDetail]
  implicit val CharacteristicDetailDecoder: EntityDecoder[CharacteristicDetail] = jsonOf[CharacteristicDetail]
  implicit val CharacteristicDetailEncoder: EntityEncoder[CharacteristicDetail] = jsonEncoderOf[CharacteristicDetail]
}
