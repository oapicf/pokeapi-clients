/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// PokemonApiController binds http requests to an api service and writes the service results to the http response
type PokemonApiController struct {
	service PokemonApiServicer
	errorHandler ErrorHandler
}

// PokemonApiOption for how the controller is set up.
type PokemonApiOption func(*PokemonApiController)

// WithPokemonApiErrorHandler inject ErrorHandler into controller
func WithPokemonApiErrorHandler(h ErrorHandler) PokemonApiOption {
	return func(c *PokemonApiController) {
		c.errorHandler = h
	}
}

// NewPokemonApiController creates a default api controller
func NewPokemonApiController(s PokemonApiServicer, opts ...PokemonApiOption) Router {
	controller := &PokemonApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the PokemonApiController
func (c *PokemonApiController) Routes() Routes {
	return Routes{ 
		{
			"PokemonList",
			strings.ToUpper("Get"),
			"/api/v2/api/v2/pokemon/",
			c.PokemonList,
		},
		{
			"PokemonRead",
			strings.ToUpper("Get"),
			"/api/v2/api/v2/pokemon/{id}/",
			c.PokemonRead,
		},
	}
}

// PokemonList - 
func (c *PokemonApiController) PokemonList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.PokemonList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// PokemonRead - 
func (c *PokemonApiController) PokemonRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.PokemonRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
