/*
 * TypePastRelationships.h
 *
 * 
 */

#ifndef _TypePastRelationships_H_
#define _TypePastRelationships_H_


#include <string>
#include "GenerationSummary.h"
#include "TypeRelationships.h"
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

class TypePastRelationships : public Object {
public:
	/*! \brief Constructor.
	 */
	TypePastRelationships();
	TypePastRelationships(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypePastRelationships();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The last generation in which the referenced type had the listed damage relations
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced type had the listed damage relations
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get The damage relations the referenced type had up to and including the listed generation
	 */
	TypeRelationships getDamageRelations();

	/*! \brief Set The damage relations the referenced type had up to and including the listed generation
	 */
	void setDamageRelations(TypeRelationships  damage_relations);

private:
	GenerationSummary generation;
	TypeRelationships damage_relations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypePastRelationships_H_ */
