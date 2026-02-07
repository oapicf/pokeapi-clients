/*
 * PokemonGameIndex.h
 *
 * 
 */

#ifndef _PokemonGameIndex_H_
#define _PokemonGameIndex_H_


#include <string>
#include "VersionSummary.h"
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

class PokemonGameIndex : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonGameIndex();
	PokemonGameIndex(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonGameIndex();

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
	VersionSummary getVersion();

	/*! \brief Set 
	 */
	void setVersion(VersionSummary  version);

private:
	int game_index;
	VersionSummary version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonGameIndex_H_ */
