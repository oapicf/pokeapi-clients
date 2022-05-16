namespace OpenAPI
open PokeathlonStatApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokeathlonStatApiServiceInterface =

    //#region Service interface
    type IPokeathlonStatApiService =
      abstract member PokeathlonStatList:HttpContext -> PokeathlonStatListArgs->PokeathlonStatListResult
      abstract member PokeathlonStatRead:HttpContext -> PokeathlonStatReadArgs->PokeathlonStatReadResult
    //#endregion