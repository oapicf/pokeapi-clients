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

// PokemonColorApiController binds http requests to an api service and writes the service results to the http response
type PokemonColorApiController struct {
	service PokemonColorApiServicer
	errorHandler ErrorHandler
}

// PokemonColorApiOption for how the controller is set up.
type PokemonColorApiOption func(*PokemonColorApiController)

// WithPokemonColorApiErrorHandler inject ErrorHandler into controller
func WithPokemonColorApiErrorHandler(h ErrorHandler) PokemonColorApiOption {
	return func(c *PokemonColorApiController) {
		c.errorHandler = h
	}
}

// NewPokemonColorApiController creates a default api controller
func NewPokemonColorApiController(s PokemonColorApiServicer, opts ...PokemonColorApiOption) Router {
	controller := &PokemonColorApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the PokemonColorApiController
func (c *PokemonColorApiController) Routes() Routes {
	return Routes{ 
		{
			"PokemonColorList",
			strings.ToUpper("Get"),
			"/api/v2/pokemon-color/",
			c.PokemonColorList,
		},
		{
			"PokemonColorRead",
			strings.ToUpper("Get"),
			"/api/v2/pokemon-color/{id}/",
			c.PokemonColorRead,
		},
	}
}

// PokemonColorList - 
func (c *PokemonColorApiController) PokemonColorList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.PokemonColorList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// PokemonColorRead - 
func (c *PokemonColorApiController) PokemonColorRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.PokemonColorRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
