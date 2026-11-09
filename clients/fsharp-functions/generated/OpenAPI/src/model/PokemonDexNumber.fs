namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonDexNumber =

  //#region PokemonDexNumber

  [<CLIMutable>]
  type PokemonDexNumber = {
    [<JsonProperty(PropertyName = "entry_number")>]
    EntryNumber : int;
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary;
  }

  //#endregion
