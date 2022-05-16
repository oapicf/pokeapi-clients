/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PokemonApiService is a service that implements the logic for the PokemonApiServicer
// This service should implement the business logic for every endpoint for the PokemonApi API.
// Include any external packages or services that will be required by this service.
type PokemonApiService struct {
}

// NewPokemonApiService creates a default api service
func NewPokemonApiService() PokemonApiServicer {
	return &PokemonApiService{}
}

// PokemonList - 
func (s *PokemonApiService) PokemonList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update PokemonList with the required logic for this service method.
	// Add api_pokemon_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonList method not implemented")
}

// PokemonRead - 
func (s *PokemonApiService) PokemonRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update PokemonRead with the required logic for this service method.
	// Add api_pokemon_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonRead method not implemented")
}
