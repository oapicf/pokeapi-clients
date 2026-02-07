package handlers
import (
	"github.com/oapicf/pokeapi-clients/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ItemAttributeList - List item attributes
func (c *Container) ItemAttributeList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemAttributeRetrieve - Get item attribute
func (c *Container) ItemAttributeRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemCategoryList - List item categories
func (c *Container) ItemCategoryList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemCategoryRetrieve - Get item category
func (c *Container) ItemCategoryRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemFlingEffectList - List item fling effects
func (c *Container) ItemFlingEffectList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemFlingEffectRetrieve - Get item fling effect
func (c *Container) ItemFlingEffectRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemList - List items
func (c *Container) ItemList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemPocketList - List item pockets
func (c *Container) ItemPocketList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemPocketRetrieve - Get item pocket
func (c *Container) ItemPocketRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ItemRetrieve - Get item
func (c *Container) ItemRetrieve(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

