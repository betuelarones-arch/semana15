package com.tecsup.petclinic.mapper;

import com.tecsup.petclinic.dtos.PetDTO;
import com.tecsup.petclinic.entities.Pet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-25T23:55:43-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class PetMapperImpl implements PetMapper {

    @Override
    public Pet mapToEntity(PetDTO petTO) {

        Pet pet = new Pet();

        if ( petTO != null ) {
            pet.setBirthDate( stringToDate( petTO.getBirthDate() ) );
            pet.setId( petTO.getId() );
            pet.setName( petTO.getName() );
            pet.setTypeId( petTO.getTypeId() );
            pet.setOwnerId( petTO.getOwnerId() );
        }

        return pet;
    }

    @Override
    public PetDTO mapToDto(Pet pet) {

        PetDTO.PetDTOBuilder petDTO = PetDTO.builder();

        if ( pet != null ) {
            petDTO.birthDate( dateToString( pet.getBirthDate() ) );
            petDTO.id( pet.getId() );
            petDTO.name( pet.getName() );
            petDTO.typeId( pet.getTypeId() );
            petDTO.ownerId( pet.getOwnerId() );
        }

        return petDTO.build();
    }

    @Override
    public List<PetDTO> mapToDtoList(List<Pet> petList) {
        if ( petList == null ) {
            return new ArrayList<PetDTO>();
        }

        List<PetDTO> list = new ArrayList<PetDTO>( petList.size() );
        for ( Pet pet : petList ) {
            list.add( mapToDto( pet ) );
        }

        return list;
    }

    @Override
    public List<Pet> mapToEntityList(List<PetDTO> petTOList) {
        if ( petTOList == null ) {
            return new ArrayList<Pet>();
        }

        List<Pet> list = new ArrayList<Pet>( petTOList.size() );
        for ( PetDTO petDTO : petTOList ) {
            list.add( mapToEntity( petDTO ) );
        }

        return list;
    }
}
