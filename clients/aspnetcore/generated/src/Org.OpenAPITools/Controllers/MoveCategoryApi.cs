/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class MoveCategoryApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        /// <response code="0">Default response</response>
        [HttpGet]
        [Route("/api/v2/move-category/")]
        [ValidateModelState]
        [SwaggerOperation("MoveCategoryList")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Default response")]
        public virtual IActionResult MoveCategoryList([FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset)
        {

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id"></param>
        /// <response code="0">Default response</response>
        [HttpGet]
        [Route("/api/v2/move-category/{id}/")]
        [ValidateModelState]
        [SwaggerOperation("MoveCategoryRead")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Default response")]
        public virtual IActionResult MoveCategoryRead([FromRoute (Name = "id")][Required]int id)
        {

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
