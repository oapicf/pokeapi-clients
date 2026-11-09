namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenderPokemonSpecies
open OpenAPI.Model.PokemonSpeciesSummary

module GenderDetail =

  //#region GenderDetail


  type GenderDetail = {
    Id : int;
    Name : string;
    PokemonSpeciesDetails : GenderPokemonSpecies[];
    RequiredForEvolution : PokemonSpeciesSummary[];
  }
  //#endregion
