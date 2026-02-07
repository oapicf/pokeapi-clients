package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonEncountersRetrieve200ResponseInnerLocationArea._

case class PokemonEncountersRetrieve200ResponseInnerLocationArea (
  name: String,
url: URI)

object PokemonEncountersRetrieve200ResponseInnerLocationArea {
  import DateTimeCodecs._

  implicit val PokemonEncountersRetrieve200ResponseInnerLocationAreaCodecJson: CodecJson[PokemonEncountersRetrieve200ResponseInnerLocationArea] = CodecJson.derive[PokemonEncountersRetrieve200ResponseInnerLocationArea]
  implicit val PokemonEncountersRetrieve200ResponseInnerLocationAreaDecoder: EntityDecoder[PokemonEncountersRetrieve200ResponseInnerLocationArea] = jsonOf[PokemonEncountersRetrieve200ResponseInnerLocationArea]
  implicit val PokemonEncountersRetrieve200ResponseInnerLocationAreaEncoder: EntityEncoder[PokemonEncountersRetrieve200ResponseInnerLocationArea] = jsonEncoderOf[PokemonEncountersRetrieve200ResponseInnerLocationArea]
}
