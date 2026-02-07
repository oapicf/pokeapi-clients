#' Create a new EvolutionChainDetailChain
#'
#' @description
#' EvolutionChainDetailChain Class
#'
#' @docType class
#' @title EvolutionChainDetailChain
#' @description EvolutionChainDetailChain Class
#' @format An \code{R6Class} generator object
#' @field evolution_details  list(\link{AnyType})
#' @field evolves_to  list(\link{EvolutionChainDetailChainEvolvesToInner})
#' @field is_baby  character
#' @field species  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionChainDetailChain <- R6::R6Class(
  "EvolutionChainDetailChain",
  public = list(
    `evolution_details` = NULL,
    `evolves_to` = NULL,
    `is_baby` = NULL,
    `species` = NULL,

    #' @description
    #' Initialize a new EvolutionChainDetailChain class.
    #'
    #' @param evolution_details evolution_details
    #' @param evolves_to evolves_to
    #' @param is_baby is_baby
    #' @param species species
    #' @param ... Other optional arguments.
    initialize = function(`evolution_details`, `evolves_to`, `is_baby`, `species`, ...) {
      if (!missing(`evolution_details`)) {
        stopifnot(is.vector(`evolution_details`), length(`evolution_details`) != 0)
        sapply(`evolution_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`evolution_details` <- `evolution_details`
      }
      if (!missing(`evolves_to`)) {
        stopifnot(is.vector(`evolves_to`), length(`evolves_to`) != 0)
        sapply(`evolves_to`, function(x) stopifnot(R6::is.R6(x)))
        self$`evolves_to` <- `evolves_to`
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
    #' @return EvolutionChainDetailChain as a base R list.
    #' @examples
    #' # convert array of EvolutionChainDetailChain (x) to a data frame
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
    #' Convert EvolutionChainDetailChain to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionChainDetailChainObject <- list()
      if (!is.null(self$`evolution_details`)) {
        EvolutionChainDetailChainObject[["evolution_details"]] <-
          lapply(self$`evolution_details`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`evolves_to`)) {
        EvolutionChainDetailChainObject[["evolves_to"]] <-
          lapply(self$`evolves_to`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`is_baby`)) {
        EvolutionChainDetailChainObject[["is_baby"]] <-
          self$`is_baby`
      }
      if (!is.null(self$`species`)) {
        EvolutionChainDetailChainObject[["species"]] <-
          self$`species`$toSimpleType()
      }
      return(EvolutionChainDetailChainObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChain
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChain
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`evolution_details`)) {
        self$`evolution_details` <- ApiClient$new()$deserializeObj(this_object$`evolution_details`, "array[AnyType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`evolves_to`)) {
        self$`evolves_to` <- ApiClient$new()$deserializeObj(this_object$`evolves_to`, "array[EvolutionChainDetailChainEvolvesToInner]", loadNamespace("openapi"))
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
    #' @return EvolutionChainDetailChain in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChain
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChain
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`evolution_details` <- ApiClient$new()$deserializeObj(this_object$`evolution_details`, "array[AnyType]", loadNamespace("openapi"))
      self$`evolves_to` <- ApiClient$new()$deserializeObj(this_object$`evolves_to`, "array[EvolutionChainDetailChainEvolvesToInner]", loadNamespace("openapi"))
      self$`is_baby` <- this_object$`is_baby`
      self$`species` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionChainDetailChain and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `evolution_details`
      if (!is.null(input_json$`evolution_details`)) {
        stopifnot(is.vector(input_json$`evolution_details`), length(input_json$`evolution_details`) != 0)
        tmp <- sapply(input_json$`evolution_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChain: the required field `evolution_details` is missing."))
      }
      # check the required field `evolves_to`
      if (!is.null(input_json$`evolves_to`)) {
        stopifnot(is.vector(input_json$`evolves_to`), length(input_json$`evolves_to`) != 0)
        tmp <- sapply(input_json$`evolves_to`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChain: the required field `evolves_to` is missing."))
      }
      # check the required field `is_baby`
      if (!is.null(input_json$`is_baby`)) {
        if (!(is.logical(input_json$`is_baby`) && length(input_json$`is_baby`) == 1)) {
          stop(paste("Error! Invalid data for `is_baby`. Must be a boolean:", input_json$`is_baby`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChain: the required field `is_baby` is missing."))
      }
      # check the required field `species`
      if (!is.null(input_json$`species`)) {
        stopifnot(R6::is.R6(input_json$`species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChain: the required field `species` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionChainDetailChain
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

      # check if the required `evolves_to` is null
      if (is.null(self$`evolves_to`)) {
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

      # check if the required `evolves_to` is null
      if (is.null(self$`evolves_to`)) {
        invalid_fields["evolves_to"] <- "Non-nullable required field `evolves_to` cannot be null."
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
# EvolutionChainDetailChain$unlock()
#
## Below is an example to define the print function
# EvolutionChainDetailChain$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionChainDetailChain$lock()

