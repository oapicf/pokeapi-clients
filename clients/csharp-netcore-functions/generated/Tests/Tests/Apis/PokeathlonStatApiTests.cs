/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
    ///  Class for testing PokeathlonStatApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PokeathlonStatApiTests : IDisposable
    {
        private PokeathlonStatApi instance;

        public PokeathlonStatApiTests()
        {
            instance = new PokeathlonStatApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PokeathlonStatApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' PokeathlonStatApi
            //Assert.IsType<PokeathlonStatApi>(instance);
        }

        /// <summary>
        /// Test PokeathlonStatList
        /// </summary>
        [Fact]
        public void PokeathlonStatListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.PokeathlonStatList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test PokeathlonStatRead
        /// </summary>
        [Fact]
        public void PokeathlonStatReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.PokeathlonStatRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
