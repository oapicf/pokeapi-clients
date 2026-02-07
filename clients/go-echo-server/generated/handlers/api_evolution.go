package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// EvolutionChainList - List evolution chains
func (c *Container) EvolutionChainList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EvolutionChainRetrieve - Get evolution chain
func (c *Container) EvolutionChainRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EvolutionTriggerList - List evolution triggers
func (c *Container) EvolutionTriggerList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EvolutionTriggerRetrieve - Get evolution trigger
func (c *Container) EvolutionTriggerRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

