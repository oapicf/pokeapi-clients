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
    ///  Class for testing PokemonHabitatApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PokemonHabitatApiTests
    {
        private PokemonHabitatApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PokemonHabitatApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PokemonHabitatApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' PokemonHabitatApi
            //Assert.IsInstanceOf(typeof(PokemonHabitatApi), instance);
        }

        
        /// <summary>
        /// Test PokemonHabitatList
        /// </summary>
        [Test]
        public void PokemonHabitatListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.PokemonHabitatList(limit, offset);
            //Assert.IsInstanceOf(typeof(string), response, "response is string");
        }
        
        /// <summary>
        /// Test PokemonHabitatRead
        /// </summary>
        [Test]
        public void PokemonHabitatReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.PokemonHabitatRead(id);
            //Assert.IsInstanceOf(typeof(string), response, "response is string");
        }
        
    }

}
