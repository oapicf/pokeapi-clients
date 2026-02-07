namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenderDetailPokemonSpeciesDetailsInner

module GenderDetail =

  //#region GenderDetail


  type GenderDetail = {
    Id : int;
    Name : string;
    PokemonSpeciesDetails : GenderDetailPokemonSpeciesDetailsInner[];
    RequiredForEvolution : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
