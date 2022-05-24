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
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing MoveLearnMethodApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MoveLearnMethodApiTests : IDisposable
    {
        private MoveLearnMethodApi instance;

        public MoveLearnMethodApiTests()
        {
            instance = new MoveLearnMethodApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MoveLearnMethodApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' MoveLearnMethodApi
            //Assert.IsType<MoveLearnMethodApi>(instance);
        }

        /// <summary>
        /// Test MoveLearnMethodList
        /// </summary>
        [Fact]
        public void MoveLearnMethodListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.MoveLearnMethodList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test MoveLearnMethodRead
        /// </summary>
        [Fact]
        public void MoveLearnMethodReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.MoveLearnMethodRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
