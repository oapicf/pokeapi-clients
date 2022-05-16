namespace OpenAPI
open PokemonColorApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonColorApiServiceInterface =

    //#region Service interface
    type IPokemonColorApiService =
      abstract member PokemonColorList:HttpContext -> PokemonColorListArgs->PokemonColorListResult
      abstract member PokemonColorRead:HttpContext -> PokemonColorReadArgs->PokemonColorReadResult
    //#endregion