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
    public partial class PokemonColorApi
    { 
        [FunctionName("PokemonColorApi_PokemonColorList")]
        public async Task<ActionResult<string>> _PokemonColorList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-color/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonColorList");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }

        [FunctionName("PokemonColorApi_PokemonColorRead")]
        public async Task<ActionResult<string>> _PokemonColorRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-color/{id}/")]HttpRequest req, ExecutionContext context, int id)
        {
            var method = this.GetType().GetMethod("PokemonColorRead");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<string>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
