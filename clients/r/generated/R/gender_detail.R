#' Create a new GenderDetail
#'
#' @description
#' GenderDetail Class
#'
#' @docType class
#' @title GenderDetail
#' @description GenderDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field pokemon_species_details  list(\link{GenderDetailPokemonSpeciesDetailsInner})
#' @field required_for_evolution  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenderDetail <- R6::R6Class(
  "GenderDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `pokemon_species_details` = NULL,
    `required_for_evolution` = NULL,

    #' @description
    #' Initialize a new GenderDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param pokemon_species_details pokemon_species_details
    #' @param required_for_evolution required_for_evolution
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `pokemon_species_details`, `required_for_evolution`, ...) {
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
      if (!missing(`pokemon_species_details`)) {
        stopifnot(is.vector(`pokemon_species_details`), length(`pokemon_species_details`) != 0)
        sapply(`pokemon_species_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon_species_details` <- `pokemon_species_details`
      }
      if (!missing(`required_for_evolution`)) {
        stopifnot(is.vector(`required_for_evolution`), length(`required_for_evolution`) != 0)
        sapply(`required_for_evolution`, function(x) stopifnot(R6::is.R6(x)))
        self$`required_for_evolution` <- `required_for_evolution`
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
    #' @return GenderDetail as a base R list.
    #' @examples
    #' # convert array of GenderDetail (x) to a data frame
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
    #' Convert GenderDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GenderDetailObject <- list()
      if (!is.null(self$`id`)) {
        GenderDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        GenderDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`pokemon_species_details`)) {
        GenderDetailObject[["pokemon_species_details"]] <-
          lapply(self$`pokemon_species_details`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`required_for_evolution`)) {
        GenderDetailObject[["required_for_evolution"]] <-
          lapply(self$`required_for_evolution`, function(x) x$toSimpleType())
      }
      return(GenderDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`pokemon_species_details`)) {
        self$`pokemon_species_details` <- ApiClient$new()$deserializeObj(this_object$`pokemon_species_details`, "array[GenderDetailPokemonSpeciesDetailsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`required_for_evolution`)) {
        self$`required_for_evolution` <- ApiClient$new()$deserializeObj(this_object$`required_for_evolution`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return GenderDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`pokemon_species_details` <- ApiClient$new()$deserializeObj(this_object$`pokemon_species_details`, "array[GenderDetailPokemonSpeciesDetailsInner]", loadNamespace("openapi"))
      self$`required_for_evolution` <- ApiClient$new()$deserializeObj(this_object$`required_for_evolution`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to GenderDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenderDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDetail: the required field `name` is missing."))
      }
      # check the required field `pokemon_species_details`
      if (!is.null(input_json$`pokemon_species_details`)) {
        stopifnot(is.vector(input_json$`pokemon_species_details`), length(input_json$`pokemon_species_details`) != 0)
        tmp <- sapply(input_json$`pokemon_species_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDetail: the required field `pokemon_species_details` is missing."))
      }
      # check the required field `required_for_evolution`
      if (!is.null(input_json$`required_for_evolution`)) {
        stopifnot(is.vector(input_json$`required_for_evolution`), length(input_json$`required_for_evolution`) != 0)
        tmp <- sapply(input_json$`required_for_evolution`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDetail: the required field `required_for_evolution` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderDetail
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

      # check if the required `pokemon_species_details` is null
      if (is.null(self$`pokemon_species_details`)) {
        return(FALSE)
      }

      # check if the required `required_for_evolution` is null
      if (is.null(self$`required_for_evolution`)) {
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

      # check if the required `pokemon_species_details` is null
      if (is.null(self$`pokemon_species_details`)) {
        invalid_fields["pokemon_species_details"] <- "Non-nullable required field `pokemon_species_details` cannot be null."
      }

      # check if the required `required_for_evolution` is null
      if (is.null(self$`required_for_evolution`)) {
        invalid_fields["required_for_evolution"] <- "Non-nullable required field `required_for_evolution` cannot be null."
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
# GenderDetail$unlock()
#
## Below is an example to define the print function
# GenderDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderDetail$lock()

