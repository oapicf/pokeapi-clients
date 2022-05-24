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
    ///  Class for testing PokemonColorApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PokemonColorApiTests : IDisposable
    {
        private PokemonColorApi instance;

        public PokemonColorApiTests()
        {
            instance = new PokemonColorApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PokemonColorApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' PokemonColorApi
            //Assert.IsType<PokemonColorApi>(instance);
        }

        /// <summary>
        /// Test PokemonColorList
        /// </summary>
        [Fact]
        public void PokemonColorListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //var response = instance.PokemonColorList(limit, offset);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test PokemonColorRead
        /// </summary>
        [Fact]
        public void PokemonColorReadTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int id = null;
            //var response = instance.PokemonColorRead(id);
            //Assert.IsType<string>(response);
        }
    }
}
