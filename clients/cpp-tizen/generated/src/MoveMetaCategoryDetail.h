/*
 * MoveMetaCategoryDetail.h
 *
 * 
 */

#ifndef _MoveMetaCategoryDetail_H_
#define _MoveMetaCategoryDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveMetaCategoryDescription.h"
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

class MoveMetaCategoryDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMetaCategoryDetail();
	MoveMetaCategoryDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMetaCategoryDetail();

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
	std::list<MoveMetaCategoryDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveMetaCategoryDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves);

private:
	int id;
	std::string name;
	std::list <MoveMetaCategoryDescription>descriptions;
	std::list <AbilityDetail_pokemon_inner_pokemon>moves;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMetaCategoryDetail_H_ */
