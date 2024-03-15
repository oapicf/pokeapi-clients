/*
 *
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// EvolutionTriggerAPIController binds http requests to an api service and writes the service results to the http response
type EvolutionTriggerAPIController struct {
	service EvolutionTriggerAPIServicer
	errorHandler ErrorHandler
}

// EvolutionTriggerAPIOption for how the controller is set up.
type EvolutionTriggerAPIOption func(*EvolutionTriggerAPIController)

// WithEvolutionTriggerAPIErrorHandler inject ErrorHandler into controller
func WithEvolutionTriggerAPIErrorHandler(h ErrorHandler) EvolutionTriggerAPIOption {
	return func(c *EvolutionTriggerAPIController) {
		c.errorHandler = h
	}
}

// NewEvolutionTriggerAPIController creates a default api controller
func NewEvolutionTriggerAPIController(s EvolutionTriggerAPIServicer, opts ...EvolutionTriggerAPIOption) Router {
	controller := &EvolutionTriggerAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the EvolutionTriggerAPIController
func (c *EvolutionTriggerAPIController) Routes() Routes {
	return Routes{
		"EvolutionTriggerList": Route{
			strings.ToUpper("Get"),
			"/api/v2/evolution-trigger/",
			c.EvolutionTriggerList,
		},
		"EvolutionTriggerRead": Route{
			strings.ToUpper("Get"),
			"/api/v2/evolution-trigger/{id}/",
			c.EvolutionTriggerRead,
		},
	}
}

// EvolutionTriggerList -
func (c *EvolutionTriggerAPIController) EvolutionTriggerList(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	result, err := c.service.EvolutionTriggerList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EvolutionTriggerRead -
func (c *EvolutionTriggerAPIController) EvolutionTriggerRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int32](
		params["id"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.EvolutionTriggerRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
