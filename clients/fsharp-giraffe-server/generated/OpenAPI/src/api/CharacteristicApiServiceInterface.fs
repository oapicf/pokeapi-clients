namespace OpenAPI
open CharacteristicApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CharacteristicApiServiceInterface =

    //#region Service interface
    type ICharacteristicApiService =
      abstract member CharacteristicList:HttpContext -> CharacteristicListArgs->CharacteristicListResult
      abstract member CharacteristicRead:HttpContext -> CharacteristicReadArgs->CharacteristicReadResult
    //#endregion