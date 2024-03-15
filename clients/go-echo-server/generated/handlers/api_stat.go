package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// StatList - 
func (c *Container) StatList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// StatRead - 
func (c *Container) StatRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

