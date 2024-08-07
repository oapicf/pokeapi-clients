// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * 
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PokemonHabitatAPIService is a service that implements the logic for the PokemonHabitatAPIServicer
// This service should implement the business logic for every endpoint for the PokemonHabitatAPI API.
// Include any external packages or services that will be required by this service.
type PokemonHabitatAPIService struct {
}

// NewPokemonHabitatAPIService creates a default api service
func NewPokemonHabitatAPIService() *PokemonHabitatAPIService {
	return &PokemonHabitatAPIService{}
}

// PokemonHabitatList - 
func (s *PokemonHabitatAPIService) PokemonHabitatList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update PokemonHabitatList with the required logic for this service method.
	// Add api_pokemon_habitat_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonHabitatList method not implemented")
}

// PokemonHabitatRead - 
func (s *PokemonHabitatAPIService) PokemonHabitatRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update PokemonHabitatRead with the required logic for this service method.
	// Add api_pokemon_habitat_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonHabitatRead method not implemented")
}
