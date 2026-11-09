
/*
 * PokemonEncounterDetailResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonEncounterDetailResponse_H_
#define TINY_CPP_CLIENT_PokemonEncounterDetailResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterConditionValueSummary.h"
#include "EncounterMethodSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonEncounterDetailResponse{
public:

    /*! \brief Constructor.
	 */
    PokemonEncounterDetailResponse();
    PokemonEncounterDetailResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonEncounterDetailResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Percent chance that this encounter will occur.
	 */
	int getChance();

	/*! \brief Set Percent chance that this encounter will occur.
	 */
	void setChance(int chance);
	/*! \brief Get A list of condition values that must be in effect for this encounter to occur.
	 */
	std::list<EncounterConditionValueSummary> getConditionValues();

	/*! \brief Set A list of condition values that must be in effect for this encounter to occur.
	 */
	void setConditionValues(std::list<EncounterConditionValueSummary> condition_values);
	/*! \brief Get The highest level the Pokémon could be encountered at.
	 */
	int getMaxLevel();

	/*! \brief Set The highest level the Pokémon could be encountered at.
	 */
	void setMaxLevel(int max_level);
	/*! \brief Get The method by which this encounter happens.
	 */
	EncounterMethodSummary getMethod();

	/*! \brief Set The method by which this encounter happens.
	 */
	void setMethod(EncounterMethodSummary method);
	/*! \brief Get The lowest level the Pokémon could be encountered at.
	 */
	int getMinLevel();

	/*! \brief Set The lowest level the Pokémon could be encountered at.
	 */
	void setMinLevel(int min_level);


    private:
    int chance{};
    std::list<EncounterConditionValueSummary> condition_values;
    int max_level{};
    EncounterMethodSummary method;
    int min_level{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonEncounterDetailResponse_H_ */
