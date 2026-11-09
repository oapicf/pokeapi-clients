/*
 * EncounterPokemonDetail.h
 *
 * 
 */

#ifndef _EncounterPokemonDetail_H_
#define _EncounterPokemonDetail_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EncounterPokemonDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EncounterPokemonDetail();
	EncounterPokemonDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EncounterPokemonDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The minimum number of perfect IVs, or null if unspecified.
	 */
	int getMinPerfectIvs();

	/*! \brief Set The minimum number of perfect IVs, or null if unspecified.
	 */
	void setMinPerfectIvs(int  min_perfect_ivs);
	/*! \brief Get Whether the encountered Pokémon is always shiny.
	 */
	bool getAlwaysShiny();

	/*! \brief Set Whether the encountered Pokémon is always shiny.
	 */
	void setAlwaysShiny(bool  always_shiny);
	/*! \brief Get Whether the encountered Pokémon can never be shiny.
	 */
	bool getNeverShiny();

	/*! \brief Set Whether the encountered Pokémon can never be shiny.
	 */
	void setNeverShiny(bool  never_shiny);
	/*! \brief Get Whether the encountered Pokémon is an alpha Pokémon.
	 */
	bool getIsAlpha();

	/*! \brief Set Whether the encountered Pokémon is an alpha Pokémon.
	 */
	void setIsAlpha(bool  is_alpha);

private:
	int min_perfect_ivs;
	bool always_shiny;
	bool never_shiny;
	bool is_alpha;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EncounterPokemonDetail_H_ */
