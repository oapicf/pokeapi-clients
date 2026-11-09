package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonEvolutionKnownMove._

case class PokemonEvolutionKnownMove (
  name: String,
url: URI)

object PokemonEvolutionKnownMove {
  import DateTimeCodecs._

  implicit val PokemonEvolutionKnownMoveCodecJson: CodecJson[PokemonEvolutionKnownMove] = CodecJson.derive[PokemonEvolutionKnownMove]
  implicit val PokemonEvolutionKnownMoveDecoder: EntityDecoder[PokemonEvolutionKnownMove] = jsonOf[PokemonEvolutionKnownMove]
  implicit val PokemonEvolutionKnownMoveEncoder: EntityEncoder[PokemonEvolutionKnownMove] = jsonEncoderOf[PokemonEvolutionKnownMove]
}
