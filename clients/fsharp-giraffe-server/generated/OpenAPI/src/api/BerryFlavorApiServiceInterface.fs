namespace OpenAPI
open BerryFlavorApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BerryFlavorApiServiceInterface =

    //#region Service interface
    type IBerryFlavorApiService =
      abstract member BerryFlavorList:HttpContext -> BerryFlavorListArgs->BerryFlavorListResult
      abstract member BerryFlavorRead:HttpContext -> BerryFlavorReadArgs->BerryFlavorReadResult
    //#endregion