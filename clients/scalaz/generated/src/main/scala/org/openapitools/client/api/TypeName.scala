package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeName._

case class TypeName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object TypeName {
  import DateTimeCodecs._

  implicit val TypeNameCodecJson: CodecJson[TypeName] = CodecJson.derive[TypeName]
  implicit val TypeNameDecoder: EntityDecoder[TypeName] = jsonOf[TypeName]
  implicit val TypeNameEncoder: EntityEncoder[TypeName] = jsonEncoderOf[TypeName]
}
