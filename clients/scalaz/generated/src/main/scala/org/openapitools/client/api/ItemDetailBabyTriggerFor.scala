package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemDetailBabyTriggerFor._

case class ItemDetailBabyTriggerFor (
  url: URI)

object ItemDetailBabyTriggerFor {
  import DateTimeCodecs._

  implicit val ItemDetailBabyTriggerForCodecJson: CodecJson[ItemDetailBabyTriggerFor] = CodecJson.derive[ItemDetailBabyTriggerFor]
  implicit val ItemDetailBabyTriggerForDecoder: EntityDecoder[ItemDetailBabyTriggerFor] = jsonOf[ItemDetailBabyTriggerFor]
  implicit val ItemDetailBabyTriggerForEncoder: EntityEncoder[ItemDetailBabyTriggerFor] = jsonEncoderOf[ItemDetailBabyTriggerFor]
}
