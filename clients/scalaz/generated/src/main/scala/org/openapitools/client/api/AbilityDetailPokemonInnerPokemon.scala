package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import AbilityDetailPokemonInnerPokemon._

case class AbilityDetailPokemonInnerPokemon (
  name: String,
url: URI)

object AbilityDetailPokemonInnerPokemon {
  import DateTimeCodecs._

  implicit val AbilityDetailPokemonInnerPokemonCodecJson: CodecJson[AbilityDetailPokemonInnerPokemon] = CodecJson.derive[AbilityDetailPokemonInnerPokemon]
  implicit val AbilityDetailPokemonInnerPokemonDecoder: EntityDecoder[AbilityDetailPokemonInnerPokemon] = jsonOf[AbilityDetailPokemonInnerPokemon]
  implicit val AbilityDetailPokemonInnerPokemonEncoder: EntityEncoder[AbilityDetailPokemonInnerPokemon] = jsonEncoderOf[AbilityDetailPokemonInnerPokemon]
}
