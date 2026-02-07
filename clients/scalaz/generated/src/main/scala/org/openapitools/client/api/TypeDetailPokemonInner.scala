package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeDetailPokemonInner._

case class TypeDetailPokemonInner (
  slot: Option[Integer],
pokemon: Option[TypeDetailPokemonInnerPokemon])

object TypeDetailPokemonInner {
  import DateTimeCodecs._

  implicit val TypeDetailPokemonInnerCodecJson: CodecJson[TypeDetailPokemonInner] = CodecJson.derive[TypeDetailPokemonInner]
  implicit val TypeDetailPokemonInnerDecoder: EntityDecoder[TypeDetailPokemonInner] = jsonOf[TypeDetailPokemonInner]
  implicit val TypeDetailPokemonInnerEncoder: EntityEncoder[TypeDetailPokemonInner] = jsonEncoderOf[TypeDetailPokemonInner]
}
