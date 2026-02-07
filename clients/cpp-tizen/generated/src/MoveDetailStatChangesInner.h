/*
 * MoveDetail_stat_changes_inner.h
 *
 * 
 */

#ifndef _MoveDetail_stat_changes_inner_H_
#define _MoveDetail_stat_changes_inner_H_


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

class MoveDetail_stat_changes_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail_stat_changes_inner();
	MoveDetail_stat_changes_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail_stat_changes_inner();

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
	AbilityDetail_pokemon_inner_pokemon getStat();

	/*! \brief Set 
	 */
	void setStat(AbilityDetail_pokemon_inner_pokemon  stat);

private:
	int change;
	AbilityDetail_pokemon_inner_pokemon stat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_stat_changes_inner_H_ */
