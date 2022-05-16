namespace OpenAPI
open RegionApiHandlerParams
open RegionApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module RegionApiServiceImplementation =

    //#region Service implementation
    type RegionApiServiceImpl() =
      interface IRegionApiService with

        member this.RegionList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionListDefaultStatusCode { content = content }

        member this.RegionRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionReadDefaultStatusCode { content = content }

      //#endregion

    let RegionApiService = RegionApiServiceImpl() :> IRegionApiService