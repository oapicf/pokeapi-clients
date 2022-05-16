namespace OpenAPI
open NatureApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module NatureApiServiceInterface =

    //#region Service interface
    type INatureApiService =
      abstract member NatureList : unit -> NatureListResult
      abstract member NatureRead : unit -> NatureReadResult
    //#endregion