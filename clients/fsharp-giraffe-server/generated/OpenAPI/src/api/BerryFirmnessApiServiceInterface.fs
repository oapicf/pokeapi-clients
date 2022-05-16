namespace OpenAPI
open BerryFirmnessApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BerryFirmnessApiServiceInterface =

    //#region Service interface
    type IBerryFirmnessApiService =
      abstract member BerryFirmnessList:HttpContext -> BerryFirmnessListArgs->BerryFirmnessListResult
      abstract member BerryFirmnessRead:HttpContext -> BerryFirmnessReadArgs->BerryFirmnessReadResult
    //#endregion