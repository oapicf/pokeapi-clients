package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonDetailCries._

case class PokemonDetailCries (
  latest: URI,
legacy: URI)

object PokemonDetailCries {
  import DateTimeCodecs._

  implicit val PokemonDetailCriesCodecJson: CodecJson[PokemonDetailCries] = CodecJson.derive[PokemonDetailCries]
  implicit val PokemonDetailCriesDecoder: EntityDecoder[PokemonDetailCries] = jsonOf[PokemonDetailCries]
  implicit val PokemonDetailCriesEncoder: EntityEncoder[PokemonDetailCries] = jsonEncoderOf[PokemonDetailCries]
}
