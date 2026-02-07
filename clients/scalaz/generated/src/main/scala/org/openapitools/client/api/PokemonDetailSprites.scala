package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI
import java.util.HashMap

import PokemonDetailSprites._

case class PokemonDetailSprites (
  frontDefault: Option[URI])

object PokemonDetailSprites {
  import DateTimeCodecs._

  implicit val PokemonDetailSpritesCodecJson: CodecJson[PokemonDetailSprites] = CodecJson.derive[PokemonDetailSprites]
  implicit val PokemonDetailSpritesDecoder: EntityDecoder[PokemonDetailSprites] = jsonOf[PokemonDetailSprites]
  implicit val PokemonDetailSpritesEncoder: EntityEncoder[PokemonDetailSprites] = jsonEncoderOf[PokemonDetailSprites]
}
