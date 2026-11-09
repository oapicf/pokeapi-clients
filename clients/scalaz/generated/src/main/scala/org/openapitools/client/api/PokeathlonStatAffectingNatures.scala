package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatAffectingNatures._

case class PokeathlonStatAffectingNatures (
  /* A list of natures and how they change the referenced Pokéathlon stat. */
  increase: List[PokeathlonStatAffectingNature],
/* A list of natures and how they change the referenced Pokéathlon stat. */
  decrease: List[PokeathlonStatAffectingNature])

object PokeathlonStatAffectingNatures {
  import DateTimeCodecs._

  implicit val PokeathlonStatAffectingNaturesCodecJson: CodecJson[PokeathlonStatAffectingNatures] = CodecJson.derive[PokeathlonStatAffectingNatures]
  implicit val PokeathlonStatAffectingNaturesDecoder: EntityDecoder[PokeathlonStatAffectingNatures] = jsonOf[PokeathlonStatAffectingNatures]
  implicit val PokeathlonStatAffectingNaturesEncoder: EntityEncoder[PokeathlonStatAffectingNatures] = jsonEncoderOf[PokeathlonStatAffectingNatures]
}
