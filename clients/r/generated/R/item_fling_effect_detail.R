#' Create a new ItemFlingEffectDetail
#'
#' @description
#' ItemFlingEffectDetail Class
#'
#' @docType class
#' @title ItemFlingEffectDetail
#' @description ItemFlingEffectDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field effect_entries  list(\link{ItemFlingEffectEffectText})
#' @field items  list(\link{ItemSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemFlingEffectDetail <- R6::R6Class(
  "ItemFlingEffectDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `effect_entries` = NULL,
    `items` = NULL,

    #' @description
    #' Initialize a new ItemFlingEffectDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param effect_entries effect_entries
    #' @param items items
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `effect_entries`, `items`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
      }
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
    #' @return ItemFlingEffectDetail as a base R list.
    #' @examples
    #' # convert array of ItemFlingEffectDetail (x) to a data frame
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
    #' Convert ItemFlingEffectDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemFlingEffectDetailObject <- list()
      if (!is.null(self$`id`)) {
        ItemFlingEffectDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        ItemFlingEffectDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`effect_entries`)) {
        ItemFlingEffectDetailObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`items`)) {
        ItemFlingEffectDetailObject[["items"]] <-
          lapply(self$`items`, function(x) x$toSimpleType())
      }
      return(ItemFlingEffectDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemFlingEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemFlingEffectDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ItemFlingEffectEffectText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemFlingEffectDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemFlingEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemFlingEffectDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ItemFlingEffectEffectText]", loadNamespace("openapi"))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemFlingEffectDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ItemFlingEffectDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemFlingEffectDetail: the required field `name` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemFlingEffectDetail: the required field `effect_entries` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemFlingEffectDetail: the required field `items` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemFlingEffectDetail
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 100) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        return(FALSE)
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 100) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 100."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
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
# ItemFlingEffectDetail$unlock()
#
## Below is an example to define the print function
# ItemFlingEffectDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemFlingEffectDetail$lock()

