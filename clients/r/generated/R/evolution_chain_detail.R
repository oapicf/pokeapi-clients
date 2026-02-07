#' Create a new EvolutionChainDetail
#'
#' @description
#' EvolutionChainDetail Class
#'
#' @docType class
#' @title EvolutionChainDetail
#' @description EvolutionChainDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field baby_trigger_item  \link{ItemSummary}
#' @field chain  \link{EvolutionChainDetailChain}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionChainDetail <- R6::R6Class(
  "EvolutionChainDetail",
  public = list(
    `id` = NULL,
    `baby_trigger_item` = NULL,
    `chain` = NULL,

    #' @description
    #' Initialize a new EvolutionChainDetail class.
    #'
    #' @param id id
    #' @param baby_trigger_item baby_trigger_item
    #' @param chain chain
    #' @param ... Other optional arguments.
    initialize = function(`id`, `baby_trigger_item`, `chain`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`baby_trigger_item`)) {
        stopifnot(R6::is.R6(`baby_trigger_item`))
        self$`baby_trigger_item` <- `baby_trigger_item`
      }
      if (!missing(`chain`)) {
        stopifnot(R6::is.R6(`chain`))
        self$`chain` <- `chain`
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
    #' @return EvolutionChainDetail as a base R list.
    #' @examples
    #' # convert array of EvolutionChainDetail (x) to a data frame
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
    #' Convert EvolutionChainDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionChainDetailObject <- list()
      if (!is.null(self$`id`)) {
        EvolutionChainDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`baby_trigger_item`)) {
        EvolutionChainDetailObject[["baby_trigger_item"]] <-
          self$`baby_trigger_item`$toSimpleType()
      }
      if (!is.null(self$`chain`)) {
        EvolutionChainDetailObject[["chain"]] <-
          self$`chain`$toSimpleType()
      }
      return(EvolutionChainDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`baby_trigger_item`)) {
        `baby_trigger_item_object` <- ItemSummary$new()
        `baby_trigger_item_object`$fromJSON(jsonlite::toJSON(this_object$`baby_trigger_item`, auto_unbox = TRUE, digits = NA))
        self$`baby_trigger_item` <- `baby_trigger_item_object`
      }
      if (!is.null(this_object$`chain`)) {
        `chain_object` <- EvolutionChainDetailChain$new()
        `chain_object`$fromJSON(jsonlite::toJSON(this_object$`chain`, auto_unbox = TRUE, digits = NA))
        self$`chain` <- `chain_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EvolutionChainDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`baby_trigger_item` <- ItemSummary$new()$fromJSON(jsonlite::toJSON(this_object$`baby_trigger_item`, auto_unbox = TRUE, digits = NA))
      self$`chain` <- EvolutionChainDetailChain$new()$fromJSON(jsonlite::toJSON(this_object$`chain`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionChainDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetail: the required field `id` is missing."))
      }
      # check the required field `baby_trigger_item`
      if (!is.null(input_json$`baby_trigger_item`)) {
        stopifnot(R6::is.R6(input_json$`baby_trigger_item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetail: the required field `baby_trigger_item` is missing."))
      }
      # check the required field `chain`
      if (!is.null(input_json$`chain`)) {
        stopifnot(R6::is.R6(input_json$`chain`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetail: the required field `chain` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionChainDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `baby_trigger_item` is null
      if (is.null(self$`baby_trigger_item`)) {
        return(FALSE)
      }

      # check if the required `chain` is null
      if (is.null(self$`chain`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `baby_trigger_item` is null
      if (is.null(self$`baby_trigger_item`)) {
        invalid_fields["baby_trigger_item"] <- "Non-nullable required field `baby_trigger_item` cannot be null."
      }

      # check if the required `chain` is null
      if (is.null(self$`chain`)) {
        invalid_fields["chain"] <- "Non-nullable required field `chain` cannot be null."
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
# EvolutionChainDetail$unlock()
#
## Below is an example to define the print function
# EvolutionChainDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionChainDetail$lock()

