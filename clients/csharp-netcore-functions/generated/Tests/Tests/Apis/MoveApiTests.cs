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
    ///  Class for testing MoveApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MoveApiTests : IDisposable
    {
        private MoveApi instance;

        public MoveApiTests()
        {
            instance = new MoveApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MoveApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' MoveApi
            //Assert.IsType<MoveApi>(instance);
        }

        /// <summary>
        /// Test MoveList
        /// </summary>
        [Fact]
        public void MoveListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.MoveList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test MoveRead
        /// </summary>
        [Fact]
        public void MoveReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.MoveRead(id);
            //Assert.IsType<string>(response);
        }
    }
}