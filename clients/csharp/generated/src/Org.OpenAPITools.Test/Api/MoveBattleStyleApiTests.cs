/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing MoveBattleStyleApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MoveBattleStyleApiTests
    {
        private MoveBattleStyleApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new MoveBattleStyleApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MoveBattleStyleApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' MoveBattleStyleApi
            //Assert.IsInstanceOf(typeof(MoveBattleStyleApi), instance);
        }

        
        /// <summary>
        /// Test MoveBattleStyleList
        /// </summary>
        [Test]
        public void MoveBattleStyleListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.MoveBattleStyleList(limit, offset);
            //Assert.IsInstanceOf(typeof(string), response, "response is string");
        }
        
        /// <summary>
        /// Test MoveBattleStyleRead
        /// </summary>
        [Test]
        public void MoveBattleStyleReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.MoveBattleStyleRead(id);
            //Assert.IsInstanceOf(typeof(string), response, "response is string");
        }
        
    }

}
