namespace OpenAPI
open PokemonSpeciesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonSpeciesApiServiceInterface =

    //#region Service interface
    type IPokemonSpeciesApiService =
      abstract member PokemonSpeciesList:HttpContext -> PokemonSpeciesListArgs->PokemonSpeciesListResult
      abstract member PokemonSpeciesRead:HttpContext -> PokemonSpeciesReadArgs->PokemonSpeciesReadResult
    //#endregion