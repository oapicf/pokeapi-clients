namespace OpenAPI
open BerryApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BerryApiServiceInterface =

    //#region Service interface
    type IBerryApiService =
      abstract member BerryList : unit -> BerryListResult
      abstract member BerryRead : unit -> BerryReadResult
    //#endregion