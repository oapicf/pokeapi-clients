#' Create a new ItemDetailHeldByPokemonInner
#'
#' @description
#' ItemDetailHeldByPokemonInner Class
#'
#' @docType class
#' @title ItemDetailHeldByPokemonInner
#' @description ItemDetailHeldByPokemonInner Class
#' @format An \code{R6Class} generator object
#' @field pokemon  \link{AbilityDetailPokemonInnerPokemon}
#' @field version-details  list(\link{ItemDetailHeldByPokemonInnerVersionDetailsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemDetailHeldByPokemonInner <- R6::R6Class(
  "ItemDetailHeldByPokemonInner",
  public = list(
    `pokemon` = NULL,
    `version-details` = NULL,

    #' @description
    #' Initialize a new ItemDetailHeldByPokemonInner class.
    #'
    #' @param pokemon pokemon
    #' @param version-details version-details
    #' @param ... Other optional arguments.
    initialize = function(`pokemon`, `version-details`, ...) {
      if (!missing(`pokemon`)) {
        stopifnot(R6::is.R6(`pokemon`))
        self$`pokemon` <- `pokemon`
      }
      if (!missing(`version-details`)) {
        stopifnot(is.vector(`version-details`), length(`version-details`) != 0)
        sapply(`version-details`, function(x) stopifnot(R6::is.R6(x)))
        self$`version-details` <- `version-details`
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
    #' @return ItemDetailHeldByPokemonInner as a base R list.
    #' @examples
    #' # convert array of ItemDetailHeldByPokemonInner (x) to a data frame
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
    #' Convert ItemDetailHeldByPokemonInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemDetailHeldByPokemonInnerObject <- list()
      if (!is.null(self$`pokemon`)) {
        ItemDetailHeldByPokemonInnerObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      if (!is.null(self$`version-details`)) {
        ItemDetailHeldByPokemonInnerObject[["version-details"]] <-
          lapply(self$`version-details`, function(x) x$toSimpleType())
      }
      return(ItemDetailHeldByPokemonInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailHeldByPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailHeldByPokemonInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      if (!is.null(this_object$`version-details`)) {
        self$`version-details` <- ApiClient$new()$deserializeObj(this_object$`version-details`, "array[ItemDetailHeldByPokemonInnerVersionDetailsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemDetailHeldByPokemonInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailHeldByPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailHeldByPokemonInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pokemon` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self$`version-details` <- ApiClient$new()$deserializeObj(this_object$`version-details`, "array[ItemDetailHeldByPokemonInnerVersionDetailsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemDetailHeldByPokemonInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetailHeldByPokemonInner: the required field `pokemon` is missing."))
      }
      # check the required field `version-details`
      if (!is.null(input_json$`version-details`)) {
        stopifnot(is.vector(input_json$`version-details`), length(input_json$`version-details`) != 0)
        tmp <- sapply(input_json$`version-details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetailHeldByPokemonInner: the required field `version-details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemDetailHeldByPokemonInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        return(FALSE)
      }

      # check if the required `version-details` is null
      if (is.null(self$`version-details`)) {
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
      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
      }

      # check if the required `version-details` is null
      if (is.null(self$`version-details`)) {
        invalid_fields["version-details"] <- "Non-nullable required field `version-details` cannot be null."
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
# ItemDetailHeldByPokemonInner$unlock()
#
## Below is an example to define the print function
# ItemDetailHeldByPokemonInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemDetailHeldByPokemonInner$lock()

