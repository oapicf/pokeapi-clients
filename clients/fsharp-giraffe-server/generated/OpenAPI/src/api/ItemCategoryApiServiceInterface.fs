namespace OpenAPI
open ItemCategoryApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemCategoryApiServiceInterface =

    //#region Service interface
    type IItemCategoryApiService =
      abstract member ItemCategoryList:HttpContext -> ItemCategoryListArgs->ItemCategoryListResult
      abstract member ItemCategoryRead:HttpContext -> ItemCategoryReadArgs->ItemCategoryReadResult
    //#endregion