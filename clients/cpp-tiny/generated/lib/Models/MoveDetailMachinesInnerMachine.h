
/*
 * MoveDetail_machines_inner_machine.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_machines_inner_machine_H_
#define TINY_CPP_CLIENT_MoveDetail_machines_inner_machine_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDetail_machines_inner_machine{
public:

    /*! \brief Constructor.
	 */
    MoveDetail_machines_inner_machine();
    MoveDetail_machines_inner_machine(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail_machines_inner_machine();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);


    private:
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_machines_inner_machine_H_ */
