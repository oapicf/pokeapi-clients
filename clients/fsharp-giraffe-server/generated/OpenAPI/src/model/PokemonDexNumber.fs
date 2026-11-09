namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonDexNumber =

  //#region PokemonDexNumber


  type PokemonDexNumber = {
    EntryNumber : int;
    PokemonSpecies : PokemonSpeciesSummary;
  }
  //#endregion
