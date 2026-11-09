
/*
 * EncounterPokemonDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EncounterPokemonDetail_H_
#define TINY_CPP_CLIENT_EncounterPokemonDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EncounterPokemonDetail{
public:

    /*! \brief Constructor.
	 */
    EncounterPokemonDetail();
    EncounterPokemonDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EncounterPokemonDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The minimum number of perfect IVs, or null if unspecified.
	 */
	int getMinPerfectIvs();

	/*! \brief Set The minimum number of perfect IVs, or null if unspecified.
	 */
	void setMinPerfectIvs(int min_perfect_ivs);
	/*! \brief Get Whether the encountered Pokémon is always shiny.
	 */
	bool isAlwaysShiny();

	/*! \brief Set Whether the encountered Pokémon is always shiny.
	 */
	void setAlwaysShiny(bool always_shiny);
	/*! \brief Get Whether the encountered Pokémon can never be shiny.
	 */
	bool isNeverShiny();

	/*! \brief Set Whether the encountered Pokémon can never be shiny.
	 */
	void setNeverShiny(bool never_shiny);
	/*! \brief Get Whether the encountered Pokémon is an alpha Pokémon.
	 */
	bool isIsAlpha();

	/*! \brief Set Whether the encountered Pokémon is an alpha Pokémon.
	 */
	void setIsAlpha(bool is_alpha);


    private:
    int min_perfect_ivs{};
    bool always_shiny{};
    bool never_shiny{};
    bool is_alpha{};
};
}

#endif /* TINY_CPP_CLIENT_EncounterPokemonDetail_H_ */
