package gtsasil.springframework.sfgpetclinic.services;

import gtsasil.springframework.sfgpetclinic.model.Pet;

public interface PetService extends CrudService <Pet, Long>{

    Pet findByLastName(String lastName);

}
