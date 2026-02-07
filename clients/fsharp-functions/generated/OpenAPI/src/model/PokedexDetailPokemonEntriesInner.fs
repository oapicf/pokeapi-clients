namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokedexDetailPokemonEntriesInner =

  //#region PokedexDetailPokemonEntriesInner

  [<CLIMutable>]
  type PokedexDetailPokemonEntriesInner = {
    [<JsonProperty(PropertyName = "entry_number")>]
    EntryNumber : int;
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
