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
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ItemCategoryApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ItemCategoryApiTests : IDisposable
    {
        private ItemCategoryApi instance;

        public ItemCategoryApiTests()
        {
            instance = new ItemCategoryApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ItemCategoryApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ItemCategoryApi
            //Assert.IsType<ItemCategoryApi>(instance);
        }

        /// <summary>
        /// Test ItemCategoryList
        /// </summary>
        [Fact]
        public void ItemCategoryListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.ItemCategoryList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test ItemCategoryRead
        /// </summary>
        [Fact]
        public void ItemCategoryReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.ItemCategoryRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
