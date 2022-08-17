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
    public partial class ItemAttributeApi
    { 
        [FunctionName("ItemAttributeApi_ItemAttributeList")]
        public async Task<ActionResult<string>> _ItemAttributeList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-attribute/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemAttributeList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("ItemAttributeApi_ItemAttributeRead")]
        public async Task<ActionResult<string>> _ItemAttributeRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/item-attribute/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("ItemAttributeRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
