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
    public partial class LocationAreaApi
    { 
        [FunctionName("LocationAreaApi_LocationAreaList")]
        public async Task<ActionResult<string>> _LocationAreaList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location-area/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LocationAreaList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("LocationAreaApi_LocationAreaRead")]
        public async Task<ActionResult<string>> _LocationAreaRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/location-area/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("LocationAreaRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
