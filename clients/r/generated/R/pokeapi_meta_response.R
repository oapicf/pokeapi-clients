#' Create a new PokeapiMetaResponse
#'
#' @description
#' PokeapiMetaResponse Class
#'
#' @docType class
#' @title PokeapiMetaResponse
#' @description PokeapiMetaResponse Class
#' @format An \code{R6Class} generator object
#' @field deploy_date The deployment time as a Unix timestamp string. character
#' @field hash The source commit hash used for this deployment. character
#' @field tag The deployment tag, or null if the deployment has no tag. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokeapiMetaResponse <- R6::R6Class(
  "PokeapiMetaResponse",
  public = list(
    `deploy_date` = NULL,
    `hash` = NULL,
    `tag` = NULL,

    #' @description
    #' Initialize a new PokeapiMetaResponse class.
    #'
    #' @param deploy_date The deployment time as a Unix timestamp string.
    #' @param hash The source commit hash used for this deployment.
    #' @param tag The deployment tag, or null if the deployment has no tag.
    #' @param ... Other optional arguments.
    initialize = function(`deploy_date`, `hash`, `tag`, ...) {
      if (!missing(`deploy_date`)) {
        if (!(is.character(`deploy_date`) && length(`deploy_date`) == 1)) {
          stop(paste("Error! Invalid data for `deploy_date`. Must be a string:", `deploy_date`))
        }
        self$`deploy_date` <- `deploy_date`
      }
      if (!missing(`hash`)) {
        if (!(is.character(`hash`) && length(`hash`) == 1)) {
          stop(paste("Error! Invalid data for `hash`. Must be a string:", `hash`))
        }
        self$`hash` <- `hash`
      }
      if (!missing(`tag`)) {
        if (!(is.character(`tag`) && length(`tag`) == 1)) {
          stop(paste("Error! Invalid data for `tag`. Must be a string:", `tag`))
        }
        self$`tag` <- `tag`
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
    #' @return PokeapiMetaResponse as a base R list.
    #' @examples
    #' # convert array of PokeapiMetaResponse (x) to a data frame
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
    #' Convert PokeapiMetaResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokeapiMetaResponseObject <- list()
      if (!is.null(self$`deploy_date`)) {
        PokeapiMetaResponseObject[["deploy_date"]] <-
          self$`deploy_date`
      }
      if (!is.null(self$`hash`)) {
        PokeapiMetaResponseObject[["hash"]] <-
          self$`hash`
      }
      if (!is.null(self$`tag`)) {
        PokeapiMetaResponseObject[["tag"]] <-
          self$`tag`
      }
      return(PokeapiMetaResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeapiMetaResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeapiMetaResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deploy_date`)) {
        self$`deploy_date` <- this_object$`deploy_date`
      }
      if (!is.null(this_object$`hash`)) {
        self$`hash` <- this_object$`hash`
      }
      if (!is.null(this_object$`tag`)) {
        self$`tag` <- this_object$`tag`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokeapiMetaResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeapiMetaResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeapiMetaResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deploy_date` <- this_object$`deploy_date`
      self$`hash` <- this_object$`hash`
      self$`tag` <- this_object$`tag`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokeapiMetaResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `deploy_date`
      if (!is.null(input_json$`deploy_date`)) {
        if (!(is.character(input_json$`deploy_date`) && length(input_json$`deploy_date`) == 1)) {
          stop(paste("Error! Invalid data for `deploy_date`. Must be a string:", input_json$`deploy_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeapiMetaResponse: the required field `deploy_date` is missing."))
      }
      # check the required field `hash`
      if (!is.null(input_json$`hash`)) {
        if (!(is.character(input_json$`hash`) && length(input_json$`hash`) == 1)) {
          stop(paste("Error! Invalid data for `hash`. Must be a string:", input_json$`hash`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeapiMetaResponse: the required field `hash` is missing."))
      }
      # check the required field `tag`
      if (!is.null(input_json$`tag`)) {
        if (!(is.character(input_json$`tag`) && length(input_json$`tag`) == 1)) {
          stop(paste("Error! Invalid data for `tag`. Must be a string:", input_json$`tag`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeapiMetaResponse: the required field `tag` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokeapiMetaResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# PokeapiMetaResponse$unlock()
#
## Below is an example to define the print function
# PokeapiMetaResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokeapiMetaResponse$lock()

