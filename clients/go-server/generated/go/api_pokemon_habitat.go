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

// PokemonHabitatApiController binds http requests to an api service and writes the service results to the http response
type PokemonHabitatApiController struct {
	service PokemonHabitatApiServicer
	errorHandler ErrorHandler
}

// PokemonHabitatApiOption for how the controller is set up.
type PokemonHabitatApiOption func(*PokemonHabitatApiController)

// WithPokemonHabitatApiErrorHandler inject ErrorHandler into controller
func WithPokemonHabitatApiErrorHandler(h ErrorHandler) PokemonHabitatApiOption {
	return func(c *PokemonHabitatApiController) {
		c.errorHandler = h
	}
}

// NewPokemonHabitatApiController creates a default api controller
func NewPokemonHabitatApiController(s PokemonHabitatApiServicer, opts ...PokemonHabitatApiOption) Router {
	controller := &PokemonHabitatApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the PokemonHabitatApiController
func (c *PokemonHabitatApiController) Routes() Routes {
	return Routes{ 
		{
			"PokemonHabitatList",
			strings.ToUpper("Get"),
			"/api/v2/pokemon-habitat/",
			c.PokemonHabitatList,
		},
		{
			"PokemonHabitatRead",
			strings.ToUpper("Get"),
			"/api/v2/pokemon-habitat/{id}/",
			c.PokemonHabitatRead,
		},
	}
}

// PokemonHabitatList - 
func (c *PokemonHabitatApiController) PokemonHabitatList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.PokemonHabitatList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// PokemonHabitatRead - 
func (c *PokemonHabitatApiController) PokemonHabitatRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.PokemonHabitatRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}