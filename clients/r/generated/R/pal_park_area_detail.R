#' Create a new PalParkAreaDetail
#'
#' @description
#' PalParkAreaDetail Class
#'
#' @docType class
#' @title PalParkAreaDetail
#' @description PalParkAreaDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field names  list(\link{PalParkAreaName})
#' @field pokemon_encounters  list(\link{PalParkAreaDetailPokemonEncountersInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PalParkAreaDetail <- R6::R6Class(
  "PalParkAreaDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `names` = NULL,
    `pokemon_encounters` = NULL,

    #' @description
    #' Initialize a new PalParkAreaDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param names names
    #' @param pokemon_encounters pokemon_encounters
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `names`, `pokemon_encounters`, ...) {
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
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`pokemon_encounters`)) {
        stopifnot(is.vector(`pokemon_encounters`), length(`pokemon_encounters`) != 0)
        sapply(`pokemon_encounters`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon_encounters` <- `pokemon_encounters`
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
    #' @return PalParkAreaDetail as a base R list.
    #' @examples
    #' # convert array of PalParkAreaDetail (x) to a data frame
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
    #' Convert PalParkAreaDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PalParkAreaDetailObject <- list()
      if (!is.null(self$`id`)) {
        PalParkAreaDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PalParkAreaDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`names`)) {
        PalParkAreaDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokemon_encounters`)) {
        PalParkAreaDetailObject[["pokemon_encounters"]] <-
          lapply(self$`pokemon_encounters`, function(x) x$toSimpleType())
      }
      return(PalParkAreaDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PalParkAreaDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalParkAreaDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PalParkAreaName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon_encounters`)) {
        self$`pokemon_encounters` <- ApiClient$new()$deserializeObj(this_object$`pokemon_encounters`, "array[PalParkAreaDetailPokemonEncountersInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PalParkAreaDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PalParkAreaDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalParkAreaDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PalParkAreaName]", loadNamespace("openapi"))
      self$`pokemon_encounters` <- ApiClient$new()$deserializeObj(this_object$`pokemon_encounters`, "array[PalParkAreaDetailPokemonEncountersInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PalParkAreaDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetail: the required field `name` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetail: the required field `names` is missing."))
      }
      # check the required field `pokemon_encounters`
      if (!is.null(input_json$`pokemon_encounters`)) {
        stopifnot(is.vector(input_json$`pokemon_encounters`), length(input_json$`pokemon_encounters`) != 0)
        tmp <- sapply(input_json$`pokemon_encounters`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetail: the required field `pokemon_encounters` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PalParkAreaDetail
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

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `pokemon_encounters` is null
      if (is.null(self$`pokemon_encounters`)) {
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

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pokemon_encounters` is null
      if (is.null(self$`pokemon_encounters`)) {
        invalid_fields["pokemon_encounters"] <- "Non-nullable required field `pokemon_encounters` cannot be null."
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
# PalParkAreaDetail$unlock()
#
## Below is an example to define the print function
# PalParkAreaDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PalParkAreaDetail$lock()

