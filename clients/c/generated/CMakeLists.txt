cmake_minimum_required (VERSION 2.6...3.10.2)
project (CGenerator C)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=implicit-function-declaration")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=missing-declarations")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=int-conversion")

option(BUILD_SHARED_LIBS "Build using shared libraries" ON)

find_package(OpenSSL)

if (OPENSSL_FOUND)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -DOPENSSL")
    if(CMAKE_VERSION VERSION_LESS 3.4)
        include_directories(${OPENSSL_INCLUDE_DIR})
        include_directories(${OPENSSL_INCLUDE_DIRS})
        link_directories(${OPENSSL_LIBRARIES})
    endif()
endif()

set(pkgName "")

# this default version can be overridden in PreTarget.cmake
set(PROJECT_VERSION_MAJOR 0)
set(PROJECT_VERSION_MINOR 0)
set(PROJECT_VERSION_PATCH 1)

if( (DEFINED CURL_INCLUDE_DIR) AND (DEFINED CURL_LIBRARIES))
    include_directories(${CURL_INCLUDE_DIR})
    set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else()
    find_package(CURL 7.58.0 REQUIRED)
    if(CURL_FOUND)
        include_directories(${CURL_INCLUDE_DIR})
        set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
    endif()
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    api/AbilityAPI.c
    api/BerryAPI.c
    api/BerryFirmnessAPI.c
    api/BerryFlavorAPI.c
    api/CharacteristicAPI.c
    api/ContestEffectAPI.c
    api/ContestTypeAPI.c
    api/EggGroupAPI.c
    api/EncounterConditionAPI.c
    api/EncounterConditionValueAPI.c
    api/EncounterMethodAPI.c
    api/EvolutionChainAPI.c
    api/EvolutionTriggerAPI.c
    api/GenderAPI.c
    api/GenerationAPI.c
    api/GrowthRateAPI.c
    api/ItemAPI.c
    api/ItemAttributeAPI.c
    api/ItemCategoryAPI.c
    api/ItemFlingEffectAPI.c
    api/ItemPocketAPI.c
    api/LanguageAPI.c
    api/LocationAPI.c
    api/LocationAreaAPI.c
    api/MachineAPI.c
    api/MoveAPI.c
    api/MoveAilmentAPI.c
    api/MoveBattleStyleAPI.c
    api/MoveCategoryAPI.c
    api/MoveDamageClassAPI.c
    api/MoveLearnMethodAPI.c
    api/MoveTargetAPI.c
    api/NatureAPI.c
    api/PalParkAreaAPI.c
    api/PokeathlonStatAPI.c
    api/PokedexAPI.c
    api/PokemonAPI.c
    api/PokemonColorAPI.c
    api/PokemonFormAPI.c
    api/PokemonHabitatAPI.c
    api/PokemonShapeAPI.c
    api/PokemonSpeciesAPI.c
    api/RegionAPI.c
    api/StatAPI.c
    api/SuperContestEffectAPI.c
    api/TypeAPI.c
    api/VersionAPI.c
    api/VersionGroupAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/any_type.h
    api/AbilityAPI.h
    api/BerryAPI.h
    api/BerryFirmnessAPI.h
    api/BerryFlavorAPI.h
    api/CharacteristicAPI.h
    api/ContestEffectAPI.h
    api/ContestTypeAPI.h
    api/EggGroupAPI.h
    api/EncounterConditionAPI.h
    api/EncounterConditionValueAPI.h
    api/EncounterMethodAPI.h
    api/EvolutionChainAPI.h
    api/EvolutionTriggerAPI.h
    api/GenderAPI.h
    api/GenerationAPI.h
    api/GrowthRateAPI.h
    api/ItemAPI.h
    api/ItemAttributeAPI.h
    api/ItemCategoryAPI.h
    api/ItemFlingEffectAPI.h
    api/ItemPocketAPI.h
    api/LanguageAPI.h
    api/LocationAPI.h
    api/LocationAreaAPI.h
    api/MachineAPI.h
    api/MoveAPI.h
    api/MoveAilmentAPI.h
    api/MoveBattleStyleAPI.h
    api/MoveCategoryAPI.h
    api/MoveDamageClassAPI.h
    api/MoveLearnMethodAPI.h
    api/MoveTargetAPI.h
    api/NatureAPI.h
    api/PalParkAreaAPI.h
    api/PokeathlonStatAPI.h
    api/PokedexAPI.h
    api/PokemonAPI.h
    api/PokemonColorAPI.h
    api/PokemonFormAPI.h
    api/PokemonHabitatAPI.h
    api/PokemonShapeAPI.h
    api/PokemonSpeciesAPI.h
    api/RegionAPI.h
    api/StatAPI.h
    api/SuperContestEffectAPI.h
    api/TypeAPI.h
    api/VersionAPI.h
    api/VersionGroupAPI.h

)

include(PreTarget.cmake OPTIONAL)

set(PROJECT_VERSION_STRING "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")

# Add library with project file with project name as library name
if(NOT BUILD_STATIC_LIBS)
  add_library(${pkgName} ${SRCS} ${HDRS})
else()
  add_library(${pkgName} STATIC ${SRCS} ${HDRS})
endif()
# Link dependent libraries
if(NOT CMAKE_VERSION VERSION_LESS 3.4)
    target_link_libraries(${pkgName} PRIVATE OpenSSL::SSL OpenSSL::Crypto)
endif()
target_link_libraries(${pkgName} PUBLIC ${CURL_LIBRARIES} )
target_include_directories(
    ${pkgName} PUBLIC $<BUILD_INTERFACE:${PROJECT_SOURCE_DIR}>
    $<INSTALL_INTERFACE:include>
)

include(PostTarget.cmake OPTIONAL)

# installation of libraries, headers, and config files
if (NOT EXISTS ${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in)
    install(TARGETS ${pkgName} DESTINATION lib)
else()
    include(GNUInstallDirs)
    install(TARGETS ${pkgName} DESTINATION lib EXPORT ${pkgName}Targets)

    foreach(HDR_FILE ${HDRS})
        get_filename_component(HDR_DIRECTORY ${HDR_FILE} DIRECTORY)
        get_filename_component(ABSOLUTE_HDR_DIRECTORY ${HDR_DIRECTORY} ABSOLUTE)
        file(RELATIVE_PATH RELATIVE_HDR_PATH ${CMAKE_CURRENT_SOURCE_DIR} ${ABSOLUTE_HDR_DIRECTORY})
        install(FILES ${HDR_FILE} DESTINATION include/${pkgName}/${RELATIVE_HDR_PATH})
    endforeach()

    include(CMakePackageConfigHelpers)
    write_basic_package_version_file(
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            VERSION "${PROJECT_VERSION_STRING}"
            COMPATIBILITY AnyNewerVersion
    )

    export(EXPORT ${pkgName}Targets
            FILE "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Targets.cmake"
            NAMESPACE ${pkgName}::
            )

    configure_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            @ONLY
            )

    set(ConfigPackageLocation lib/cmake/${pkgName})
    install(EXPORT ${pkgName}Targets
            FILE
            ${pkgName}Targets.cmake
            NAMESPACE
            ${pkgName}::
            DESTINATION
            ${ConfigPackageLocation}
            )
    install(
            FILES
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            DESTINATION
            ${ConfigPackageLocation}
    )
endif()

# make installation packages
include(Packing.cmake OPTIONAL)

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled library to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-AbilityAPI.c
#    unit-tests/manual-BerryAPI.c
#    unit-tests/manual-BerryFirmnessAPI.c
#    unit-tests/manual-BerryFlavorAPI.c
#    unit-tests/manual-CharacteristicAPI.c
#    unit-tests/manual-ContestEffectAPI.c
#    unit-tests/manual-ContestTypeAPI.c
#    unit-tests/manual-EggGroupAPI.c
#    unit-tests/manual-EncounterConditionAPI.c
#    unit-tests/manual-EncounterConditionValueAPI.c
#    unit-tests/manual-EncounterMethodAPI.c
#    unit-tests/manual-EvolutionChainAPI.c
#    unit-tests/manual-EvolutionTriggerAPI.c
#    unit-tests/manual-GenderAPI.c
#    unit-tests/manual-GenerationAPI.c
#    unit-tests/manual-GrowthRateAPI.c
#    unit-tests/manual-ItemAPI.c
#    unit-tests/manual-ItemAttributeAPI.c
#    unit-tests/manual-ItemCategoryAPI.c
#    unit-tests/manual-ItemFlingEffectAPI.c
#    unit-tests/manual-ItemPocketAPI.c
#    unit-tests/manual-LanguageAPI.c
#    unit-tests/manual-LocationAPI.c
#    unit-tests/manual-LocationAreaAPI.c
#    unit-tests/manual-MachineAPI.c
#    unit-tests/manual-MoveAPI.c
#    unit-tests/manual-MoveAilmentAPI.c
#    unit-tests/manual-MoveBattleStyleAPI.c
#    unit-tests/manual-MoveCategoryAPI.c
#    unit-tests/manual-MoveDamageClassAPI.c
#    unit-tests/manual-MoveLearnMethodAPI.c
#    unit-tests/manual-MoveTargetAPI.c
#    unit-tests/manual-NatureAPI.c
#    unit-tests/manual-PalParkAreaAPI.c
#    unit-tests/manual-PokeathlonStatAPI.c
#    unit-tests/manual-PokedexAPI.c
#    unit-tests/manual-PokemonAPI.c
#    unit-tests/manual-PokemonColorAPI.c
#    unit-tests/manual-PokemonFormAPI.c
#    unit-tests/manual-PokemonHabitatAPI.c
#    unit-tests/manual-PokemonShapeAPI.c
#    unit-tests/manual-PokemonSpeciesAPI.c
#    unit-tests/manual-RegionAPI.c
#    unit-tests/manual-StatAPI.c
#    unit-tests/manual-SuperContestEffectAPI.c
#    unit-tests/manual-TypeAPI.c
#    unit-tests/manual-VersionAPI.c
#    unit-tests/manual-VersionGroupAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable does not support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created library to executable and dependent library curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
