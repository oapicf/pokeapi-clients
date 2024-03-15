package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// RegionList - 
func (c *Container) RegionList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RegionRead - 
func (c *Container) RegionRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

