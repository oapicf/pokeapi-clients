namespace OpenAPI
open GenerationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GenerationApiServiceInterface =

    //#region Service interface
    type IGenerationApiService =
      abstract member GenerationList : unit -> GenerationListResult
      abstract member GenerationRead : unit -> GenerationReadResult
    //#endregion