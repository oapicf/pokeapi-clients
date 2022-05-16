namespace OpenAPI
open NatureApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module NatureApiServiceInterface =

    //#region Service interface
    type INatureApiService =
      abstract member NatureList:HttpContext -> NatureListArgs->NatureListResult
      abstract member NatureRead:HttpContext -> NatureReadArgs->NatureReadResult
    //#endregion