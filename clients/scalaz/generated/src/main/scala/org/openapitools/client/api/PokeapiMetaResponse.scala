package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeapiMetaResponse._

case class PokeapiMetaResponse (
  /* The deployment time as a Unix timestamp string. */
  deployDate: String,
/* The source commit hash used for this deployment. */
  hash: String,
/* The deployment tag, or null if the deployment has no tag. */
  tag: String)

object PokeapiMetaResponse {
  import DateTimeCodecs._

  implicit val PokeapiMetaResponseCodecJson: CodecJson[PokeapiMetaResponse] = CodecJson.derive[PokeapiMetaResponse]
  implicit val PokeapiMetaResponseDecoder: EntityDecoder[PokeapiMetaResponse] = jsonOf[PokeapiMetaResponse]
  implicit val PokeapiMetaResponseEncoder: EntityEncoder[PokeapiMetaResponse] = jsonEncoderOf[PokeapiMetaResponse]
}
