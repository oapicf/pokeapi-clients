package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveBattleStyleName._

case class MoveBattleStyleName (
  name: String,
language: LanguageSummary)

object MoveBattleStyleName {
  import DateTimeCodecs._

  implicit val MoveBattleStyleNameCodecJson: CodecJson[MoveBattleStyleName] = CodecJson.derive[MoveBattleStyleName]
  implicit val MoveBattleStyleNameDecoder: EntityDecoder[MoveBattleStyleName] = jsonOf[MoveBattleStyleName]
  implicit val MoveBattleStyleNameEncoder: EntityEncoder[MoveBattleStyleName] = jsonEncoderOf[MoveBattleStyleName]
}
