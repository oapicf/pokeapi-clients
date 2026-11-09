package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHeldItemVersion._

case class PokemonHeldItemVersion (
  /* How often the item is held. */
  rarity: Integer,
/* The version in which the item is held. */
  version: VersionSummary)

object PokemonHeldItemVersion {
  import DateTimeCodecs._

  implicit val PokemonHeldItemVersionCodecJson: CodecJson[PokemonHeldItemVersion] = CodecJson.derive[PokemonHeldItemVersion]
  implicit val PokemonHeldItemVersionDecoder: EntityDecoder[PokemonHeldItemVersion] = jsonOf[PokemonHeldItemVersion]
  implicit val PokemonHeldItemVersionEncoder: EntityEncoder[PokemonHeldItemVersion] = jsonEncoderOf[PokemonHeldItemVersion]
}
