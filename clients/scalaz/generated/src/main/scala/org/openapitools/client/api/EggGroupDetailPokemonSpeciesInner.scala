package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EggGroupDetailPokemonSpeciesInner._

case class EggGroupDetailPokemonSpeciesInner (
  /* Pokemon species name. */
  name: Option[String],
/* The URL to get more information about the species */
  url: Option[URI])

object EggGroupDetailPokemonSpeciesInner {
  import DateTimeCodecs._

  implicit val EggGroupDetailPokemonSpeciesInnerCodecJson: CodecJson[EggGroupDetailPokemonSpeciesInner] = CodecJson.derive[EggGroupDetailPokemonSpeciesInner]
  implicit val EggGroupDetailPokemonSpeciesInnerDecoder: EntityDecoder[EggGroupDetailPokemonSpeciesInner] = jsonOf[EggGroupDetailPokemonSpeciesInner]
  implicit val EggGroupDetailPokemonSpeciesInnerEncoder: EntityEncoder[EggGroupDetailPokemonSpeciesInner] = jsonEncoderOf[EggGroupDetailPokemonSpeciesInner]
}
