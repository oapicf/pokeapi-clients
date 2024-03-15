package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// EggGroupList - 
func (c *Container) EggGroupList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// EggGroupRead - 
func (c *Container) EggGroupRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

