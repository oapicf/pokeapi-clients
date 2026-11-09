#' Create a new PokemonEncounterDetailResponse
#'
#' @description
#' PokemonEncounterDetailResponse Class
#'
#' @docType class
#' @title PokemonEncounterDetailResponse
#' @description PokemonEncounterDetailResponse Class
#' @format An \code{R6Class} generator object
#' @field chance Percent chance that this encounter will occur. integer
#' @field condition_values A list of condition values that must be in effect for this encounter to occur. list(\link{EncounterConditionValueSummary})
#' @field max_level The highest level the Pokémon could be encountered at. integer
#' @field method The method by which this encounter happens. \link{EncounterMethodSummary}
#' @field min_level The lowest level the Pokémon could be encountered at. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEncounterDetailResponse <- R6::R6Class(
  "PokemonEncounterDetailResponse",
  public = list(
    `chance` = NULL,
    `condition_values` = NULL,
    `max_level` = NULL,
    `method` = NULL,
    `min_level` = NULL,

    #' @description
    #' Initialize a new PokemonEncounterDetailResponse class.
    #'
    #' @param chance Percent chance that this encounter will occur.
    #' @param condition_values A list of condition values that must be in effect for this encounter to occur.
    #' @param max_level The highest level the Pokémon could be encountered at.
    #' @param method The method by which this encounter happens.
    #' @param min_level The lowest level the Pokémon could be encountered at.
    #' @param ... Other optional arguments.
    initialize = function(`chance`, `condition_values`, `max_level`, `method`, `min_level`, ...) {
      if (!missing(`chance`)) {
        if (!(is.numeric(`chance`) && length(`chance`) == 1)) {
          stop(paste("Error! Invalid data for `chance`. Must be an integer:", `chance`))
        }
        self$`chance` <- `chance`
      }
      if (!missing(`condition_values`)) {
        stopifnot(is.vector(`condition_values`), length(`condition_values`) != 0)
        sapply(`condition_values`, function(x) stopifnot(R6::is.R6(x)))
        self$`condition_values` <- `condition_values`
      }
      if (!missing(`max_level`)) {
        if (!(is.numeric(`max_level`) && length(`max_level`) == 1)) {
          stop(paste("Error! Invalid data for `max_level`. Must be an integer:", `max_level`))
        }
        self$`max_level` <- `max_level`
      }
      if (!missing(`method`)) {
        stopifnot(R6::is.R6(`method`))
        self$`method` <- `method`
      }
      if (!missing(`min_level`)) {
        if (!(is.numeric(`min_level`) && length(`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", `min_level`))
        }
        self$`min_level` <- `min_level`
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
    #' @return PokemonEncounterDetailResponse as a base R list.
    #' @examples
    #' # convert array of PokemonEncounterDetailResponse (x) to a data frame
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
    #' Convert PokemonEncounterDetailResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEncounterDetailResponseObject <- list()
      if (!is.null(self$`chance`)) {
        PokemonEncounterDetailResponseObject[["chance"]] <-
          self$`chance`
      }
      if (!is.null(self$`condition_values`)) {
        PokemonEncounterDetailResponseObject[["condition_values"]] <-
          self$extractSimpleType(self$`condition_values`)
      }
      if (!is.null(self$`max_level`)) {
        PokemonEncounterDetailResponseObject[["max_level"]] <-
          self$`max_level`
      }
      if (!is.null(self$`method`)) {
        PokemonEncounterDetailResponseObject[["method"]] <-
          self$extractSimpleType(self$`method`)
      }
      if (!is.null(self$`min_level`)) {
        PokemonEncounterDetailResponseObject[["min_level"]] <-
          self$`min_level`
      }
      return(PokemonEncounterDetailResponseObject)
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
    #' Deserialize JSON string into an instance of PokemonEncounterDetailResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncounterDetailResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`chance`)) {
        self$`chance` <- this_object$`chance`
      }
      if (!is.null(this_object$`condition_values`)) {
        self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[EncounterConditionValueSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`max_level`)) {
        self$`max_level` <- this_object$`max_level`
      }
      if (!is.null(this_object$`method`)) {
        `method_object` <- EncounterMethodSummary$new()
        `method_object`$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
        self$`method` <- `method_object`
      }
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEncounterDetailResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncounterDetailResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncounterDetailResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`chance` <- this_object$`chance`
      self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[EncounterConditionValueSummary]", loadNamespace("openapi"))
      self$`max_level` <- this_object$`max_level`
      self$`method` <- EncounterMethodSummary$new()$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
      self$`min_level` <- this_object$`min_level`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEncounterDetailResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `chance`
      if (!is.null(input_json$`chance`)) {
        if (!(is.numeric(input_json$`chance`) && length(input_json$`chance`) == 1)) {
          stop(paste("Error! Invalid data for `chance`. Must be an integer:", input_json$`chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterDetailResponse: the required field `chance` is missing."))
      }
      # check the required field `condition_values`
      if (!is.null(input_json$`condition_values`)) {
        stopifnot(is.vector(input_json$`condition_values`), length(input_json$`condition_values`) != 0)
        tmp <- sapply(input_json$`condition_values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterDetailResponse: the required field `condition_values` is missing."))
      }
      # check the required field `max_level`
      if (!is.null(input_json$`max_level`)) {
        if (!(is.numeric(input_json$`max_level`) && length(input_json$`max_level`) == 1)) {
          stop(paste("Error! Invalid data for `max_level`. Must be an integer:", input_json$`max_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterDetailResponse: the required field `max_level` is missing."))
      }
      # check the required field `method`
      if (!is.null(input_json$`method`)) {
        stopifnot(R6::is.R6(input_json$`method`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterDetailResponse: the required field `method` is missing."))
      }
      # check the required field `min_level`
      if (!is.null(input_json$`min_level`)) {
        if (!(is.numeric(input_json$`min_level`) && length(input_json$`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", input_json$`min_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterDetailResponse: the required field `min_level` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEncounterDetailResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        return(FALSE)
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
        return(FALSE)
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        return(FALSE)
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
        return(FALSE)
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
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
      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        invalid_fields["chance"] <- "Non-nullable required field `chance` cannot be null."
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
        invalid_fields["condition_values"] <- "Non-nullable required field `condition_values` cannot be null."
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        invalid_fields["max_level"] <- "Non-nullable required field `max_level` cannot be null."
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
        invalid_fields["method"] <- "Non-nullable required field `method` cannot be null."
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        invalid_fields["min_level"] <- "Non-nullable required field `min_level` cannot be null."
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
# PokemonEncounterDetailResponse$unlock()
#
## Below is an example to define the print function
# PokemonEncounterDetailResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEncounterDetailResponse$lock()

