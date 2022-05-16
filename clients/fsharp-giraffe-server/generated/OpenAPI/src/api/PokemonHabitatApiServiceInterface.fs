namespace OpenAPI
open PokemonHabitatApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonHabitatApiServiceInterface =

    //#region Service interface
    type IPokemonHabitatApiService =
      abstract member PokemonHabitatList:HttpContext -> PokemonHabitatListArgs->PokemonHabitatListResult
      abstract member PokemonHabitatRead:HttpContext -> PokemonHabitatReadArgs->PokemonHabitatReadResult
    //#endregion