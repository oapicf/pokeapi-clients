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

// NatureApiService is a service that implements the logic for the NatureApiServicer
// This service should implement the business logic for every endpoint for the NatureApi API.
// Include any external packages or services that will be required by this service.
type NatureApiService struct {
}

// NewNatureApiService creates a default api service
func NewNatureApiService() NatureApiServicer {
	return &NatureApiService{}
}

// NatureList - 
func (s *NatureApiService) NatureList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update NatureList with the required logic for this service method.
	// Add api_nature_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("NatureList method not implemented")
}

// NatureRead - 
func (s *NatureApiService) NatureRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update NatureRead with the required logic for this service method.
	// Add api_nature_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("NatureRead method not implemented")
}
