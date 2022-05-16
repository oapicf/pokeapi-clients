namespace OpenAPI
open MoveCategoryApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveCategoryApiServiceInterface =

    //#region Service interface
    type IMoveCategoryApiService =
      abstract member MoveCategoryList:HttpContext -> MoveCategoryListArgs->MoveCategoryListResult
      abstract member MoveCategoryRead:HttpContext -> MoveCategoryReadArgs->MoveCategoryReadResult
    //#endregion