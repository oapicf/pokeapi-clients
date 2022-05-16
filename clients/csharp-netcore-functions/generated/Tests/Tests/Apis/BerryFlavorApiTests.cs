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
    ///  Class for testing BerryFlavorApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class BerryFlavorApiTests : IDisposable
    {
        private BerryFlavorApi instance;

        public BerryFlavorApiTests()
        {
            instance = new BerryFlavorApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BerryFlavorApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' BerryFlavorApi
            //Assert.IsType<BerryFlavorApi>(instance);
        }

        /// <summary>
        /// Test BerryFlavorList
        /// </summary>
        [Fact]
        public void BerryFlavorListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.BerryFlavorList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test BerryFlavorRead
        /// </summary>
        [Fact]
        public void BerryFlavorReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.BerryFlavorRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
