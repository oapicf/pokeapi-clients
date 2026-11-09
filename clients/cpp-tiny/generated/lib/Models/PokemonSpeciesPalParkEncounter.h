
/*
 * PokemonSpeciesPalParkEncounter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesPalParkEncounter_H_
#define TINY_CPP_CLIENT_PokemonSpeciesPalParkEncounter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PalParkAreaSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpeciesPalParkEncounter{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesPalParkEncounter();
    PokemonSpeciesPalParkEncounter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesPalParkEncounter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The base score given to the player when the referenced Pokémon is caught during a pal park run.
	 */
	int getBaseScore();

	/*! \brief Set The base score given to the player when the referenced Pokémon is caught during a pal park run.
	 */
	void setBaseScore(int base_score);
	/*! \brief Get The base rate for encountering the referenced Pokémon in this pal park area.
	 */
	int getRate();

	/*! \brief Set The base rate for encountering the referenced Pokémon in this pal park area.
	 */
	void setRate(int rate);
	/*! \brief Get The pal park area where this encounter happens.
	 */
	PalParkAreaSummary getArea();

	/*! \brief Set The pal park area where this encounter happens.
	 */
	void setArea(PalParkAreaSummary area);


    private:
    int base_score{};
    int rate{};
    PalParkAreaSummary area;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesPalParkEncounter_H_ */
