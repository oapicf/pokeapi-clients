namespace OpenAPI
open BerryFlavorApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BerryFlavorApiServiceInterface =

    //#region Service interface
    type IBerryFlavorApiService =
      abstract member BerryFlavorList : unit -> BerryFlavorListResult
      abstract member BerryFlavorRead : unit -> BerryFlavorReadResult
    //#endregion