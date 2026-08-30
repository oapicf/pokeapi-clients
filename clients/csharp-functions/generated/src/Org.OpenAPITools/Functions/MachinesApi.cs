using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class MachinesApi
    { 
        [FunctionName("MachinesApi_MachineList")]
        public async Task<ActionResult<PaginatedMachineSummaryList>> _MachineList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/machine/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MachineList");
            return method != null
                ? (await ((Task<PaginatedMachineSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MachinesApi_MachineRetrieve")]
        public async Task<ActionResult<MachineDetail>> _MachineRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/machine/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MachineRetrieve");
            return method != null
                ? (await ((Task<MachineDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
