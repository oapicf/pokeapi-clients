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

// VersionGroupAPIController binds http requests to an api service and writes the service results to the http response
type VersionGroupAPIController struct {
	service VersionGroupAPIServicer
	errorHandler ErrorHandler
}

// VersionGroupAPIOption for how the controller is set up.
type VersionGroupAPIOption func(*VersionGroupAPIController)

// WithVersionGroupAPIErrorHandler inject ErrorHandler into controller
func WithVersionGroupAPIErrorHandler(h ErrorHandler) VersionGroupAPIOption {
	return func(c *VersionGroupAPIController) {
		c.errorHandler = h
	}
}

// NewVersionGroupAPIController creates a default api controller
func NewVersionGroupAPIController(s VersionGroupAPIServicer, opts ...VersionGroupAPIOption) Router {
	controller := &VersionGroupAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the VersionGroupAPIController
func (c *VersionGroupAPIController) Routes() Routes {
	return Routes{
		"VersionGroupList": Route{
			strings.ToUpper("Get"),
			"/api/v2/version-group/",
			c.VersionGroupList,
		},
		"VersionGroupRead": Route{
			strings.ToUpper("Get"),
			"/api/v2/version-group/{id}/",
			c.VersionGroupRead,
		},
	}
}

// VersionGroupList -
func (c *VersionGroupAPIController) VersionGroupList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.VersionGroupList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// VersionGroupRead -
func (c *VersionGroupAPIController) VersionGroupRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int32](
		params["id"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.VersionGroupRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
