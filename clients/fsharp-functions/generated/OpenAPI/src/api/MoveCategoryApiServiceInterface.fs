namespace OpenAPI
open MoveCategoryApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveCategoryApiServiceInterface =

    //#region Service interface
    type IMoveCategoryApiService =
      abstract member MoveCategoryList : unit -> MoveCategoryListResult
      abstract member MoveCategoryRead : unit -> MoveCategoryReadResult
    //#endregion