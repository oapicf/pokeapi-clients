namespace OpenAPI
open LocationAreaApiHandlerParams
open LocationAreaApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module LocationAreaApiServiceImplementation =

    //#region Service implementation
    type LocationAreaApiServiceImpl() =
      interface ILocationAreaApiService with

        member this.LocationAreaList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaListDefaultStatusCode { content = content }

        member this.LocationAreaRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaReadDefaultStatusCode { content = content }

      //#endregion

    let LocationAreaApiService = LocationAreaApiServiceImpl() :> ILocationAreaApiService