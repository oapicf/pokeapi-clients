#' Create a new BerryDetail
#'
#' @description
#' BerryDetail Class
#'
#' @docType class
#' @title BerryDetail
#' @description BerryDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field growth_time  integer
#' @field max_harvest  integer
#' @field natural_gift_power  integer
#' @field size  integer
#' @field smoothness  integer
#' @field soil_dryness  integer
#' @field firmness  \link{BerryFirmnessSummary}
#' @field flavors  list(\link{BerryDetailFlavorsInner})
#' @field item  \link{ItemSummary}
#' @field natural_gift_type  \link{TypeSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BerryDetail <- R6::R6Class(
  "BerryDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `growth_time` = NULL,
    `max_harvest` = NULL,
    `natural_gift_power` = NULL,
    `size` = NULL,
    `smoothness` = NULL,
    `soil_dryness` = NULL,
    `firmness` = NULL,
    `flavors` = NULL,
    `item` = NULL,
    `natural_gift_type` = NULL,

    #' @description
    #' Initialize a new BerryDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param growth_time growth_time
    #' @param max_harvest max_harvest
    #' @param natural_gift_power natural_gift_power
    #' @param size size
    #' @param smoothness smoothness
    #' @param soil_dryness soil_dryness
    #' @param firmness firmness
    #' @param flavors flavors
    #' @param item item
    #' @param natural_gift_type natural_gift_type
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `growth_time`, `max_harvest`, `natural_gift_power`, `size`, `smoothness`, `soil_dryness`, `firmness`, `flavors`, `item`, `natural_gift_type`, ...) {
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
      if (!missing(`growth_time`)) {
        if (!(is.numeric(`growth_time`) && length(`growth_time`) == 1)) {
          stop(paste("Error! Invalid data for `growth_time`. Must be an integer:", `growth_time`))
        }
        self$`growth_time` <- `growth_time`
      }
      if (!missing(`max_harvest`)) {
        if (!(is.numeric(`max_harvest`) && length(`max_harvest`) == 1)) {
          stop(paste("Error! Invalid data for `max_harvest`. Must be an integer:", `max_harvest`))
        }
        self$`max_harvest` <- `max_harvest`
      }
      if (!missing(`natural_gift_power`)) {
        if (!(is.numeric(`natural_gift_power`) && length(`natural_gift_power`) == 1)) {
          stop(paste("Error! Invalid data for `natural_gift_power`. Must be an integer:", `natural_gift_power`))
        }
        self$`natural_gift_power` <- `natural_gift_power`
      }
      if (!missing(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
      if (!missing(`smoothness`)) {
        if (!(is.numeric(`smoothness`) && length(`smoothness`) == 1)) {
          stop(paste("Error! Invalid data for `smoothness`. Must be an integer:", `smoothness`))
        }
        self$`smoothness` <- `smoothness`
      }
      if (!missing(`soil_dryness`)) {
        if (!(is.numeric(`soil_dryness`) && length(`soil_dryness`) == 1)) {
          stop(paste("Error! Invalid data for `soil_dryness`. Must be an integer:", `soil_dryness`))
        }
        self$`soil_dryness` <- `soil_dryness`
      }
      if (!missing(`firmness`)) {
        stopifnot(R6::is.R6(`firmness`))
        self$`firmness` <- `firmness`
      }
      if (!missing(`flavors`)) {
        stopifnot(is.vector(`flavors`), length(`flavors`) != 0)
        sapply(`flavors`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavors` <- `flavors`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!missing(`natural_gift_type`)) {
        stopifnot(R6::is.R6(`natural_gift_type`))
        self$`natural_gift_type` <- `natural_gift_type`
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
    #' @return BerryDetail as a base R list.
    #' @examples
    #' # convert array of BerryDetail (x) to a data frame
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
    #' Convert BerryDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BerryDetailObject <- list()
      if (!is.null(self$`id`)) {
        BerryDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        BerryDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`growth_time`)) {
        BerryDetailObject[["growth_time"]] <-
          self$`growth_time`
      }
      if (!is.null(self$`max_harvest`)) {
        BerryDetailObject[["max_harvest"]] <-
          self$`max_harvest`
      }
      if (!is.null(self$`natural_gift_power`)) {
        BerryDetailObject[["natural_gift_power"]] <-
          self$`natural_gift_power`
      }
      if (!is.null(self$`size`)) {
        BerryDetailObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`smoothness`)) {
        BerryDetailObject[["smoothness"]] <-
          self$`smoothness`
      }
      if (!is.null(self$`soil_dryness`)) {
        BerryDetailObject[["soil_dryness"]] <-
          self$`soil_dryness`
      }
      if (!is.null(self$`firmness`)) {
        BerryDetailObject[["firmness"]] <-
          self$`firmness`$toSimpleType()
      }
      if (!is.null(self$`flavors`)) {
        BerryDetailObject[["flavors"]] <-
          lapply(self$`flavors`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`item`)) {
        BerryDetailObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      if (!is.null(self$`natural_gift_type`)) {
        BerryDetailObject[["natural_gift_type"]] <-
          self$`natural_gift_type`$toSimpleType()
      }
      return(BerryDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`growth_time`)) {
        self$`growth_time` <- this_object$`growth_time`
      }
      if (!is.null(this_object$`max_harvest`)) {
        self$`max_harvest` <- this_object$`max_harvest`
      }
      if (!is.null(this_object$`natural_gift_power`)) {
        self$`natural_gift_power` <- this_object$`natural_gift_power`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`smoothness`)) {
        self$`smoothness` <- this_object$`smoothness`
      }
      if (!is.null(this_object$`soil_dryness`)) {
        self$`soil_dryness` <- this_object$`soil_dryness`
      }
      if (!is.null(this_object$`firmness`)) {
        `firmness_object` <- BerryFirmnessSummary$new()
        `firmness_object`$fromJSON(jsonlite::toJSON(this_object$`firmness`, auto_unbox = TRUE, digits = NA))
        self$`firmness` <- `firmness_object`
      }
      if (!is.null(this_object$`flavors`)) {
        self$`flavors` <- ApiClient$new()$deserializeObj(this_object$`flavors`, "array[BerryDetailFlavorsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- ItemSummary$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      if (!is.null(this_object$`natural_gift_type`)) {
        `natural_gift_type_object` <- TypeSummary$new()
        `natural_gift_type_object`$fromJSON(jsonlite::toJSON(this_object$`natural_gift_type`, auto_unbox = TRUE, digits = NA))
        self$`natural_gift_type` <- `natural_gift_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BerryDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`growth_time` <- this_object$`growth_time`
      self$`max_harvest` <- this_object$`max_harvest`
      self$`natural_gift_power` <- this_object$`natural_gift_power`
      self$`size` <- this_object$`size`
      self$`smoothness` <- this_object$`smoothness`
      self$`soil_dryness` <- this_object$`soil_dryness`
      self$`firmness` <- BerryFirmnessSummary$new()$fromJSON(jsonlite::toJSON(this_object$`firmness`, auto_unbox = TRUE, digits = NA))
      self$`flavors` <- ApiClient$new()$deserializeObj(this_object$`flavors`, "array[BerryDetailFlavorsInner]", loadNamespace("openapi"))
      self$`item` <- ItemSummary$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self$`natural_gift_type` <- TypeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`natural_gift_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BerryDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `name` is missing."))
      }
      # check the required field `growth_time`
      if (!is.null(input_json$`growth_time`)) {
        if (!(is.numeric(input_json$`growth_time`) && length(input_json$`growth_time`) == 1)) {
          stop(paste("Error! Invalid data for `growth_time`. Must be an integer:", input_json$`growth_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `growth_time` is missing."))
      }
      # check the required field `max_harvest`
      if (!is.null(input_json$`max_harvest`)) {
        if (!(is.numeric(input_json$`max_harvest`) && length(input_json$`max_harvest`) == 1)) {
          stop(paste("Error! Invalid data for `max_harvest`. Must be an integer:", input_json$`max_harvest`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `max_harvest` is missing."))
      }
      # check the required field `natural_gift_power`
      if (!is.null(input_json$`natural_gift_power`)) {
        if (!(is.numeric(input_json$`natural_gift_power`) && length(input_json$`natural_gift_power`) == 1)) {
          stop(paste("Error! Invalid data for `natural_gift_power`. Must be an integer:", input_json$`natural_gift_power`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `natural_gift_power` is missing."))
      }
      # check the required field `size`
      if (!is.null(input_json$`size`)) {
        if (!(is.numeric(input_json$`size`) && length(input_json$`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", input_json$`size`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `size` is missing."))
      }
      # check the required field `smoothness`
      if (!is.null(input_json$`smoothness`)) {
        if (!(is.numeric(input_json$`smoothness`) && length(input_json$`smoothness`) == 1)) {
          stop(paste("Error! Invalid data for `smoothness`. Must be an integer:", input_json$`smoothness`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `smoothness` is missing."))
      }
      # check the required field `soil_dryness`
      if (!is.null(input_json$`soil_dryness`)) {
        if (!(is.numeric(input_json$`soil_dryness`) && length(input_json$`soil_dryness`) == 1)) {
          stop(paste("Error! Invalid data for `soil_dryness`. Must be an integer:", input_json$`soil_dryness`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `soil_dryness` is missing."))
      }
      # check the required field `firmness`
      if (!is.null(input_json$`firmness`)) {
        stopifnot(R6::is.R6(input_json$`firmness`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `firmness` is missing."))
      }
      # check the required field `flavors`
      if (!is.null(input_json$`flavors`)) {
        stopifnot(is.vector(input_json$`flavors`), length(input_json$`flavors`) != 0)
        tmp <- sapply(input_json$`flavors`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `flavors` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `item` is missing."))
      }
      # check the required field `natural_gift_type`
      if (!is.null(input_json$`natural_gift_type`)) {
        stopifnot(R6::is.R6(input_json$`natural_gift_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetail: the required field `natural_gift_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BerryDetail
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

      # check if the required `growth_time` is null
      if (is.null(self$`growth_time`)) {
        return(FALSE)
      }

      # check if the required `max_harvest` is null
      if (is.null(self$`max_harvest`)) {
        return(FALSE)
      }

      # check if the required `natural_gift_power` is null
      if (is.null(self$`natural_gift_power`)) {
        return(FALSE)
      }

      # check if the required `size` is null
      if (is.null(self$`size`)) {
        return(FALSE)
      }

      # check if the required `smoothness` is null
      if (is.null(self$`smoothness`)) {
        return(FALSE)
      }

      # check if the required `soil_dryness` is null
      if (is.null(self$`soil_dryness`)) {
        return(FALSE)
      }

      # check if the required `firmness` is null
      if (is.null(self$`firmness`)) {
        return(FALSE)
      }

      # check if the required `flavors` is null
      if (is.null(self$`flavors`)) {
        return(FALSE)
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        return(FALSE)
      }

      # check if the required `natural_gift_type` is null
      if (is.null(self$`natural_gift_type`)) {
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

      # check if the required `growth_time` is null
      if (is.null(self$`growth_time`)) {
        invalid_fields["growth_time"] <- "Non-nullable required field `growth_time` cannot be null."
      }

      # check if the required `max_harvest` is null
      if (is.null(self$`max_harvest`)) {
        invalid_fields["max_harvest"] <- "Non-nullable required field `max_harvest` cannot be null."
      }

      # check if the required `natural_gift_power` is null
      if (is.null(self$`natural_gift_power`)) {
        invalid_fields["natural_gift_power"] <- "Non-nullable required field `natural_gift_power` cannot be null."
      }

      # check if the required `size` is null
      if (is.null(self$`size`)) {
        invalid_fields["size"] <- "Non-nullable required field `size` cannot be null."
      }

      # check if the required `smoothness` is null
      if (is.null(self$`smoothness`)) {
        invalid_fields["smoothness"] <- "Non-nullable required field `smoothness` cannot be null."
      }

      # check if the required `soil_dryness` is null
      if (is.null(self$`soil_dryness`)) {
        invalid_fields["soil_dryness"] <- "Non-nullable required field `soil_dryness` cannot be null."
      }

      # check if the required `firmness` is null
      if (is.null(self$`firmness`)) {
        invalid_fields["firmness"] <- "Non-nullable required field `firmness` cannot be null."
      }

      # check if the required `flavors` is null
      if (is.null(self$`flavors`)) {
        invalid_fields["flavors"] <- "Non-nullable required field `flavors` cannot be null."
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
      }

      # check if the required `natural_gift_type` is null
      if (is.null(self$`natural_gift_type`)) {
        invalid_fields["natural_gift_type"] <- "Non-nullable required field `natural_gift_type` cannot be null."
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
# BerryDetail$unlock()
#
## Below is an example to define the print function
# BerryDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BerryDetail$lock()

