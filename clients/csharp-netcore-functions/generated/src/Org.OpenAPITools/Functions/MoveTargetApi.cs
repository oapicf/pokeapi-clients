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
    public partial class MoveTargetApi
    { 
        [FunctionName("MoveTargetApi_MoveTargetList")]
        public async Task<ActionResult<string>> _MoveTargetList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-target/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveTargetList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("MoveTargetApi_MoveTargetRead")]
        public async Task<ActionResult<string>> _MoveTargetRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-target/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("MoveTargetRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
