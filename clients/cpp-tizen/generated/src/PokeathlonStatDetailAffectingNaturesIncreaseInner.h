/*
 * PokeathlonStatDetail_affecting_natures_increase_inner.h
 *
 * 
 */

#ifndef _PokeathlonStatDetail_affecting_natures_increase_inner_H_
#define _PokeathlonStatDetail_affecting_natures_increase_inner_H_


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

class PokeathlonStatDetail_affecting_natures_increase_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeathlonStatDetail_affecting_natures_increase_inner();
	PokeathlonStatDetail_affecting_natures_increase_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeathlonStatDetail_affecting_natures_increase_inner();

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
	AbilityDetail_pokemon_inner_pokemon getNature();

	/*! \brief Set 
	 */
	void setNature(AbilityDetail_pokemon_inner_pokemon  nature);

private:
	int max_change;
	AbilityDetail_pokemon_inner_pokemon nature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatDetail_affecting_natures_increase_inner_H_ */
