namespace OpenAPI
open GenerationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GenerationApiServiceInterface =

    //#region Service interface
    type IGenerationApiService =
      abstract member GenerationList:HttpContext -> GenerationListArgs->GenerationListResult
      abstract member GenerationRead:HttpContext -> GenerationReadArgs->GenerationReadResult
    //#endregion