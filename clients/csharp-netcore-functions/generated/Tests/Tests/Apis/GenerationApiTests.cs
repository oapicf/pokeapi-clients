/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Apis;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing GenerationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class GenerationApiTests : IDisposable
    {
        private GenerationApi instance;

        public GenerationApiTests()
        {
            instance = new GenerationApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of GenerationApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' GenerationApi
            //Assert.IsType<GenerationApi>(instance);
        }

        /// <summary>
        /// Test GenerationList
        /// </summary>
        [Fact]
        public void GenerationListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.GenerationList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test GenerationRead
        /// </summary>
        [Fact]
        public void GenerationReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.GenerationRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
