
/*
 * LocationAreaEncounterDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaEncounterDetail_H_
#define TINY_CPP_CLIENT_LocationAreaEncounterDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterConditionValueSummary.h"
#include "EncounterMethodSummary.h"
#include "EncounterPokemonDetail.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaEncounterDetail{
public:

    /*! \brief Constructor.
	 */
    LocationAreaEncounterDetail();
    LocationAreaEncounterDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaEncounterDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The lowest level the Pokémon could be encountered at.
	 */
	int getMinLevel();

	/*! \brief Set The lowest level the Pokémon could be encountered at.
	 */
	void setMinLevel(int min_level);
	/*! \brief Get The highest level the Pokémon could be encountered at.
	 */
	int getMaxLevel();

	/*! \brief Set The highest level the Pokémon could be encountered at.
	 */
	void setMaxLevel(int max_level);
	/*! \brief Get Percent chance that this encounter will occur.
	 */
	int getChance();

	/*! \brief Set Percent chance that this encounter will occur.
	 */
	void setChance(int chance);
	/*! \brief Get The method by which this encounter happens.
	 */
	EncounterMethodSummary getMethod();

	/*! \brief Set The method by which this encounter happens.
	 */
	void setMethod(EncounterMethodSummary method);
	/*! \brief Get A list of condition values that must be in effect for this encounter to occur.
	 */
	std::list<EncounterConditionValueSummary> getConditionValues();

	/*! \brief Set A list of condition values that must be in effect for this encounter to occur.
	 */
	void setConditionValues(std::list<EncounterConditionValueSummary> condition_values);
	/*! \brief Get Additional properties of the encountered Pokémon, or null if unspecified.
	 */
	EncounterPokemonDetail getPokemonDetails();

	/*! \brief Set Additional properties of the encountered Pokémon, or null if unspecified.
	 */
	void setPokemonDetails(EncounterPokemonDetail pokemon_details);


    private:
    int min_level{};
    int max_level{};
    int chance{};
    EncounterMethodSummary method;
    std::list<EncounterConditionValueSummary> condition_values;
    EncounterPokemonDetail pokemon_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaEncounterDetail_H_ */
