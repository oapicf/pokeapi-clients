package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormDetailFormNamesInner._

case class PokemonFormDetailFormNamesInner (
  language: AbilityDetailPokemonInnerPokemon,
name: String)

object PokemonFormDetailFormNamesInner {
  import DateTimeCodecs._

  implicit val PokemonFormDetailFormNamesInnerCodecJson: CodecJson[PokemonFormDetailFormNamesInner] = CodecJson.derive[PokemonFormDetailFormNamesInner]
  implicit val PokemonFormDetailFormNamesInnerDecoder: EntityDecoder[PokemonFormDetailFormNamesInner] = jsonOf[PokemonFormDetailFormNamesInner]
  implicit val PokemonFormDetailFormNamesInnerEncoder: EntityEncoder[PokemonFormDetailFormNamesInner] = jsonEncoderOf[PokemonFormDetailFormNamesInner]
}
