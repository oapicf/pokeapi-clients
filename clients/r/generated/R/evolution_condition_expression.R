#' Create a new EvolutionConditionExpression
#'
#' @description
#' EvolutionConditionExpression Class
#'
#' @docType class
#' @title EvolutionConditionExpression
#' @description EvolutionConditionExpression Class
#' @format An \code{R6Class} generator object
#' @field expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 \% 0 ==') character
#' @field percentage_chance Percentage chance of evolution under this condition (0-100) numeric
#' @field variables Evolution variables referenced in the expression list(\link{EvolutionVariableSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionConditionExpression <- R6::R6Class(
  "EvolutionConditionExpression",
  public = list(
    `expression` = NULL,
    `percentage_chance` = NULL,
    `variables` = NULL,

    #' @description
    #' Initialize a new EvolutionConditionExpression class.
    #'
    #' @param expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 \% 0 ==')
    #' @param percentage_chance Percentage chance of evolution under this condition (0-100)
    #' @param variables Evolution variables referenced in the expression
    #' @param ... Other optional arguments.
    initialize = function(`expression`, `percentage_chance`, `variables`, ...) {
      if (!missing(`expression`)) {
        if (!(is.character(`expression`) && length(`expression`) == 1)) {
          stop(paste("Error! Invalid data for `expression`. Must be a string:", `expression`))
        }
        self$`expression` <- `expression`
      }
      if (!missing(`percentage_chance`)) {
        if (!(is.numeric(`percentage_chance`) && length(`percentage_chance`) == 1)) {
          stop(paste("Error! Invalid data for `percentage_chance`. Must be a number:", `percentage_chance`))
        }
        self$`percentage_chance` <- `percentage_chance`
      }
      if (!missing(`variables`)) {
        stopifnot(is.vector(`variables`), length(`variables`) != 0)
        sapply(`variables`, function(x) stopifnot(R6::is.R6(x)))
        self$`variables` <- `variables`
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
    #' @return EvolutionConditionExpression as a base R list.
    #' @examples
    #' # convert array of EvolutionConditionExpression (x) to a data frame
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
    #' Convert EvolutionConditionExpression to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionConditionExpressionObject <- list()
      if (!is.null(self$`expression`)) {
        EvolutionConditionExpressionObject[["expression"]] <-
          self$`expression`
      }
      if (!is.null(self$`percentage_chance`)) {
        EvolutionConditionExpressionObject[["percentage_chance"]] <-
          self$`percentage_chance`
      }
      if (!is.null(self$`variables`)) {
        EvolutionConditionExpressionObject[["variables"]] <-
          self$extractSimpleType(self$`variables`)
      }
      return(EvolutionConditionExpressionObject)
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
    #' Deserialize JSON string into an instance of EvolutionConditionExpression
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionConditionExpression
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`expression`)) {
        self$`expression` <- this_object$`expression`
      }
      if (!is.null(this_object$`percentage_chance`)) {
        self$`percentage_chance` <- this_object$`percentage_chance`
      }
      if (!is.null(this_object$`variables`)) {
        self$`variables` <- ApiClient$new()$deserializeObj(this_object$`variables`, "array[EvolutionVariableSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EvolutionConditionExpression in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionConditionExpression
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionConditionExpression
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`expression` <- this_object$`expression`
      self$`percentage_chance` <- this_object$`percentage_chance`
      self$`variables` <- ApiClient$new()$deserializeObj(this_object$`variables`, "array[EvolutionVariableSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionConditionExpression and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `expression`
      if (!is.null(input_json$`expression`)) {
        if (!(is.character(input_json$`expression`) && length(input_json$`expression`) == 1)) {
          stop(paste("Error! Invalid data for `expression`. Must be a string:", input_json$`expression`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionConditionExpression: the required field `expression` is missing."))
      }
      # check the required field `percentage_chance`
      if (!is.null(input_json$`percentage_chance`)) {
        if (!(is.numeric(input_json$`percentage_chance`) && length(input_json$`percentage_chance`) == 1)) {
          stop(paste("Error! Invalid data for `percentage_chance`. Must be a number:", input_json$`percentage_chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionConditionExpression: the required field `percentage_chance` is missing."))
      }
      # check the required field `variables`
      if (!is.null(input_json$`variables`)) {
        stopifnot(is.vector(input_json$`variables`), length(input_json$`variables`) != 0)
        tmp <- sapply(input_json$`variables`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionConditionExpression: the required field `variables` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionConditionExpression
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `expression` is null
      if (is.null(self$`expression`)) {
        return(FALSE)
      }

      # check if the required `variables` is null
      if (is.null(self$`variables`)) {
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
      # check if the required `expression` is null
      if (is.null(self$`expression`)) {
        invalid_fields["expression"] <- "Non-nullable required field `expression` cannot be null."
      }

      # check if the required `variables` is null
      if (is.null(self$`variables`)) {
        invalid_fields["variables"] <- "Non-nullable required field `variables` cannot be null."
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
# EvolutionConditionExpression$unlock()
#
## Below is an example to define the print function
# EvolutionConditionExpression$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionConditionExpression$lock()

