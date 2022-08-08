/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// PokeathlonStatApiController binds http requests to an api service and writes the service results to the http response
type PokeathlonStatApiController struct {
	service PokeathlonStatApiServicer
	errorHandler ErrorHandler
}

// PokeathlonStatApiOption for how the controller is set up.
type PokeathlonStatApiOption func(*PokeathlonStatApiController)

// WithPokeathlonStatApiErrorHandler inject ErrorHandler into controller
func WithPokeathlonStatApiErrorHandler(h ErrorHandler) PokeathlonStatApiOption {
	return func(c *PokeathlonStatApiController) {
		c.errorHandler = h
	}
}

// NewPokeathlonStatApiController creates a default api controller
func NewPokeathlonStatApiController(s PokeathlonStatApiServicer, opts ...PokeathlonStatApiOption) Router {
	controller := &PokeathlonStatApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the PokeathlonStatApiController
func (c *PokeathlonStatApiController) Routes() Routes {
	return Routes{ 
		{
			"PokeathlonStatList",
			strings.ToUpper("Get"),
			"/api/v2/pokeathlon-stat/",
			c.PokeathlonStatList,
		},
		{
			"PokeathlonStatRead",
			strings.ToUpper("Get"),
			"/api/v2/pokeathlon-stat/{id}/",
			c.PokeathlonStatRead,
		},
	}
}

// PokeathlonStatList - 
func (c *PokeathlonStatApiController) PokeathlonStatList(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	limitParam, err := parseInt32Parameter(query.Get("limit"), false)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	offsetParam, err := parseInt32Parameter(query.Get("offset"), false)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.PokeathlonStatList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// PokeathlonStatRead - 
func (c *PokeathlonStatApiController) PokeathlonStatRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.PokeathlonStatRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}