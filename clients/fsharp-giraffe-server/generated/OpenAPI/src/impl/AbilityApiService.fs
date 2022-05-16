namespace OpenAPI
open AbilityApiHandlerParams
open AbilityApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AbilityApiServiceImplementation =

    //#region Service implementation
    type AbilityApiServiceImpl() =
      interface IAbilityApiService with

        member this.AbilityList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AbilityListDefaultStatusCode { content = content }

        member this.AbilityRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AbilityReadDefaultStatusCode { content = content }

      //#endregion

    let AbilityApiService = AbilityApiServiceImpl() :> IAbilityApiService