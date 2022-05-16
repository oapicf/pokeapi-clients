namespace OpenAPI
open GenderApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GenderApiServiceInterface =

    //#region Service interface
    type IGenderApiService =
      abstract member GenderList:HttpContext -> GenderListArgs->GenderListResult
      abstract member GenderRead:HttpContext -> GenderReadArgs->GenderReadResult
    //#endregion