package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetailMachinesInner   {

    private URI machine;
    private AbilityDetailPokemonInnerPokemon versionGroup;

    /**
     * Default constructor.
     */
    public ItemDetailMachinesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetailMachinesInner.
     *
     * @param machine machine
     * @param versionGroup versionGroup
     */
    public ItemDetailMachinesInner(
        URI machine, 
        AbilityDetailPokemonInnerPokemon versionGroup
    ) {
        this.machine = machine;
        this.versionGroup = versionGroup;
    }



    /**
     * Get machine
     * @return machine
     */
    public URI getMachine() {
        return machine;
    }

    public void setMachine(URI machine) {
        this.machine = machine;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public AbilityDetailPokemonInnerPokemon getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetailMachinesInner {\n");
        
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

