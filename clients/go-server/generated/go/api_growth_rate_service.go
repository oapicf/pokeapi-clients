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

// GrowthRateApiService is a service that implements the logic for the GrowthRateApiServicer
// This service should implement the business logic for every endpoint for the GrowthRateApi API.
// Include any external packages or services that will be required by this service.
type GrowthRateApiService struct {
}

// NewGrowthRateApiService creates a default api service
func NewGrowthRateApiService() GrowthRateApiServicer {
	return &GrowthRateApiService{}
}

// GrowthRateList - 
func (s *GrowthRateApiService) GrowthRateList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update GrowthRateList with the required logic for this service method.
	// Add api_growth_rate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GrowthRateList method not implemented")
}

// GrowthRateRead - 
func (s *GrowthRateApiService) GrowthRateRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update GrowthRateRead with the required logic for this service method.
	// Add api_growth_rate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GrowthRateRead method not implemented")
}
