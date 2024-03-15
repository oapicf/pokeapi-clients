package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// MoveBattleStyleList - 
func (c *Container) MoveBattleStyleList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// MoveBattleStyleRead - 
func (c *Container) MoveBattleStyleRead(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

