/**
 * 
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * 
 * Version: 20220523
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// pokemon_form_api

export default {
    Query: {

        // @return String!
        PokemonFormList: ($limit, $offset) => {
            return {
                "limit": "56",
                "offset": "56"
            };
        },

        // @return String!
        PokemonFormRead: ($Id_) => {
            return {
                "Id_": "56"
            };
        },

    },

    Mutation: {

    }
}