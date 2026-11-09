package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatAffectingNature._

case class PokeathlonStatAffectingNature (
  /* The maximum amount of change to the referenced Pokéathlon stat. */
  maxChange: Integer,
/* The nature causing the change. */
  nature: NatureSummary)

object PokeathlonStatAffectingNature {
  import DateTimeCodecs._

  implicit val PokeathlonStatAffectingNatureCodecJson: CodecJson[PokeathlonStatAffectingNature] = CodecJson.derive[PokeathlonStatAffectingNature]
  implicit val PokeathlonStatAffectingNatureDecoder: EntityDecoder[PokeathlonStatAffectingNature] = jsonOf[PokeathlonStatAffectingNature]
  implicit val PokeathlonStatAffectingNatureEncoder: EntityEncoder[PokeathlonStatAffectingNature] = jsonEncoderOf[PokeathlonStatAffectingNature]
}
