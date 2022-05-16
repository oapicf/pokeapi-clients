namespace OpenAPI
open AbilityApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AbilityApiServiceInterface =

    //#region Service interface
    type IAbilityApiService =
      abstract member AbilityList:HttpContext -> AbilityListArgs->AbilityListResult
      abstract member AbilityRead:HttpContext -> AbilityReadArgs->AbilityReadResult
    //#endregion