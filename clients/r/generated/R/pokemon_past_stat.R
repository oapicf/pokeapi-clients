#' Create a new PokemonPastStat
#'
#' @description
#' PokemonPastStat Class
#'
#' @docType class
#' @title PokemonPastStat
#' @description PokemonPastStat Class
#' @format An \code{R6Class} generator object
#' @field generation The last generation in which the referenced pokémon had the listed stats. \link{GenerationSummary}
#' @field stats The stat the Pokémon had up to and including the listed generation. list(\link{PokemonStat})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonPastStat <- R6::R6Class(
  "PokemonPastStat",
  public = list(
    `generation` = NULL,
    `stats` = NULL,

    #' @description
    #' Initialize a new PokemonPastStat class.
    #'
    #' @param generation The last generation in which the referenced pokémon had the listed stats.
    #' @param stats The stat the Pokémon had up to and including the listed generation.
    #' @param ... Other optional arguments.
    initialize = function(`generation`, `stats`, ...) {
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`stats`)) {
        stopifnot(is.vector(`stats`), length(`stats`) != 0)
        sapply(`stats`, function(x) stopifnot(R6::is.R6(x)))
        self$`stats` <- `stats`
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
    #' @return PokemonPastStat as a base R list.
    #' @examples
    #' # convert array of PokemonPastStat (x) to a data frame
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
    #' Convert PokemonPastStat to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonPastStatObject <- list()
      if (!is.null(self$`generation`)) {
        PokemonPastStatObject[["generation"]] <-
          self$extractSimpleType(self$`generation`)
      }
      if (!is.null(self$`stats`)) {
        PokemonPastStatObject[["stats"]] <-
          self$extractSimpleType(self$`stats`)
      }
      return(PokemonPastStatObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonPastStat
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonPastStat
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`stats`)) {
        self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonPastStat in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonPastStat
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonPastStat
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonPastStat and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonPastStat: the required field `generation` is missing."))
      }
      # check the required field `stats`
      if (!is.null(input_json$`stats`)) {
        stopifnot(is.vector(input_json$`stats`), length(input_json$`stats`) != 0)
        tmp <- sapply(input_json$`stats`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonPastStat: the required field `stats` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonPastStat
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `stats` is null
      if (is.null(self$`stats`)) {
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
      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `stats` is null
      if (is.null(self$`stats`)) {
        invalid_fields["stats"] <- "Non-nullable required field `stats` cannot be null."
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
# PokemonPastStat$unlock()
#
## Below is an example to define the print function
# PokemonPastStat$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonPastStat$lock()

