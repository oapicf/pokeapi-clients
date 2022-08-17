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
    public partial class CharacteristicApi
    { 
        [FunctionName("CharacteristicApi_CharacteristicList")]
        public async Task<ActionResult<string>> _CharacteristicList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/characteristic/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CharacteristicList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("CharacteristicApi_CharacteristicRead")]
        public async Task<ActionResult<string>> _CharacteristicRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/characteristic/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("CharacteristicRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
