namespace OpenAPI
open PokeathlonStatApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokeathlonStatApiServiceInterface =

    //#region Service interface
    type IPokeathlonStatApiService =
      abstract member PokeathlonStatList : unit -> PokeathlonStatListResult
      abstract member PokeathlonStatRead : unit -> PokeathlonStatReadResult
    //#endregion