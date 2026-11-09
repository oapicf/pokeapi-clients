package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormDetail._

case class PokemonFormDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. */
  order: Option[Integer],
/* The order in which forms should be sorted within a species' forms. */
  formOrder: Option[Integer],
/* True for exactly one form used as the default for each Pokémon. */
  isDefault: Option[Boolean],
/* Whether or not this form can only happen during battle. */
  isBattleOnly: Option[Boolean],
/* Whether or not this form requires mega evolution. */
  isMega: Option[Boolean],
/* The name of this form. */
  formName: String,
/* The Pokémon that can take on this form. */
  pokemon: PokemonSummary,
/* A set of sprites used to depict this Pokémon form in the game. */
  sprites: PokemonFormSprites,
/* The version group this Pokémon form was introduced in. */
  versionGroup: VersionGroupSummary,
/* The form specific form name of this Pokémon form, or empty if the form does not have a specific name. */
  formNames: List[PokemonFormName],
/* The form specific full name of this Pokémon form, or empty if the form does not have a specific name. */
  names: List[PokemonFormName],
/* A list of details showing types this Pokémon form has. */
  types: List[PokemonFormType],
/* The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. */
  triggerConditions: List[PokemonFormTriggerCondition],
/* The flavor text of this form listed in different languages and versions. */
  flavorTextEntries: List[PokemonFormFlavorText])

object PokemonFormDetail {
  import DateTimeCodecs._

  implicit val PokemonFormDetailCodecJson: CodecJson[PokemonFormDetail] = CodecJson.derive[PokemonFormDetail]
  implicit val PokemonFormDetailDecoder: EntityDecoder[PokemonFormDetail] = jsonOf[PokemonFormDetail]
  implicit val PokemonFormDetailEncoder: EntityEncoder[PokemonFormDetail] = jsonEncoderOf[PokemonFormDetail]
}
