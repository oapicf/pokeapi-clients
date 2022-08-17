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
    public partial class EvolutionTriggerApi
    { 
        [FunctionName("EvolutionTriggerApi_EvolutionTriggerList")]
        public async Task<ActionResult<string>> _EvolutionTriggerList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-trigger/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EvolutionTriggerList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("EvolutionTriggerApi_EvolutionTriggerRead")]
        public async Task<ActionResult<string>> _EvolutionTriggerRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-trigger/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("EvolutionTriggerRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
