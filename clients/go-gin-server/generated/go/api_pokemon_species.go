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
	"github.com/gin-gonic/gin"
)

type PokemonSpeciesAPI struct {
}

// Get /api/v2/pokemon-species/
func (api *PokemonSpeciesAPI) PokemonSpeciesList(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/pokemon-species/:id/
func (api *PokemonSpeciesAPI) PokemonSpeciesRead(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

