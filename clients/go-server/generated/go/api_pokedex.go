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

// PokedexApiController binds http requests to an api service and writes the service results to the http response
type PokedexApiController struct {
	service PokedexApiServicer
	errorHandler ErrorHandler
}

// PokedexApiOption for how the controller is set up.
type PokedexApiOption func(*PokedexApiController)

// WithPokedexApiErrorHandler inject ErrorHandler into controller
func WithPokedexApiErrorHandler(h ErrorHandler) PokedexApiOption {
	return func(c *PokedexApiController) {
		c.errorHandler = h
	}
}

// NewPokedexApiController creates a default api controller
func NewPokedexApiController(s PokedexApiServicer, opts ...PokedexApiOption) Router {
	controller := &PokedexApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the PokedexApiController
func (c *PokedexApiController) Routes() Routes {
	return Routes{ 
		{
			"PokedexList",
			strings.ToUpper("Get"),
			"/api/v2/pokedex/",
			c.PokedexList,
		},
		{
			"PokedexRead",
			strings.ToUpper("Get"),
			"/api/v2/pokedex/{id}/",
			c.PokedexRead,
		},
	}
}

// PokedexList - 
func (c *PokedexApiController) PokedexList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.PokedexList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// PokedexRead - 
func (c *PokedexApiController) PokedexRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.PokedexRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}