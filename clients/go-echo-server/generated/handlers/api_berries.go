package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// BerryFirmnessList - List berry firmness
func (c *Container) BerryFirmnessList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BerryFirmnessRetrieve - Get berry by firmness
func (c *Container) BerryFirmnessRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BerryFlavorList - List berry flavors
func (c *Container) BerryFlavorList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BerryFlavorRetrieve - Get berries by flavor
func (c *Container) BerryFlavorRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BerryList - List berries
func (c *Container) BerryList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// BerryRetrieve - Get a berry
func (c *Container) BerryRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

