#' Create a new PokeathlonStatDetail
#'
#' @description
#' PokeathlonStatDetail Class
#'
#' @docType class
#' @title PokeathlonStatDetail
#' @description PokeathlonStatDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field affecting_natures  \link{PokeathlonStatDetailAffectingNatures}
#' @field names  list(\link{PokeathlonStatName})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokeathlonStatDetail <- R6::R6Class(
  "PokeathlonStatDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `affecting_natures` = NULL,
    `names` = NULL,

    #' @description
    #' Initialize a new PokeathlonStatDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param affecting_natures affecting_natures
    #' @param names names
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `affecting_natures`, `names`, ...) {
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
      if (!missing(`affecting_natures`)) {
        stopifnot(R6::is.R6(`affecting_natures`))
        self$`affecting_natures` <- `affecting_natures`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
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
    #' @return PokeathlonStatDetail as a base R list.
    #' @examples
    #' # convert array of PokeathlonStatDetail (x) to a data frame
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
    #' Convert PokeathlonStatDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokeathlonStatDetailObject <- list()
      if (!is.null(self$`id`)) {
        PokeathlonStatDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PokeathlonStatDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`affecting_natures`)) {
        PokeathlonStatDetailObject[["affecting_natures"]] <-
          self$`affecting_natures`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        PokeathlonStatDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      return(PokeathlonStatDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`affecting_natures`)) {
        `affecting_natures_object` <- PokeathlonStatDetailAffectingNatures$new()
        `affecting_natures_object`$fromJSON(jsonlite::toJSON(this_object$`affecting_natures`, auto_unbox = TRUE, digits = NA))
        self$`affecting_natures` <- `affecting_natures_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokeathlonStatName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokeathlonStatDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`affecting_natures` <- PokeathlonStatDetailAffectingNatures$new()$fromJSON(jsonlite::toJSON(this_object$`affecting_natures`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokeathlonStatName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokeathlonStatDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetail: the required field `name` is missing."))
      }
      # check the required field `affecting_natures`
      if (!is.null(input_json$`affecting_natures`)) {
        stopifnot(R6::is.R6(input_json$`affecting_natures`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetail: the required field `affecting_natures` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetail: the required field `names` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokeathlonStatDetail
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

      # check if the required `affecting_natures` is null
      if (is.null(self$`affecting_natures`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
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

      # check if the required `affecting_natures` is null
      if (is.null(self$`affecting_natures`)) {
        invalid_fields["affecting_natures"] <- "Non-nullable required field `affecting_natures` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
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
# PokeathlonStatDetail$unlock()
#
## Below is an example to define the print function
# PokeathlonStatDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokeathlonStatDetail$lock()

