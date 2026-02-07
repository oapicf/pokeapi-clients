/*
 * NatureDetail_pokeathlon_stat_changes_inner.h
 *
 * 
 */

#ifndef _NatureDetail_pokeathlon_stat_changes_inner_H_
#define _NatureDetail_pokeathlon_stat_changes_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class NatureDetail_pokeathlon_stat_changes_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	NatureDetail_pokeathlon_stat_changes_inner();
	NatureDetail_pokeathlon_stat_changes_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NatureDetail_pokeathlon_stat_changes_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getMaxChange();

	/*! \brief Set 
	 */
	void setMaxChange(int  max_change);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokeathlonStat();

	/*! \brief Set 
	 */
	void setPokeathlonStat(AbilityDetail_pokemon_inner_pokemon  pokeathlon_stat);

private:
	int max_change;
	AbilityDetail_pokemon_inner_pokemon pokeathlon_stat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NatureDetail_pokeathlon_stat_changes_inner_H_ */
