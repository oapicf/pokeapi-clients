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
    public partial class EncounterConditionValueApi
    { 
        [FunctionName("EncounterConditionValueApi_EncounterConditionValueList")]
        public async Task<ActionResult<string>> _EncounterConditionValueList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition-value/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EncounterConditionValueList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("EncounterConditionValueApi_EncounterConditionValueRead")]
        public async Task<ActionResult<string>> _EncounterConditionValueRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition-value/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("EncounterConditionValueRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
