package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// EncounterConditionList - List encounter conditions
func (c *Container) EncounterConditionList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EncounterConditionRetrieve - Get encounter condition
func (c *Container) EncounterConditionRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EncounterConditionValueList - List encounter condition values
func (c *Container) EncounterConditionValueList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EncounterConditionValueRetrieve - Get encounter condition value
func (c *Container) EncounterConditionValueRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EncounterMethodList - List encounter methods
func (c *Container) EncounterMethodList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EncounterMethodRetrieve - Get encounter method
func (c *Container) EncounterMethodRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PokemonEncountersRetrieve - Get pokemon encounter
func (c *Container) PokemonEncountersRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

