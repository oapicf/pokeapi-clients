namespace OpenAPI
open PokemonColorApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonColorApiServiceInterface =

    //#region Service interface
    type IPokemonColorApiService =
      abstract member PokemonColorList : unit -> PokemonColorListResult
      abstract member PokemonColorRead : unit -> PokemonColorReadResult
    //#endregion