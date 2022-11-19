/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
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
    ///  Class for testing MoveCategoryApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MoveCategoryApiTests : IDisposable
    {
        private MoveCategoryApi instance;

        public MoveCategoryApiTests()
        {
            instance = new MoveCategoryApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MoveCategoryApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' MoveCategoryApi
            //Assert.IsType<MoveCategoryApi>(instance);
        }

        /// <summary>
        /// Test MoveCategoryList
        /// </summary>
        [Fact]
        public void MoveCategoryListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.MoveCategoryList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test MoveCategoryRead
        /// </summary>
        [Fact]
        public void MoveCategoryReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.MoveCategoryRead(id);
            //Assert.IsType<string>(response);
        }
    }
}