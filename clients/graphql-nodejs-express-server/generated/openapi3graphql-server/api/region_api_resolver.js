/**
 * 
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * 
 * Version: 1.0.0
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// region_api

export default {
    Query: {

        // @return String!
        RegionList: ($limit, $offset) => {
            return {
                "limit": "56",
                "offset": "56"
            };
        },

        // @return String!
        RegionRead: ($Id_) => {
            return {
                "Id_": "56"
            };
        },

    },

    Mutation: {

    }
}