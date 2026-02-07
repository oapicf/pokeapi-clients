#' Create a new PokemonDetailHeldItems
#'
#' @description
#' PokemonDetailHeldItems Class
#'
#' @docType class
#' @title PokemonDetailHeldItems
#' @description PokemonDetailHeldItems Class
#' @format An \code{R6Class} generator object
#' @field item  \link{AbilityDetailPokemonInnerPokemon}
#' @field version_details  list(\link{ItemDetailHeldByPokemonInnerVersionDetailsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailHeldItems <- R6::R6Class(
  "PokemonDetailHeldItems",
  public = list(
    `item` = NULL,
    `version_details` = NULL,

    #' @description
    #' Initialize a new PokemonDetailHeldItems class.
    #'
    #' @param item item
    #' @param version_details version_details
    #' @param ... Other optional arguments.
    initialize = function(`item`, `version_details`, ...) {
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!missing(`version_details`)) {
        stopifnot(is.vector(`version_details`), length(`version_details`) != 0)
        sapply(`version_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_details` <- `version_details`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return PokemonDetailHeldItems as a base R list.
    #' @examples
    #' # convert array of PokemonDetailHeldItems (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert PokemonDetailHeldItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailHeldItemsObject <- list()
      if (!is.null(self$`item`)) {
        PokemonDetailHeldItemsObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      if (!is.null(self$`version_details`)) {
        PokemonDetailHeldItemsObject[["version_details"]] <-
          lapply(self$`version_details`, function(x) x$toSimpleType())
      }
      return(PokemonDetailHeldItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailHeldItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailHeldItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item`)) {
        `item_object` <- AbilityDetailPokemonInnerPokemon$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      if (!is.null(this_object$`version_details`)) {
        self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[ItemDetailHeldByPokemonInnerVersionDetailsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailHeldItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailHeldItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailHeldItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[ItemDetailHeldByPokemonInnerVersionDetailsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailHeldItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailHeldItems: the required field `item` is missing."))
      }
      # check the required field `version_details`
      if (!is.null(input_json$`version_details`)) {
        stopifnot(is.vector(input_json$`version_details`), length(input_json$`version_details`) != 0)
        tmp <- sapply(input_json$`version_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailHeldItems: the required field `version_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailHeldItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `item` is null
      if (is.null(self$`item`)) {
        return(FALSE)
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
        invalid_fields["version_details"] <- "Non-nullable required field `version_details` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# PokemonDetailHeldItems$unlock()
#
## Below is an example to define the print function
# PokemonDetailHeldItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailHeldItems$lock()

