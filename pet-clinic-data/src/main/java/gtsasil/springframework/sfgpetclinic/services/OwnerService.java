package gtsasil.springframework.sfgpetclinic.services;

import gtsasil.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
