/**
 * 
 * 
 * 
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * 
 * Version: 20220523
 * Contact: blah@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// move_target_api

export default {
    Query: {

        // @return String!
        MoveTargetList: ($limit, $offset) => {
            return {
                "limit": "56",
                "offset": "56"
            };
        },

        // @return String!
        MoveTargetRead: ($Id_) => {
            return {
                "Id_": "56"
            };
        },

    },

    Mutation: {

    }
}