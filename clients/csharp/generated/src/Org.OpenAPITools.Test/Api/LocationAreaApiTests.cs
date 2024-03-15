/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
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
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing LocationAreaApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class LocationAreaApiTests : IDisposable
    {
        private LocationAreaApi instance;

        public LocationAreaApiTests()
        {
            instance = new LocationAreaApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of LocationAreaApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' LocationAreaApi
            //Assert.IsType<LocationAreaApi>(instance);
        }

        /// <summary>
        /// Test LocationAreaList
        /// </summary>
        [Fact]
        public void LocationAreaListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.LocationAreaList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test LocationAreaRead
        /// </summary>
        [Fact]
        public void LocationAreaReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.LocationAreaRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
