namespace OpenAPI
open BerryFirmnessApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BerryFirmnessApiServiceInterface =

    //#region Service interface
    type IBerryFirmnessApiService =
      abstract member BerryFirmnessList : unit -> BerryFirmnessListResult
      abstract member BerryFirmnessRead : unit -> BerryFirmnessReadResult
    //#endregion