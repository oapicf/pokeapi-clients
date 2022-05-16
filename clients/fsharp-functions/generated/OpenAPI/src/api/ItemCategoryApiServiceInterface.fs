namespace OpenAPI
open ItemCategoryApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemCategoryApiServiceInterface =

    //#region Service interface
    type IItemCategoryApiService =
      abstract member ItemCategoryList : unit -> ItemCategoryListResult
      abstract member ItemCategoryRead : unit -> ItemCategoryReadResult
    //#endregion