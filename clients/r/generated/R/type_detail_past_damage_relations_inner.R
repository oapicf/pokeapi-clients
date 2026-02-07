#' Create a new TypeDetailPastDamageRelationsInner
#'
#' @description
#' TypeDetailPastDamageRelationsInner Class
#'
#' @docType class
#' @title TypeDetailPastDamageRelationsInner
#' @description TypeDetailPastDamageRelationsInner Class
#' @format An \code{R6Class} generator object
#' @field generation  \link{AbilityDetailPokemonInnerPokemon}
#' @field damage_relations  \link{TypeDetailPastDamageRelationsInnerDamageRelations}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetailPastDamageRelationsInner <- R6::R6Class(
  "TypeDetailPastDamageRelationsInner",
  public = list(
    `generation` = NULL,
    `damage_relations` = NULL,

    #' @description
    #' Initialize a new TypeDetailPastDamageRelationsInner class.
    #'
    #' @param generation generation
    #' @param damage_relations damage_relations
    #' @param ... Other optional arguments.
    initialize = function(`generation`, `damage_relations`, ...) {
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`damage_relations`)) {
        stopifnot(R6::is.R6(`damage_relations`))
        self$`damage_relations` <- `damage_relations`
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
    #' @return TypeDetailPastDamageRelationsInner as a base R list.
    #' @examples
    #' # convert array of TypeDetailPastDamageRelationsInner (x) to a data frame
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
    #' Convert TypeDetailPastDamageRelationsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailPastDamageRelationsInnerObject <- list()
      if (!is.null(self$`generation`)) {
        TypeDetailPastDamageRelationsInnerObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`damage_relations`)) {
        TypeDetailPastDamageRelationsInnerObject[["damage_relations"]] <-
          self$`damage_relations`$toSimpleType()
      }
      return(TypeDetailPastDamageRelationsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPastDamageRelationsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPastDamageRelationsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- AbilityDetailPokemonInnerPokemon$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`damage_relations`)) {
        `damage_relations_object` <- TypeDetailPastDamageRelationsInnerDamageRelations$new()
        `damage_relations_object`$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
        self$`damage_relations` <- `damage_relations_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetailPastDamageRelationsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPastDamageRelationsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPastDamageRelationsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`generation` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`damage_relations` <- TypeDetailPastDamageRelationsInnerDamageRelations$new()$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetailPastDamageRelationsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailPastDamageRelationsInner: the required field `generation` is missing."))
      }
      # check the required field `damage_relations`
      if (!is.null(input_json$`damage_relations`)) {
        stopifnot(R6::is.R6(input_json$`damage_relations`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetailPastDamageRelationsInner: the required field `damage_relations` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetailPastDamageRelationsInner
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

      # check if the required `damage_relations` is null
      if (is.null(self$`damage_relations`)) {
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

      # check if the required `damage_relations` is null
      if (is.null(self$`damage_relations`)) {
        invalid_fields["damage_relations"] <- "Non-nullable required field `damage_relations` cannot be null."
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
# TypeDetailPastDamageRelationsInner$unlock()
#
## Below is an example to define the print function
# TypeDetailPastDamageRelationsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetailPastDamageRelationsInner$lock()

