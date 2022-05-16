namespace OpenAPI
open MoveDamageClassApiHandlerParams
open MoveDamageClassApiServiceInterface
open System.Collections.Generic
open System

module MoveDamageClassApiServiceImplementation =

    //#region Service implementation
    type MoveDamageClassApiServiceImpl() =
      interface IMoveDamageClassApiService with

        member this.MoveDamageClassList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassListDefaultStatusCode { content = content }

        member this.MoveDamageClassRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassReadDefaultStatusCode { content = content }

      //#endregion

    let MoveDamageClassApiService = MoveDamageClassApiServiceImpl() :> IMoveDamageClassApiService