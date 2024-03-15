/*
 *
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PokemonSpeciesAPIService is a service that implements the logic for the PokemonSpeciesAPIServicer
// This service should implement the business logic for every endpoint for the PokemonSpeciesAPI API.
// Include any external packages or services that will be required by this service.
type PokemonSpeciesAPIService struct {
}

// NewPokemonSpeciesAPIService creates a default api service
func NewPokemonSpeciesAPIService() PokemonSpeciesAPIServicer {
	return &PokemonSpeciesAPIService{}
}

// PokemonSpeciesList -
func (s *PokemonSpeciesAPIService) PokemonSpeciesList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update PokemonSpeciesList with the required logic for this service method.
	// Add api_pokemon_species_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonSpeciesList method not implemented")
}

// PokemonSpeciesRead -
func (s *PokemonSpeciesAPIService) PokemonSpeciesRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update PokemonSpeciesRead with the required logic for this service method.
	// Add api_pokemon_species_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokemonSpeciesRead method not implemented")
}
