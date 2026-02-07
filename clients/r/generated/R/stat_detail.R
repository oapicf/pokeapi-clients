#' Create a new StatDetail
#'
#' @description
#' StatDetail Class
#'
#' @docType class
#' @title StatDetail
#' @description StatDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field game_index  integer
#' @field is_battle_only  character [optional]
#' @field affecting_moves  \link{StatDetailAffectingMoves}
#' @field affecting_natures  \link{StatDetailAffectingNatures}
#' @field characteristics  list(\link{CharacteristicSummary})
#' @field move_damage_class  \link{MoveDamageClassSummary}
#' @field names  list(\link{StatName})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StatDetail <- R6::R6Class(
  "StatDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `game_index` = NULL,
    `is_battle_only` = NULL,
    `affecting_moves` = NULL,
    `affecting_natures` = NULL,
    `characteristics` = NULL,
    `move_damage_class` = NULL,
    `names` = NULL,

    #' @description
    #' Initialize a new StatDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param game_index game_index
    #' @param affecting_moves affecting_moves
    #' @param affecting_natures affecting_natures
    #' @param characteristics characteristics
    #' @param move_damage_class move_damage_class
    #' @param names names
    #' @param is_battle_only is_battle_only
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `game_index`, `affecting_moves`, `affecting_natures`, `characteristics`, `move_damage_class`, `names`, `is_battle_only` = NULL, ...) {
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
      if (!missing(`game_index`)) {
        if (!(is.numeric(`game_index`) && length(`game_index`) == 1)) {
          stop(paste("Error! Invalid data for `game_index`. Must be an integer:", `game_index`))
        }
        self$`game_index` <- `game_index`
      }
      if (!missing(`affecting_moves`)) {
        stopifnot(R6::is.R6(`affecting_moves`))
        self$`affecting_moves` <- `affecting_moves`
      }
      if (!missing(`affecting_natures`)) {
        stopifnot(R6::is.R6(`affecting_natures`))
        self$`affecting_natures` <- `affecting_natures`
      }
      if (!missing(`characteristics`)) {
        stopifnot(is.vector(`characteristics`), length(`characteristics`) != 0)
        sapply(`characteristics`, function(x) stopifnot(R6::is.R6(x)))
        self$`characteristics` <- `characteristics`
      }
      if (!missing(`move_damage_class`)) {
        stopifnot(R6::is.R6(`move_damage_class`))
        self$`move_damage_class` <- `move_damage_class`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!is.null(`is_battle_only`)) {
        if (!(is.logical(`is_battle_only`) && length(`is_battle_only`) == 1)) {
          stop(paste("Error! Invalid data for `is_battle_only`. Must be a boolean:", `is_battle_only`))
        }
        self$`is_battle_only` <- `is_battle_only`
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
    #' @return StatDetail as a base R list.
    #' @examples
    #' # convert array of StatDetail (x) to a data frame
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
    #' Convert StatDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      StatDetailObject <- list()
      if (!is.null(self$`id`)) {
        StatDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        StatDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`game_index`)) {
        StatDetailObject[["game_index"]] <-
          self$`game_index`
      }
      if (!is.null(self$`is_battle_only`)) {
        StatDetailObject[["is_battle_only"]] <-
          self$`is_battle_only`
      }
      if (!is.null(self$`affecting_moves`)) {
        StatDetailObject[["affecting_moves"]] <-
          self$`affecting_moves`$toSimpleType()
      }
      if (!is.null(self$`affecting_natures`)) {
        StatDetailObject[["affecting_natures"]] <-
          self$`affecting_natures`$toSimpleType()
      }
      if (!is.null(self$`characteristics`)) {
        StatDetailObject[["characteristics"]] <-
          lapply(self$`characteristics`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`move_damage_class`)) {
        StatDetailObject[["move_damage_class"]] <-
          self$`move_damage_class`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        StatDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      return(StatDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of StatDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of StatDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`game_index`)) {
        self$`game_index` <- this_object$`game_index`
      }
      if (!is.null(this_object$`is_battle_only`)) {
        self$`is_battle_only` <- this_object$`is_battle_only`
      }
      if (!is.null(this_object$`affecting_moves`)) {
        `affecting_moves_object` <- StatDetailAffectingMoves$new()
        `affecting_moves_object`$fromJSON(jsonlite::toJSON(this_object$`affecting_moves`, auto_unbox = TRUE, digits = NA))
        self$`affecting_moves` <- `affecting_moves_object`
      }
      if (!is.null(this_object$`affecting_natures`)) {
        `affecting_natures_object` <- StatDetailAffectingNatures$new()
        `affecting_natures_object`$fromJSON(jsonlite::toJSON(this_object$`affecting_natures`, auto_unbox = TRUE, digits = NA))
        self$`affecting_natures` <- `affecting_natures_object`
      }
      if (!is.null(this_object$`characteristics`)) {
        self$`characteristics` <- ApiClient$new()$deserializeObj(this_object$`characteristics`, "array[CharacteristicSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`move_damage_class`)) {
        `move_damage_class_object` <- MoveDamageClassSummary$new()
        `move_damage_class_object`$fromJSON(jsonlite::toJSON(this_object$`move_damage_class`, auto_unbox = TRUE, digits = NA))
        self$`move_damage_class` <- `move_damage_class_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[StatName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return StatDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of StatDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of StatDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`game_index` <- this_object$`game_index`
      self$`is_battle_only` <- this_object$`is_battle_only`
      self$`affecting_moves` <- StatDetailAffectingMoves$new()$fromJSON(jsonlite::toJSON(this_object$`affecting_moves`, auto_unbox = TRUE, digits = NA))
      self$`affecting_natures` <- StatDetailAffectingNatures$new()$fromJSON(jsonlite::toJSON(this_object$`affecting_natures`, auto_unbox = TRUE, digits = NA))
      self$`characteristics` <- ApiClient$new()$deserializeObj(this_object$`characteristics`, "array[CharacteristicSummary]", loadNamespace("openapi"))
      self$`move_damage_class` <- MoveDamageClassSummary$new()$fromJSON(jsonlite::toJSON(this_object$`move_damage_class`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[StatName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to StatDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `name` is missing."))
      }
      # check the required field `game_index`
      if (!is.null(input_json$`game_index`)) {
        if (!(is.numeric(input_json$`game_index`) && length(input_json$`game_index`) == 1)) {
          stop(paste("Error! Invalid data for `game_index`. Must be an integer:", input_json$`game_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `game_index` is missing."))
      }
      # check the required field `affecting_moves`
      if (!is.null(input_json$`affecting_moves`)) {
        stopifnot(R6::is.R6(input_json$`affecting_moves`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `affecting_moves` is missing."))
      }
      # check the required field `affecting_natures`
      if (!is.null(input_json$`affecting_natures`)) {
        stopifnot(R6::is.R6(input_json$`affecting_natures`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `affecting_natures` is missing."))
      }
      # check the required field `characteristics`
      if (!is.null(input_json$`characteristics`)) {
        stopifnot(is.vector(input_json$`characteristics`), length(input_json$`characteristics`) != 0)
        tmp <- sapply(input_json$`characteristics`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `characteristics` is missing."))
      }
      # check the required field `move_damage_class`
      if (!is.null(input_json$`move_damage_class`)) {
        stopifnot(R6::is.R6(input_json$`move_damage_class`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `move_damage_class` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetail: the required field `names` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of StatDetail
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

      # check if the required `game_index` is null
      if (is.null(self$`game_index`)) {
        return(FALSE)
      }

      # check if the required `affecting_moves` is null
      if (is.null(self$`affecting_moves`)) {
        return(FALSE)
      }

      # check if the required `affecting_natures` is null
      if (is.null(self$`affecting_natures`)) {
        return(FALSE)
      }

      # check if the required `characteristics` is null
      if (is.null(self$`characteristics`)) {
        return(FALSE)
      }

      # check if the required `move_damage_class` is null
      if (is.null(self$`move_damage_class`)) {
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

      # check if the required `game_index` is null
      if (is.null(self$`game_index`)) {
        invalid_fields["game_index"] <- "Non-nullable required field `game_index` cannot be null."
      }

      # check if the required `affecting_moves` is null
      if (is.null(self$`affecting_moves`)) {
        invalid_fields["affecting_moves"] <- "Non-nullable required field `affecting_moves` cannot be null."
      }

      # check if the required `affecting_natures` is null
      if (is.null(self$`affecting_natures`)) {
        invalid_fields["affecting_natures"] <- "Non-nullable required field `affecting_natures` cannot be null."
      }

      # check if the required `characteristics` is null
      if (is.null(self$`characteristics`)) {
        invalid_fields["characteristics"] <- "Non-nullable required field `characteristics` cannot be null."
      }

      # check if the required `move_damage_class` is null
      if (is.null(self$`move_damage_class`)) {
        invalid_fields["move_damage_class"] <- "Non-nullable required field `move_damage_class` cannot be null."
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
# StatDetail$unlock()
#
## Below is an example to define the print function
# StatDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# StatDetail$lock()

