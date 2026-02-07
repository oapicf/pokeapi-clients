namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokedexSummary

module PokemonDexEntry =

  //#region PokemonDexEntry


  type PokemonDexEntry = {
    EntryNumber : int;
    Pokedex : PokedexSummary;
  }
  //#endregion
