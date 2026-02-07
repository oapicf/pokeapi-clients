/*
 * StatDetail_affecting_moves_increase_inner.h
 *
 * 
 */

#ifndef _StatDetail_affecting_moves_increase_inner_H_
#define _StatDetail_affecting_moves_increase_inner_H_


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

class StatDetail_affecting_moves_increase_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	StatDetail_affecting_moves_increase_inner();
	StatDetail_affecting_moves_increase_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatDetail_affecting_moves_increase_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getChange();

	/*! \brief Set 
	 */
	void setChange(int  change);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMove();

	/*! \brief Set 
	 */
	void setMove(AbilityDetail_pokemon_inner_pokemon  move);

private:
	int change;
	AbilityDetail_pokemon_inner_pokemon move;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatDetail_affecting_moves_increase_inner_H_ */
