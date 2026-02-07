package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI
import java.util.HashMap

import PokemonFormDetailSprites._

case class PokemonFormDetailSprites (
  default: Option[URI])

object PokemonFormDetailSprites {
  import DateTimeCodecs._

  implicit val PokemonFormDetailSpritesCodecJson: CodecJson[PokemonFormDetailSprites] = CodecJson.derive[PokemonFormDetailSprites]
  implicit val PokemonFormDetailSpritesDecoder: EntityDecoder[PokemonFormDetailSprites] = jsonOf[PokemonFormDetailSprites]
  implicit val PokemonFormDetailSpritesEncoder: EntityEncoder[PokemonFormDetailSprites] = jsonEncoderOf[PokemonFormDetailSprites]
}
