namespace OpenAPI
open GenderApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GenderApiServiceInterface =

    //#region Service interface
    type IGenderApiService =
      abstract member GenderList : unit -> GenderListResult
      abstract member GenderRead : unit -> GenderReadResult
    //#endregion