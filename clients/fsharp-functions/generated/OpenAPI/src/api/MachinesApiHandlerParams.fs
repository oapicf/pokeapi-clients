namespace OpenAPI

open OpenAPI.Model.MachineDetail
open OpenAPI.Model.PaginatedMachineSummaryList
open System.Collections.Generic
open System

module MachinesApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MachineListQueryParams = {
      limit : int option;


      offset : int option;


      q : string option;

    }
    //#endregion


    type MachineListStatusCode200Response = {
      content:PaginatedMachineSummaryList;
      
    }
    type MachineListResult = MachineListStatusCode200 of MachineListStatusCode200Response

    type MachineListArgs = {
      queryParams:Result<MachineListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MachineRetrievePathParams = {
      id : string ;
    }
    //#endregion


    type MachineRetrieveStatusCode200Response = {
      content:MachineDetail;
      
    }
    type MachineRetrieveResult = MachineRetrieveStatusCode200 of MachineRetrieveStatusCode200Response

    type MachineRetrieveArgs = {
      pathParams:MachineRetrievePathParams;
    }
