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

// GrowthRateAPIService is a service that implements the logic for the GrowthRateAPIServicer
// This service should implement the business logic for every endpoint for the GrowthRateAPI API.
// Include any external packages or services that will be required by this service.
type GrowthRateAPIService struct {
}

// NewGrowthRateAPIService creates a default api service
func NewGrowthRateAPIService() *GrowthRateAPIService {
	return &GrowthRateAPIService{}
}

// GrowthRateList - 
func (s *GrowthRateAPIService) GrowthRateList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update GrowthRateList with the required logic for this service method.
	// Add api_growth_rate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GrowthRateList method not implemented")
}

// GrowthRateRead - 
func (s *GrowthRateAPIService) GrowthRateRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update GrowthRateRead with the required logic for this service method.
	// Add api_growth_rate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GrowthRateRead method not implemented")
}
