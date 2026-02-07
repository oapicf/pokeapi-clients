/*
 * TypeGameIndex.h
 *
 * 
 */

#ifndef _TypeGameIndex_H_
#define _TypeGameIndex_H_


#include <string>
#include "GenerationSummary.h"
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

class TypeGameIndex : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeGameIndex();
	TypeGameIndex(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeGameIndex();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getGameIndex();

	/*! \brief Set 
	 */
	void setGameIndex(int  game_index);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary  generation);

private:
	int game_index;
	GenerationSummary generation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeGameIndex_H_ */
