/*
 * MoveMetaAilmentDetail.h
 *
 * 
 */

#ifndef _MoveMetaAilmentDetail_H_
#define _MoveMetaAilmentDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveMetaAilmentName.h"
#include <list>
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

class MoveMetaAilmentDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMetaAilmentDetail();
	MoveMetaAilmentDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMetaAilmentDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves);
	/*! \brief Get 
	 */
	std::list<MoveMetaAilmentName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveMetaAilmentName> names);

private:
	int id;
	std::string name;
	std::list <AbilityDetail_pokemon_inner_pokemon>moves;
	std::list <MoveMetaAilmentName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMetaAilmentDetail_H_ */
