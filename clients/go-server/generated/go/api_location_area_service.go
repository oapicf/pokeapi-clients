/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// LocationAreaApiService is a service that implements the logic for the LocationAreaApiServicer
// This service should implement the business logic for every endpoint for the LocationAreaApi API.
// Include any external packages or services that will be required by this service.
type LocationAreaApiService struct {
}

// NewLocationAreaApiService creates a default api service
func NewLocationAreaApiService() LocationAreaApiServicer {
	return &LocationAreaApiService{}
}

// LocationAreaList - 
func (s *LocationAreaApiService) LocationAreaList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update LocationAreaList with the required logic for this service method.
	// Add api_location_area_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LocationAreaList method not implemented")
}

// LocationAreaRead - 
func (s *LocationAreaApiService) LocationAreaRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update LocationAreaRead with the required logic for this service method.
	// Add api_location_area_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LocationAreaRead method not implemented")
}
