namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokedexSummary

module PokemonDexEntry =

  //#region PokemonDexEntry

  [<CLIMutable>]
  type PokemonDexEntry = {
    [<JsonProperty(PropertyName = "entry_number")>]
    EntryNumber : int;
    [<JsonProperty(PropertyName = "pokedex")>]
    Pokedex : PokedexSummary;
  }

  //#endregion
