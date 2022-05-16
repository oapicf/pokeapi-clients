namespace OpenAPI

open System.Collections.Generic
open System

module MachineApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MachineListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type MachineListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MachineListResult = MachineListDefaultStatusCode of MachineListDefaultStatusCodeResponse

    type MachineListArgs = {
      queryParams:Result<MachineListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MachineReadPathParams = {
      id : int ;
    }
    //#endregion


    type MachineReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type MachineReadResult = MachineReadDefaultStatusCode of MachineReadDefaultStatusCodeResponse

    type MachineReadArgs = {
      pathParams:MachineReadPathParams;
    }
