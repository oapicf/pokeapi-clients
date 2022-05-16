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

// PokemonShapeApiService is a service that implements the logic for the PokemonShapeApiServicer
// This service should implement the business logic for every endpoint for the PokemonShapeApi API.
// Include any external packages or services that will be required by this service.
type PokemonShapeApiService struct {
}

// NewPokemonShapeApiService creates a default api service
func NewPokemonShapeApiService() PokemonShapeApiServicer {
	return &PokemonShapeApiService{}
}

// PokemonShapeList - 
func (s *PokemonShapeApiService) PokemonShapeList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update PokemonShapeList with the required logic for this service method.
	// Add api_pokemon_shape_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonShapeList method not implemented")
}

// PokemonShapeRead - 
func (s *PokemonShapeApiService) PokemonShapeRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update PokemonShapeRead with the required logic for this service method.
	// Add api_pokemon_shape_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonShapeRead method not implemented")
}
