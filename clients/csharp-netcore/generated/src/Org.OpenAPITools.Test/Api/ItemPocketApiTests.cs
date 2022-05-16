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
    ///  Class for testing ItemPocketApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ItemPocketApiTests : IDisposable
    {
        private ItemPocketApi instance;

        public ItemPocketApiTests()
        {
            instance = new ItemPocketApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ItemPocketApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ItemPocketApi
            //Assert.IsType<ItemPocketApi>(instance);
        }

        /// <summary>
        /// Test ItemPocketList
        /// </summary>
        [Fact]
        public void ItemPocketListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.ItemPocketList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test ItemPocketRead
        /// </summary>
        [Fact]
        public void ItemPocketReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.ItemPocketRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
