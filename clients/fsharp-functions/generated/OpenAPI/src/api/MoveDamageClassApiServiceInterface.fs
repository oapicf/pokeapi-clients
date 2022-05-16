namespace OpenAPI
open MoveDamageClassApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MoveDamageClassApiServiceInterface =

    //#region Service interface
    type IMoveDamageClassApiService =
      abstract member MoveDamageClassList : unit -> MoveDamageClassListResult
      abstract member MoveDamageClassRead : unit -> MoveDamageClassReadResult
    //#endregion