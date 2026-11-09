#' Create a new TypePastRelationships
#'
#' @description
#' TypePastRelationships Class
#'
#' @docType class
#' @title TypePastRelationships
#' @description TypePastRelationships Class
#' @format An \code{R6Class} generator object
#' @field generation The last generation in which the referenced type had the listed damage relations \link{GenerationSummary}
#' @field damage_relations The damage relations the referenced type had up to and including the listed generation \link{TypeRelationships}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypePastRelationships <- R6::R6Class(
  "TypePastRelationships",
  public = list(
    `generation` = NULL,
    `damage_relations` = NULL,

    #' @description
    #' Initialize a new TypePastRelationships class.
    #'
    #' @param generation The last generation in which the referenced type had the listed damage relations
    #' @param damage_relations The damage relations the referenced type had up to and including the listed generation
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
    #' @return TypePastRelationships as a base R list.
    #' @examples
    #' # convert array of TypePastRelationships (x) to a data frame
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
    #' Convert TypePastRelationships to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypePastRelationshipsObject <- list()
      if (!is.null(self$`generation`)) {
        TypePastRelationshipsObject[["generation"]] <-
          self$extractSimpleType(self$`generation`)
      }
      if (!is.null(self$`damage_relations`)) {
        TypePastRelationshipsObject[["damage_relations"]] <-
          self$extractSimpleType(self$`damage_relations`)
      }
      return(TypePastRelationshipsObject)
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
    #' Deserialize JSON string into an instance of TypePastRelationships
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypePastRelationships
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`damage_relations`)) {
        `damage_relations_object` <- TypeRelationships$new()
        `damage_relations_object`$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
        self$`damage_relations` <- `damage_relations_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypePastRelationships in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypePastRelationships
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypePastRelationships
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`damage_relations` <- TypeRelationships$new()$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypePastRelationships and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypePastRelationships: the required field `generation` is missing."))
      }
      # check the required field `damage_relations`
      if (!is.null(input_json$`damage_relations`)) {
        stopifnot(R6::is.R6(input_json$`damage_relations`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypePastRelationships: the required field `damage_relations` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypePastRelationships
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
# TypePastRelationships$unlock()
#
## Below is an example to define the print function
# TypePastRelationships$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypePastRelationships$lock()

