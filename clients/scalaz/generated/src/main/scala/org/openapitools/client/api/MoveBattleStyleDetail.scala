package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveBattleStyleDetail._

case class MoveBattleStyleDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[MoveBattleStyleName])

object MoveBattleStyleDetail {
  import DateTimeCodecs._

  implicit val MoveBattleStyleDetailCodecJson: CodecJson[MoveBattleStyleDetail] = CodecJson.derive[MoveBattleStyleDetail]
  implicit val MoveBattleStyleDetailDecoder: EntityDecoder[MoveBattleStyleDetail] = jsonOf[MoveBattleStyleDetail]
  implicit val MoveBattleStyleDetailEncoder: EntityEncoder[MoveBattleStyleDetail] = jsonEncoderOf[MoveBattleStyleDetail]
}
