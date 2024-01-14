cmake_minimum_required(VERSION 3.2)

project(QtOpenAPIClient)

find_package(Qt${QT_VERSION_MAJOR} REQUIRED COMPONENTS Core Network Gui)

include(GNUInstallDirs)
include(CMakePackageConfigHelpers)

add_library(${PROJECT_NAME}
  OAIAbilityApi.h
  OAIBerryApi.h
  OAIBerryFirmnessApi.h
  OAIBerryFlavorApi.h
  OAICharacteristicApi.h
  OAIContestEffectApi.h
  OAIContestTypeApi.h
  OAIEggGroupApi.h
  OAIEncounterConditionApi.h
  OAIEncounterConditionValueApi.h
  OAIEncounterMethodApi.h
  OAIEvolutionChainApi.h
  OAIEvolutionTriggerApi.h
  OAIGenderApi.h
  OAIGenerationApi.h
  OAIGrowthRateApi.h
  OAIItemApi.h
  OAIItemAttributeApi.h
  OAIItemCategoryApi.h
  OAIItemFlingEffectApi.h
  OAIItemPocketApi.h
  OAILanguageApi.h
  OAILocationApi.h
  OAILocationAreaApi.h
  OAIMachineApi.h
  OAIMoveApi.h
  OAIMoveAilmentApi.h
  OAIMoveBattleStyleApi.h
  OAIMoveCategoryApi.h
  OAIMoveDamageClassApi.h
  OAIMoveLearnMethodApi.h
  OAIMoveTargetApi.h
  OAINatureApi.h
  OAIPalParkAreaApi.h
  OAIPokeathlonStatApi.h
  OAIPokedexApi.h
  OAIPokemonApi.h
  OAIPokemonColorApi.h
  OAIPokemonFormApi.h
  OAIPokemonHabitatApi.h
  OAIPokemonShapeApi.h
  OAIPokemonSpeciesApi.h
  OAIRegionApi.h
  OAIStatApi.h
  OAISuperContestEffectApi.h
  OAITypeApi.h
  OAIVersionApi.h
  OAIVersionGroupApi.h
  OAIHelpers.h
  OAIHttpRequest.h
  OAIObject.h
  OAIEnum.h
  OAIHttpFileElement.h
  OAIServerConfiguration.h
  OAIServerVariable.h
  OAIOauth.h
  OAIAbilityApi.cpp
  OAIBerryApi.cpp
  OAIBerryFirmnessApi.cpp
  OAIBerryFlavorApi.cpp
  OAICharacteristicApi.cpp
  OAIContestEffectApi.cpp
  OAIContestTypeApi.cpp
  OAIEggGroupApi.cpp
  OAIEncounterConditionApi.cpp
  OAIEncounterConditionValueApi.cpp
  OAIEncounterMethodApi.cpp
  OAIEvolutionChainApi.cpp
  OAIEvolutionTriggerApi.cpp
  OAIGenderApi.cpp
  OAIGenerationApi.cpp
  OAIGrowthRateApi.cpp
  OAIItemApi.cpp
  OAIItemAttributeApi.cpp
  OAIItemCategoryApi.cpp
  OAIItemFlingEffectApi.cpp
  OAIItemPocketApi.cpp
  OAILanguageApi.cpp
  OAILocationApi.cpp
  OAILocationAreaApi.cpp
  OAIMachineApi.cpp
  OAIMoveApi.cpp
  OAIMoveAilmentApi.cpp
  OAIMoveBattleStyleApi.cpp
  OAIMoveCategoryApi.cpp
  OAIMoveDamageClassApi.cpp
  OAIMoveLearnMethodApi.cpp
  OAIMoveTargetApi.cpp
  OAINatureApi.cpp
  OAIPalParkAreaApi.cpp
  OAIPokeathlonStatApi.cpp
  OAIPokedexApi.cpp
  OAIPokemonApi.cpp
  OAIPokemonColorApi.cpp
  OAIPokemonFormApi.cpp
  OAIPokemonHabitatApi.cpp
  OAIPokemonShapeApi.cpp
  OAIPokemonSpeciesApi.cpp
  OAIRegionApi.cpp
  OAIStatApi.cpp
  OAISuperContestEffectApi.cpp
  OAITypeApi.cpp
  OAIVersionApi.cpp
  OAIVersionGroupApi.cpp
  OAIHelpers.cpp
  OAIHttpRequest.cpp
  OAIHttpFileElement.cpp
  OAIOauth.cpp
  )

target_include_directories(${PROJECT_NAME}
    PUBLIC
        $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
        $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}>
)

target_link_libraries(${PROJECT_NAME}
    PUBLIC
        Qt${QT_VERSION_MAJOR}::Core
        Qt${QT_VERSION_MAJOR}::Network
        Qt${QT_VERSION_MAJOR}::Gui

)

configure_package_config_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
    "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    INSTALL_DESTINATION "${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}"
)

install(
    TARGETS ${PROJECT_NAME}
    EXPORT ${PROJECT_NAME}Targets
    LIBRARY DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    RUNTIME DESTINATION "${CMAKE_INSTALL_BINDIR}"
    INCLUDES DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}"
)

install(
    FILES ${HEADER_FILES}
    DESTINATION ${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}
)

install(
    FILES "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)

install(
    EXPORT ${PROJECT_NAME}Targets
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)
