#' Create a new TypeDetailDamageRelations
#'
#' @description
#' TypeDetailDamageRelations Class
#'
#' @docType class
#' @title TypeDetailDamageRelations
#' @description TypeDetailDamageRelations Class
#' @format An \code{R6Class} generator object
#' @field no_damage_to  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field half_damage_to  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field double_damage_to  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field no_damage_from  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field half_damage_from  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field double_damage_from  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetailDamageRelations <- R6::R6Class(
  "TypeDetailDamageRelations",
  public = list(
    `no_damage_to` = NULL,
    `half_damage_to` = NULL,
    `double_damage_to` = NULL,
    `no_damage_from` = NULL,
    `half_damage_from` = NULL,
    `double_damage_from` = NULL,

    #' @description
    #' Initialize a new TypeDetailDamageRelations class.
    #'
    #' @param no_damage_to no_damage_to
    #' @param half_damage_to half_damage_to
    #' @param double_damage_to double_damage_to
    #' @param no_damage_from no_damage_from
    #' @param half_damage_from half_damage_from
    #' @param double_damage_from double_damage_from
    #' @param ... Other optional arguments.
    initialize = function(`no_damage_to`, `half_damage_to`, `double_damage_to`, `no_damage_from`, `half_damage_from`, `double_damage_from`, ...) {
      if (!missing(`no_damage_to`)) {
        stopifnot(is.vector(`no_damage_to`), length(`no_damage_to`) != 0)
        sapply(`no_damage_to`, function(x) stopifnot(R6::is.R6(x)))
        self$`no_damage_to` <- `no_damage_to`
      }
      if (!missing(`half_damage_to`)) {
        stopifnot(is.vector(`half_damage_to`), length(`half_damage_to`) != 0)
        sapply(`half_damage_to`, function(x) stopifnot(R6::is.R6(x)))
        self$`half_damage_to` <- `half_damage_to`
      }
      if (!missing(`double_damage_to`)) {
        stopifnot(is.vector(`double_damage_to`), length(`double_damage_to`) != 0)
        sapply(`double_damage_to`, function(x) stopifnot(R6::is.R6(x)))
        self$`double_damage_to` <- `double_damage_to`
      }
      if (!missing(`no_damage_from`)) {
        stopifnot(is.vector(`no_damage_from`), length(`no_damage_from`) != 0)
        sapply(`no_damage_from`, function(x) stopifnot(R6::is.R6(x)))
        self$`no_damage_from` <- `no_damage_from`
      }
      if (!missing(`half_damage_from`)) {
        stopifnot(is.vector(`half_damage_from`), length(`half_damage_from`) != 0)
        sapply(`half_damage_from`, function(x) stopifnot(R6::is.R6(x)))
        self$`half_damage_from` <- `half_damage_from`
      }
      if (!missing(`double_damage_from`)) {
        stopifnot(is.vector(`double_damage_from`), length(`double_damage_from`) != 0)
        sapply(`double_damage_from`, function(x) stopifnot(R6::is.R6(x)))
        self$`double_damage_from` <- `double_damage_from`
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
    #' @return TypeDetailDamageRelations as a base R list.
    #' @examples
    #' # convert array of TypeDetailDamageRelations (x) to a data frame
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
    #' Convert TypeDetailDamageRelations to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailDamageRelationsObject <- list()
      if (!is.null(self$`no_damage_to`)) {
        TypeDetailDamageRelationsObject[["no_damage_to"]] <-
          lapply(self$`no_damage_to`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`half_damage_to`)) {
        TypeDetailDamageRelationsObject[["half_damage_to"]] <-
          lapply(self$`half_damage_to`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`double_damage_to`)) {
        TypeDetailDamageRelationsObject[["double_damage_to"]] <-
          lapply(self$`double_damage_to`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`no_damage_from`)) {
        TypeDetailDamageRelationsObject[["no_damage_from"]] <-
          lapply(self$`no_damage_from`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`half_damage_from`)) {
        TypeDetailDamageRelationsObject[["half_damage_from"]] <-
          lapply(self$`half_damage_from`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`double_damage_from`)) {
        TypeDetailDamageRelationsObject[["double_damage_from"]] <-
          lapply(self$`double_damage_from`, function(x) x$toSimpleType())
      }
      return(TypeDetailDamageRelationsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailDamageRelations
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailDamageRelations
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`no_damage_to`)) {
        self$`no_damage_to` <- ApiClient$new()$deserializeObj(this_object$`no_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`half_damage_to`)) {
        self$`half_damage_to` <- ApiClient$new()$deserializeObj(this_object$`half_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`double_damage_to`)) {
        self$`double_damage_to` <- ApiClient$new()$deserializeObj(this_object$`double_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`no_damage_from`)) {
        self$`no_damage_from` <- ApiClient$new()$deserializeObj(this_object$`no_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`half_damage_from`)) {
        self$`half_damage_from` <- ApiClient$new()$deserializeObj(this_object$`half_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`double_damage_from`)) {
        self$`double_damage_from` <- ApiClient$new()$deserializeObj(this_object$`double_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetailDamageRelations in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailDamageRelations
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailDamageRelations
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`no_damage_to` <- ApiClient$new()$deserializeObj(this_object$`no_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`half_damage_to` <- ApiClient$new()$deserializeObj(this_object$`half_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`double_damage_to` <- ApiClient$new()$deserializeObj(this_object$`double_damage_to`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`no_damage_from` <- ApiClient$new()$deserializeObj(this_object$`no_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`half_damage_from` <- ApiClient$new()$deserializeObj(this_object$`half_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`double_damage_from` <- ApiClient$new()$deserializeObj(this_object$`double_damage_from`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetailDamageRelations and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `no_damage_to`
      if (!is.null(input_json$`no_damage_to`)) {
        stopifnot(is.vector(input_json$`no_damage_to`), length(input_json$`no_damage_to`) != 0)
        tmp <- sapply(input_json$`no_damage_to`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `no_damage_to` is missing."))
      }
      # check the required field `half_damage_to`
      if (!is.null(input_json$`half_damage_to`)) {
        stopifnot(is.vector(input_json$`half_damage_to`), length(input_json$`half_damage_to`) != 0)
        tmp <- sapply(input_json$`half_damage_to`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `half_damage_to` is missing."))
      }
      # check the required field `double_damage_to`
      if (!is.null(input_json$`double_damage_to`)) {
        stopifnot(is.vector(input_json$`double_damage_to`), length(input_json$`double_damage_to`) != 0)
        tmp <- sapply(input_json$`double_damage_to`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `double_damage_to` is missing."))
      }
      # check the required field `no_damage_from`
      if (!is.null(input_json$`no_damage_from`)) {
        stopifnot(is.vector(input_json$`no_damage_from`), length(input_json$`no_damage_from`) != 0)
        tmp <- sapply(input_json$`no_damage_from`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `no_damage_from` is missing."))
      }
      # check the required field `half_damage_from`
      if (!is.null(input_json$`half_damage_from`)) {
        stopifnot(is.vector(input_json$`half_damage_from`), length(input_json$`half_damage_from`) != 0)
        tmp <- sapply(input_json$`half_damage_from`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `half_damage_from` is missing."))
      }
      # check the required field `double_damage_from`
      if (!is.null(input_json$`double_damage_from`)) {
        stopifnot(is.vector(input_json$`double_damage_from`), length(input_json$`double_damage_from`) != 0)
        tmp <- sapply(input_json$`double_damage_from`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailDamageRelations: the required field `double_damage_from` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetailDamageRelations
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `no_damage_to` is null
      if (is.null(self$`no_damage_to`)) {
        return(FALSE)
      }

      # check if the required `half_damage_to` is null
      if (is.null(self$`half_damage_to`)) {
        return(FALSE)
      }

      # check if the required `double_damage_to` is null
      if (is.null(self$`double_damage_to`)) {
        return(FALSE)
      }

      # check if the required `no_damage_from` is null
      if (is.null(self$`no_damage_from`)) {
        return(FALSE)
      }

      # check if the required `half_damage_from` is null
      if (is.null(self$`half_damage_from`)) {
        return(FALSE)
      }

      # check if the required `double_damage_from` is null
      if (is.null(self$`double_damage_from`)) {
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
      # check if the required `no_damage_to` is null
      if (is.null(self$`no_damage_to`)) {
        invalid_fields["no_damage_to"] <- "Non-nullable required field `no_damage_to` cannot be null."
      }

      # check if the required `half_damage_to` is null
      if (is.null(self$`half_damage_to`)) {
        invalid_fields["half_damage_to"] <- "Non-nullable required field `half_damage_to` cannot be null."
      }

      # check if the required `double_damage_to` is null
      if (is.null(self$`double_damage_to`)) {
        invalid_fields["double_damage_to"] <- "Non-nullable required field `double_damage_to` cannot be null."
      }

      # check if the required `no_damage_from` is null
      if (is.null(self$`no_damage_from`)) {
        invalid_fields["no_damage_from"] <- "Non-nullable required field `no_damage_from` cannot be null."
      }

      # check if the required `half_damage_from` is null
      if (is.null(self$`half_damage_from`)) {
        invalid_fields["half_damage_from"] <- "Non-nullable required field `half_damage_from` cannot be null."
      }

      # check if the required `double_damage_from` is null
      if (is.null(self$`double_damage_from`)) {
        invalid_fields["double_damage_from"] <- "Non-nullable required field `double_damage_from` cannot be null."
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
# TypeDetailDamageRelations$unlock()
#
## Below is an example to define the print function
# TypeDetailDamageRelations$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetailDamageRelations$lock()

