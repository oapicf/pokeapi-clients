#' Create a new EvolutionChainDetailChainEvolvesToInner
#'
#' @description
#' EvolutionChainDetailChainEvolvesToInner Class
#'
#' @docType class
#' @title EvolutionChainDetailChainEvolvesToInner
#' @description EvolutionChainDetailChainEvolvesToInner Class
#' @format An \code{R6Class} generator object
#' @field evolution_details  list(\link{EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner})
#' @field is_baby  character
#' @field species  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionChainDetailChainEvolvesToInner <- R6::R6Class(
  "EvolutionChainDetailChainEvolvesToInner",
  public = list(
    `evolution_details` = NULL,
    `is_baby` = NULL,
    `species` = NULL,

    #' @description
    #' Initialize a new EvolutionChainDetailChainEvolvesToInner class.
    #'
    #' @param evolution_details evolution_details
    #' @param is_baby is_baby
    #' @param species species
    #' @param ... Other optional arguments.
    initialize = function(`evolution_details`, `is_baby`, `species`, ...) {
      if (!missing(`evolution_details`)) {
        stopifnot(is.vector(`evolution_details`), length(`evolution_details`) != 0)
        sapply(`evolution_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`evolution_details` <- `evolution_details`
      }
      if (!missing(`is_baby`)) {
        if (!(is.logical(`is_baby`) && length(`is_baby`) == 1)) {
          stop(paste("Error! Invalid data for `is_baby`. Must be a boolean:", `is_baby`))
        }
        self$`is_baby` <- `is_baby`
      }
      if (!missing(`species`)) {
        stopifnot(R6::is.R6(`species`))
        self$`species` <- `species`
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
    #' @return EvolutionChainDetailChainEvolvesToInner as a base R list.
    #' @examples
    #' # convert array of EvolutionChainDetailChainEvolvesToInner (x) to a data frame
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
    #' Convert EvolutionChainDetailChainEvolvesToInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionChainDetailChainEvolvesToInnerObject <- list()
      if (!is.null(self$`evolution_details`)) {
        EvolutionChainDetailChainEvolvesToInnerObject[["evolution_details"]] <-
          lapply(self$`evolution_details`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`is_baby`)) {
        EvolutionChainDetailChainEvolvesToInnerObject[["is_baby"]] <-
          self$`is_baby`
      }
      if (!is.null(self$`species`)) {
        EvolutionChainDetailChainEvolvesToInnerObject[["species"]] <-
          self$`species`$toSimpleType()
      }
      return(EvolutionChainDetailChainEvolvesToInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChainEvolvesToInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChainEvolvesToInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`evolution_details`)) {
        self$`evolution_details` <- ApiClient$new()$deserializeObj(this_object$`evolution_details`, "array[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`is_baby`)) {
        self$`is_baby` <- this_object$`is_baby`
      }
      if (!is.null(this_object$`species`)) {
        `species_object` <- AbilityDetailPokemonInnerPokemon$new()
        `species_object`$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
        self$`species` <- `species_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EvolutionChainDetailChainEvolvesToInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChainEvolvesToInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChainEvolvesToInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`evolution_details` <- ApiClient$new()$deserializeObj(this_object$`evolution_details`, "array[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]", loadNamespace("openapi"))
      self$`is_baby` <- this_object$`is_baby`
      self$`species` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionChainDetailChainEvolvesToInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `evolution_details`
      if (!is.null(input_json$`evolution_details`)) {
        stopifnot(is.vector(input_json$`evolution_details`), length(input_json$`evolution_details`) != 0)
        tmp <- sapply(input_json$`evolution_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInner: the required field `evolution_details` is missing."))
      }
      # check the required field `is_baby`
      if (!is.null(input_json$`is_baby`)) {
        if (!(is.logical(input_json$`is_baby`) && length(input_json$`is_baby`) == 1)) {
          stop(paste("Error! Invalid data for `is_baby`. Must be a boolean:", input_json$`is_baby`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInner: the required field `is_baby` is missing."))
      }
      # check the required field `species`
      if (!is.null(input_json$`species`)) {
        stopifnot(R6::is.R6(input_json$`species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInner: the required field `species` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionChainDetailChainEvolvesToInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `evolution_details` is null
      if (is.null(self$`evolution_details`)) {
        return(FALSE)
      }

      # check if the required `is_baby` is null
      if (is.null(self$`is_baby`)) {
        return(FALSE)
      }

      # check if the required `species` is null
      if (is.null(self$`species`)) {
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
      # check if the required `evolution_details` is null
      if (is.null(self$`evolution_details`)) {
        invalid_fields["evolution_details"] <- "Non-nullable required field `evolution_details` cannot be null."
      }

      # check if the required `is_baby` is null
      if (is.null(self$`is_baby`)) {
        invalid_fields["is_baby"] <- "Non-nullable required field `is_baby` cannot be null."
      }

      # check if the required `species` is null
      if (is.null(self$`species`)) {
        invalid_fields["species"] <- "Non-nullable required field `species` cannot be null."
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
# EvolutionChainDetailChainEvolvesToInner$unlock()
#
## Below is an example to define the print function
# EvolutionChainDetailChainEvolvesToInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionChainDetailChainEvolvesToInner$lock()

