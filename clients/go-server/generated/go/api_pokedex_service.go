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

// PokedexAPIService is a service that implements the logic for the PokedexAPIServicer
// This service should implement the business logic for every endpoint for the PokedexAPI API.
// Include any external packages or services that will be required by this service.
type PokedexAPIService struct {
}

// NewPokedexAPIService creates a default api service
func NewPokedexAPIService() PokedexAPIServicer {
	return &PokedexAPIService{}
}

// PokedexList -
func (s *PokedexAPIService) PokedexList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update PokedexList with the required logic for this service method.
	// Add api_pokedex_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokedexList method not implemented")
}

// PokedexRead -
func (s *PokedexAPIService) PokedexRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update PokedexRead with the required logic for this service method.
	// Add api_pokedex_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PokedexRead method not implemented")
}
