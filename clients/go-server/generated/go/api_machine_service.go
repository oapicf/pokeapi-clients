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

// MachineApiService is a service that implements the logic for the MachineApiServicer
// This service should implement the business logic for every endpoint for the MachineApi API.
// Include any external packages or services that will be required by this service.
type MachineApiService struct {
}

// NewMachineApiService creates a default api service
func NewMachineApiService() MachineApiServicer {
	return &MachineApiService{}
}

// MachineList - 
func (s *MachineApiService) MachineList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update MachineList with the required logic for this service method.
	// Add api_machine_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MachineList method not implemented")
}

// MachineRead - 
func (s *MachineApiService) MachineRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update MachineRead with the required logic for this service method.
	// Add api_machine_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MachineRead method not implemented")
}
