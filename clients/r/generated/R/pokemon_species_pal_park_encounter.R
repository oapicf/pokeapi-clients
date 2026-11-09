#' Create a new PokemonSpeciesPalParkEncounter
#'
#' @description
#' PokemonSpeciesPalParkEncounter Class
#'
#' @docType class
#' @title PokemonSpeciesPalParkEncounter
#' @description PokemonSpeciesPalParkEncounter Class
#' @format An \code{R6Class} generator object
#' @field base_score The base score given to the player when the referenced Pokémon is caught during a pal park run. integer [optional]
#' @field rate The base rate for encountering the referenced Pokémon in this pal park area. integer
#' @field area The pal park area where this encounter happens. \link{PalParkAreaSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesPalParkEncounter <- R6::R6Class(
  "PokemonSpeciesPalParkEncounter",
  public = list(
    `base_score` = NULL,
    `rate` = NULL,
    `area` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesPalParkEncounter class.
    #'
    #' @param rate The base rate for encountering the referenced Pokémon in this pal park area.
    #' @param area The pal park area where this encounter happens.
    #' @param base_score The base score given to the player when the referenced Pokémon is caught during a pal park run.
    #' @param ... Other optional arguments.
    initialize = function(`rate`, `area`, `base_score` = NULL, ...) {
      if (!missing(`rate`)) {
        if (!(is.numeric(`rate`) && length(`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", `rate`))
        }
        self$`rate` <- `rate`
      }
      if (!missing(`area`)) {
        stopifnot(R6::is.R6(`area`))
        self$`area` <- `area`
      }
      if (!is.null(`base_score`)) {
        if (!(is.numeric(`base_score`) && length(`base_score`) == 1)) {
          stop(paste("Error! Invalid data for `base_score`. Must be an integer:", `base_score`))
        }
        self$`base_score` <- `base_score`
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
    #' @return PokemonSpeciesPalParkEncounter as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesPalParkEncounter (x) to a data frame
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
    #' Convert PokemonSpeciesPalParkEncounter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesPalParkEncounterObject <- list()
      if (!is.null(self$`base_score`)) {
        PokemonSpeciesPalParkEncounterObject[["base_score"]] <-
          self$`base_score`
      }
      if (!is.null(self$`rate`)) {
        PokemonSpeciesPalParkEncounterObject[["rate"]] <-
          self$`rate`
      }
      if (!is.null(self$`area`)) {
        PokemonSpeciesPalParkEncounterObject[["area"]] <-
          self$extractSimpleType(self$`area`)
      }
      return(PokemonSpeciesPalParkEncounterObject)
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
    #' Deserialize JSON string into an instance of PokemonSpeciesPalParkEncounter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesPalParkEncounter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`base_score`)) {
        self$`base_score` <- this_object$`base_score`
      }
      if (!is.null(this_object$`rate`)) {
        self$`rate` <- this_object$`rate`
      }
      if (!is.null(this_object$`area`)) {
        `area_object` <- PalParkAreaSummary$new()
        `area_object`$fromJSON(jsonlite::toJSON(this_object$`area`, auto_unbox = TRUE, digits = NA))
        self$`area` <- `area_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpeciesPalParkEncounter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesPalParkEncounter
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesPalParkEncounter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`base_score` <- this_object$`base_score`
      self$`rate` <- this_object$`rate`
      self$`area` <- PalParkAreaSummary$new()$fromJSON(jsonlite::toJSON(this_object$`area`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesPalParkEncounter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rate`
      if (!is.null(input_json$`rate`)) {
        if (!(is.numeric(input_json$`rate`) && length(input_json$`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", input_json$`rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesPalParkEncounter: the required field `rate` is missing."))
      }
      # check the required field `area`
      if (!is.null(input_json$`area`)) {
        stopifnot(R6::is.R6(input_json$`area`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesPalParkEncounter: the required field `area` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesPalParkEncounter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`base_score` > 2147483647) {
        return(FALSE)
      }
      if (self$`base_score` < -2147483648) {
        return(FALSE)
      }

      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        return(FALSE)
      }

      if (self$`rate` > 2147483647) {
        return(FALSE)
      }
      if (self$`rate` < -2147483648) {
        return(FALSE)
      }

      # check if the required `area` is null
      if (is.null(self$`area`)) {
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
      if (self$`base_score` > 2147483647) {
        invalid_fields["base_score"] <- "Invalid value for `base_score`, must be smaller than or equal to 2147483647."
      }
      if (self$`base_score` < -2147483648) {
        invalid_fields["base_score"] <- "Invalid value for `base_score`, must be bigger than or equal to -2147483648."
      }

      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        invalid_fields["rate"] <- "Non-nullable required field `rate` cannot be null."
      }

      if (self$`rate` > 2147483647) {
        invalid_fields["rate"] <- "Invalid value for `rate`, must be smaller than or equal to 2147483647."
      }
      if (self$`rate` < -2147483648) {
        invalid_fields["rate"] <- "Invalid value for `rate`, must be bigger than or equal to -2147483648."
      }

      # check if the required `area` is null
      if (is.null(self$`area`)) {
        invalid_fields["area"] <- "Non-nullable required field `area` cannot be null."
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
# PokemonSpeciesPalParkEncounter$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesPalParkEncounter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesPalParkEncounter$lock()

