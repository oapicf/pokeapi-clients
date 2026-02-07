package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import TypeDetailPokemonInnerPokemon._

case class TypeDetailPokemonInnerPokemon (
  /* The name of the pokemon */
  name: Option[String],
/* The URL to get more information about the pokemon */
  url: Option[URI])

object TypeDetailPokemonInnerPokemon {
  import DateTimeCodecs._

  implicit val TypeDetailPokemonInnerPokemonCodecJson: CodecJson[TypeDetailPokemonInnerPokemon] = CodecJson.derive[TypeDetailPokemonInnerPokemon]
  implicit val TypeDetailPokemonInnerPokemonDecoder: EntityDecoder[TypeDetailPokemonInnerPokemon] = jsonOf[TypeDetailPokemonInnerPokemon]
  implicit val TypeDetailPokemonInnerPokemonEncoder: EntityEncoder[TypeDetailPokemonInnerPokemon] = jsonEncoderOf[TypeDetailPokemonInnerPokemon]
}
