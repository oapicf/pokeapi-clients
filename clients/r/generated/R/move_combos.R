#' Create a new MoveCombos
#'
#' @description
#' MoveCombos Class
#'
#' @docType class
#' @title MoveCombos
#' @description MoveCombos Class
#' @format An \code{R6Class} generator object
#' @field normal A detail of moves this move can be used before or after, granting additional appeal points in contests. \link{MoveComboUsage}
#' @field item_super A detail of moves this move can be used before or after, granting additional appeal points in super contests. \link{MoveComboUsage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveCombos <- R6::R6Class(
  "MoveCombos",
  public = list(
    `normal` = NULL,
    `item_super` = NULL,

    #' @description
    #' Initialize a new MoveCombos class.
    #'
    #' @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests.
    #' @param item_super A detail of moves this move can be used before or after, granting additional appeal points in super contests.
    #' @param ... Other optional arguments.
    initialize = function(`normal`, `item_super`, ...) {
      if (!missing(`normal`)) {
        stopifnot(R6::is.R6(`normal`))
        self$`normal` <- `normal`
      }
      if (!missing(`item_super`)) {
        stopifnot(R6::is.R6(`item_super`))
        self$`item_super` <- `item_super`
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
    #' @return MoveCombos as a base R list.
    #' @examples
    #' # convert array of MoveCombos (x) to a data frame
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
    #' Convert MoveCombos to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveCombosObject <- list()
      if (!is.null(self$`normal`)) {
        MoveCombosObject[["normal"]] <-
          self$extractSimpleType(self$`normal`)
      }
      if (!is.null(self$`item_super`)) {
        MoveCombosObject[["super"]] <-
          self$extractSimpleType(self$`item_super`)
      }
      return(MoveCombosObject)
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
    #' Deserialize JSON string into an instance of MoveCombos
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveCombos
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`normal`)) {
        `normal_object` <- MoveComboUsage$new()
        `normal_object`$fromJSON(jsonlite::toJSON(this_object$`normal`, auto_unbox = TRUE, digits = NA))
        self$`normal` <- `normal_object`
      }
      if (!is.null(this_object$`super`)) {
        `item_super_object` <- MoveComboUsage$new()
        `item_super_object`$fromJSON(jsonlite::toJSON(this_object$`super`, auto_unbox = TRUE, digits = NA))
        self$`item_super` <- `item_super_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveCombos in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveCombos
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveCombos
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`normal` <- MoveComboUsage$new()$fromJSON(jsonlite::toJSON(this_object$`normal`, auto_unbox = TRUE, digits = NA))
      self$`item_super` <- MoveComboUsage$new()$fromJSON(jsonlite::toJSON(this_object$`item_super`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveCombos and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `normal`
      if (!is.null(input_json$`normal`)) {
        stopifnot(R6::is.R6(input_json$`normal`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveCombos: the required field `normal` is missing."))
      }
      # check the required field `item_super`
      if (!is.null(input_json$`item_super`)) {
        stopifnot(R6::is.R6(input_json$`item_super`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveCombos: the required field `item_super` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveCombos
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `normal` is null
      if (is.null(self$`normal`)) {
        return(FALSE)
      }

      # check if the required `item_super` is null
      if (is.null(self$`item_super`)) {
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
      # check if the required `normal` is null
      if (is.null(self$`normal`)) {
        invalid_fields["normal"] <- "Non-nullable required field `normal` cannot be null."
      }

      # check if the required `item_super` is null
      if (is.null(self$`item_super`)) {
        invalid_fields["item_super"] <- "Non-nullable required field `item_super` cannot be null."
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
# MoveCombos$unlock()
#
## Below is an example to define the print function
# MoveCombos$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveCombos$lock()

