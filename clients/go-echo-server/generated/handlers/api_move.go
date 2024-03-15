package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// MoveList - 
func (c *Container) MoveList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// MoveRead - 
func (c *Container) MoveRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

