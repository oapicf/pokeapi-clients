package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonShapeDetailNamesInner._

case class PokemonShapeDetailNamesInner (
  url: URI,
name: String)

object PokemonShapeDetailNamesInner {
  import DateTimeCodecs._

  implicit val PokemonShapeDetailNamesInnerCodecJson: CodecJson[PokemonShapeDetailNamesInner] = CodecJson.derive[PokemonShapeDetailNamesInner]
  implicit val PokemonShapeDetailNamesInnerDecoder: EntityDecoder[PokemonShapeDetailNamesInner] = jsonOf[PokemonShapeDetailNamesInner]
  implicit val PokemonShapeDetailNamesInnerEncoder: EntityEncoder[PokemonShapeDetailNamesInner] = jsonEncoderOf[PokemonShapeDetailNamesInner]
}
