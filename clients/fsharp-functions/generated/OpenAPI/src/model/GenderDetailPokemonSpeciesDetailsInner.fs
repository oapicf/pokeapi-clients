namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module GenderDetailPokemonSpeciesDetailsInner =

  //#region GenderDetailPokemonSpeciesDetailsInner

  [<CLIMutable>]
  type GenderDetailPokemonSpeciesDetailsInner = {
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
