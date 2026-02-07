package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ContestEffectList - List contest effects
func (c *Container) ContestEffectList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ContestEffectRetrieve - Get contest effect
func (c *Container) ContestEffectRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ContestTypeList - List contest types
func (c *Container) ContestTypeList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ContestTypeRetrieve - Get contest type
func (c *Container) ContestTypeRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SuperContestEffectList - List super contest effects
func (c *Container) SuperContestEffectList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SuperContestEffectRetrieve - Get super contest effect
func (c *Container) SuperContestEffectRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

