namespace OpenAPI
open BerryApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BerryApiServiceInterface =

    //#region Service interface
    type IBerryApiService =
      abstract member BerryList:HttpContext -> BerryListArgs->BerryListResult
      abstract member BerryRead:HttpContext -> BerryReadArgs->BerryReadResult
    //#endregion