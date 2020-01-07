package gtsasil.springframework.sfgpetclinic.services;

import gtsasil.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
